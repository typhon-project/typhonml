package org.typhon.client.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.MediaTypes;
import org.springframework.hateoas.PagedResources;
import org.springframework.hateoas.hal.Jackson2HalModule;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import org.typhon.client.model.User;
import org.typhon.client.model.dto.UserDTO;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

public class UserService {
	private static final Logger logger = LoggerFactory.getLogger(UserService.class);
	private String baseUrl;
	ModelMapper modelMapper;
	private RestTemplate restTemplate;

	public UserService(String baseUrl) {
		this.baseUrl = baseUrl;
		restTemplate = restTemplate();
		modelMapper = new ModelMapper();
	}

	RestTemplate restTemplate() {
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.registerModule(new Jackson2HalModule());
		objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		MappingJackson2HttpMessageConverter messageConverter = new MappingJackson2HttpMessageConverter();
		messageConverter.setObjectMapper(objectMapper);
		messageConverter.setSupportedMediaTypes(Arrays.asList(MediaTypes.HAL_JSON));
		return new RestTemplate(Arrays.asList(messageConverter));
	}

	public User findById(int id) {
		UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(baseUrl + "/user/" + id);
		String uriBuilder = builder.build().encode().toUriString();
		UserDTO userDTO = restTemplate
				.exchange(uriBuilder, HttpMethod.GET, null, new ParameterizedTypeReference<UserDTO>() {
				}).getBody();
		User user = modelMapper.map(userDTO, User.class);
		return user;
	}
	
	public void delete(User objToDelete) {
		try {
			UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(baseUrl + "/user/" + objToDelete.getId());
			String uriBuilder = builder.build().encode().toUriString();
			restTemplate.delete(uriBuilder);
		}
		catch(HttpClientErrorException e) {
			logger.error(e.getMessage());
		}
	}

	public PagedResources<User> findAll(int page, int size, String order) {
		UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(baseUrl + "/user").queryParam("page", page)
				.queryParam("size", size).queryParam("order", order);
		String uriBuilder = builder.build().encode().toUriString();
		PagedResources<UserDTO> queryResult = restTemplate.exchange(uriBuilder, HttpMethod.GET, null,
				new ParameterizedTypeReference<PagedResources<UserDTO>>() {
				}).getBody();
		List<User> objList = new ArrayList<User>();
		queryResult.forEach(z -> objList.add(modelMapper.map(z, User.class)));
		PagedResources<User> result = new PagedResources<User>(objList, queryResult.getMetadata(),
				new ArrayList<Link>());
		return result;
	}

	public User create(User objToCreate) {
		UserDTO p = modelMapper.map(objToCreate, UserDTO.class);
		HttpEntity<UserDTO> request = new HttpEntity<>(p);
		UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(baseUrl + "/user");
		String uriBuilder = builder.build().encode().toUriString();
		ResponseEntity<UserDTO> response = restTemplate.exchange(uriBuilder, HttpMethod.POST, request, UserDTO.class);
		UserDTO foo = response.getBody();
		objToCreate = modelMapper.map(foo, User.class);
		return objToCreate;
	}	
	
	public User update(User objToUpdate) {
		UserDTO p = modelMapper.map(objToUpdate, UserDTO.class);
		HttpEntity<UserDTO> request = new HttpEntity<>(p);
		UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(baseUrl + "/user/" + objToUpdate.getId());
		String uriBuilder = builder.build().encode().toUriString();
		ResponseEntity<UserDTO> response = restTemplate.exchange(uriBuilder, HttpMethod.PUT, request, UserDTO.class);
		UserDTO foo = response.getBody();
		objToUpdate = modelMapper.map(foo, User.class);
		return objToUpdate;
	}
}
