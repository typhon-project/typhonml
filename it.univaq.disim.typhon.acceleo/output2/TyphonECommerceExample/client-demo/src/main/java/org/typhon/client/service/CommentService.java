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
import org.typhon.client.model.Comment;
import org.typhon.client.model.dto.CommentDTO;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

public class CommentService {
	private static final Logger logger = LoggerFactory.getLogger(CommentService.class);
	private String baseUrl;
	ModelMapper modelMapper;
	private RestTemplate restTemplate;

	public CommentService(String baseUrl) {
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

	public Comment findById(int id) {
		UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(baseUrl + "/comment/" + id);
		String uriBuilder = builder.build().encode().toUriString();
		CommentDTO commentDTO = restTemplate
				.exchange(uriBuilder, HttpMethod.GET, null, new ParameterizedTypeReference<CommentDTO>() {
				}).getBody();
		Comment comment = modelMapper.map(commentDTO, Comment.class);
		return comment;
	}
	
	public void delete(Comment objToDelete) {
		try {
			UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(baseUrl + "/comment/" + objToDelete.getId());
			String uriBuilder = builder.build().encode().toUriString();
			restTemplate.delete(uriBuilder);
		}
		catch(HttpClientErrorException e) {
			logger.error(e.getMessage());
		}
	}

	public PagedResources<Comment> findAll(int page, int size, String order) {
		UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(baseUrl + "/comment").queryParam("page", page)
				.queryParam("size", size).queryParam("order", order);
		String uriBuilder = builder.build().encode().toUriString();
		PagedResources<CommentDTO> queryResult = restTemplate.exchange(uriBuilder, HttpMethod.GET, null,
				new ParameterizedTypeReference<PagedResources<CommentDTO>>() {
				}).getBody();
		List<Comment> objList = new ArrayList<Comment>();
		queryResult.forEach(z -> objList.add(modelMapper.map(z, Comment.class)));
		PagedResources<Comment> result = new PagedResources<Comment>(objList, queryResult.getMetadata(),
				new ArrayList<Link>());
		return result;
	}

	public Comment create(Comment objToCreate) {
		CommentDTO p = modelMapper.map(objToCreate, CommentDTO.class);
		HttpEntity<CommentDTO> request = new HttpEntity<>(p);
		UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(baseUrl + "/comment");
		String uriBuilder = builder.build().encode().toUriString();
		ResponseEntity<CommentDTO> response = restTemplate.exchange(uriBuilder, HttpMethod.POST, request, CommentDTO.class);
		CommentDTO foo = response.getBody();
		objToCreate = modelMapper.map(foo, Comment.class);
		return objToCreate;
	}	
	
	public Comment update(Comment objToUpdate) {
		CommentDTO p = modelMapper.map(objToUpdate, CommentDTO.class);
		HttpEntity<CommentDTO> request = new HttpEntity<>(p);
		UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(baseUrl + "/comment/" + objToUpdate.getId());
		String uriBuilder = builder.build().encode().toUriString();
		ResponseEntity<CommentDTO> response = restTemplate.exchange(uriBuilder, HttpMethod.PUT, request, CommentDTO.class);
		CommentDTO foo = response.getBody();
		objToUpdate = modelMapper.map(foo, Comment.class);
		return objToUpdate;
	}
}
