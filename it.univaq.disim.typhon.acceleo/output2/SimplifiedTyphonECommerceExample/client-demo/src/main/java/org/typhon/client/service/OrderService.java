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
import org.typhon.client.model.Order;
import org.typhon.client.model.dto.OrderDTO;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

public class OrderService {
	private static final Logger logger = LoggerFactory.getLogger(OrderService.class);
	private String baseUrl;
	ModelMapper modelMapper;
	private RestTemplate restTemplate;

	public OrderService(String baseUrl) {
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

	public Order findById(String id) {
		UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(baseUrl + "/order/" + id);
		String uriBuilder = builder.build().encode().toUriString();
		OrderDTO orderDTO = restTemplate
				.exchange(uriBuilder, HttpMethod.GET, null, new ParameterizedTypeReference<OrderDTO>() {
				}).getBody();
		Order order = modelMapper.map(orderDTO, Order.class);
		return order;
	}
	
	public void delete(Order objToDelete) {
		try {
			UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(baseUrl + "/order/" + objToDelete.getId());
			String uriBuilder = builder.build().encode().toUriString();
			restTemplate.delete(uriBuilder);
		}
		catch(HttpClientErrorException e) {
			logger.error(e.getMessage());
		}
	}

	public PagedResources<Order> findAll(int page, int size, String order) {
		UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(baseUrl + "/order").queryParam("page", page)
				.queryParam("size", size).queryParam("order", order);
		String uriBuilder = builder.build().encode().toUriString();
		PagedResources<OrderDTO> queryResult = restTemplate.exchange(uriBuilder, HttpMethod.GET, null,
				new ParameterizedTypeReference<PagedResources<OrderDTO>>() {
				}).getBody();
		List<Order> objList = new ArrayList<Order>();
		queryResult.forEach(z -> objList.add(modelMapper.map(z, Order.class)));
		PagedResources<Order> result = new PagedResources<Order>(objList, queryResult.getMetadata(),
				new ArrayList<Link>());
		return result;
	}

	public Order create(Order objToCreate) {
		OrderDTO p = modelMapper.map(objToCreate, OrderDTO.class);
		HttpEntity<OrderDTO> request = new HttpEntity<>(p);
		UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(baseUrl + "/order");
		String uriBuilder = builder.build().encode().toUriString();
		ResponseEntity<OrderDTO> response = restTemplate.exchange(uriBuilder, HttpMethod.POST, request, OrderDTO.class);
		OrderDTO foo = response.getBody();
		objToCreate = modelMapper.map(foo, Order.class);
		return objToCreate;
	}	
	
	public Order update(Order objToUpdate) {
		OrderDTO p = modelMapper.map(objToUpdate, OrderDTO.class);
		HttpEntity<OrderDTO> request = new HttpEntity<>(p);
		UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(baseUrl + "/order/" + objToUpdate.getId());
		String uriBuilder = builder.build().encode().toUriString();
		ResponseEntity<OrderDTO> response = restTemplate.exchange(uriBuilder, HttpMethod.PUT, request, OrderDTO.class);
		OrderDTO foo = response.getBody();
		objToUpdate = modelMapper.map(foo, Order.class);
		return objToUpdate;
	}
}
