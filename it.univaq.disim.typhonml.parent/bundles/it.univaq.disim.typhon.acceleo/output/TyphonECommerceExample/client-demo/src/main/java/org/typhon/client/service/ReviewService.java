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
import org.typhon.client.model.Review;
import org.typhon.client.model.dto.ReviewDTO;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ReviewService {
	private static final Logger logger = LoggerFactory.getLogger(ReviewService.class);
	private String baseUrl;
	ModelMapper modelMapper;
	private RestTemplate restTemplate;

	public ReviewService(String baseUrl) {
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

	public Review findById(String id) {
		UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(baseUrl + "/review/" + id);
		String uriBuilder = builder.build().encode().toUriString();
		ReviewDTO reviewDTO = restTemplate
				.exchange(uriBuilder, HttpMethod.GET, null, new ParameterizedTypeReference<ReviewDTO>() {
				}).getBody();
		Review review = modelMapper.map(reviewDTO, Review.class);
		return review;
	}
	
	public void delete(Review objToDelete) {
		try {
			UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(baseUrl + "/review/" + objToDelete.getId());
			String uriBuilder = builder.build().encode().toUriString();
			restTemplate.delete(uriBuilder);
		}
		catch(HttpClientErrorException e) {
			logger.error(e.getMessage());
		}
	}

	public PagedResources<Review> findAll(int page, int size, String order) {
		UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(baseUrl + "/review").queryParam("page", page)
				.queryParam("size", size).queryParam("order", order);
		String uriBuilder = builder.build().encode().toUriString();
		PagedResources<ReviewDTO> queryResult = restTemplate.exchange(uriBuilder, HttpMethod.GET, null,
				new ParameterizedTypeReference<PagedResources<ReviewDTO>>() {
				}).getBody();
		List<Review> objList = new ArrayList<Review>();
		queryResult.forEach(z -> objList.add(modelMapper.map(z, Review.class)));
		PagedResources<Review> result = new PagedResources<Review>(objList, queryResult.getMetadata(),
				new ArrayList<Link>());
		return result;
	}

	public Review create(Review objToCreate) {
		ReviewDTO p = modelMapper.map(objToCreate, ReviewDTO.class);
		HttpEntity<ReviewDTO> request = new HttpEntity<>(p);
		UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(baseUrl + "/review");
		String uriBuilder = builder.build().encode().toUriString();
		ResponseEntity<ReviewDTO> response = restTemplate.exchange(uriBuilder, HttpMethod.POST, request, ReviewDTO.class);
		ReviewDTO foo = response.getBody();
		objToCreate = modelMapper.map(foo, Review.class);
		return objToCreate;
	}	
	
	public Review update(Review objToUpdate) {
		ReviewDTO p = modelMapper.map(objToUpdate, ReviewDTO.class);
		HttpEntity<ReviewDTO> request = new HttpEntity<>(p);
		UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(baseUrl + "/review/" + objToUpdate.getId());
		String uriBuilder = builder.build().encode().toUriString();
		ResponseEntity<ReviewDTO> response = restTemplate.exchange(uriBuilder, HttpMethod.PUT, request, ReviewDTO.class);
		ReviewDTO foo = response.getBody();
		objToUpdate = modelMapper.map(foo, Review.class);
		return objToUpdate;
	}
}
