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
import org.typhon.client.model.Product;
import org.typhon.client.model.dto.ProductDTO;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ProductService {
	private static final Logger logger = LoggerFactory.getLogger(ProductService.class);
	private String baseUrl;
	ModelMapper modelMapper;
	private RestTemplate restTemplate;

	public ProductService(String baseUrl) {
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

	public Product findById(int id) {
		UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(baseUrl + "/product/" + id);
		String uriBuilder = builder.build().encode().toUriString();
		ProductDTO productDTO = restTemplate
				.exchange(uriBuilder, HttpMethod.GET, null, new ParameterizedTypeReference<ProductDTO>() {
				}).getBody();
		Product product = modelMapper.map(productDTO, Product.class);
		return product;
	}
	
	public void delete(Product objToDelete) {
		try {
			UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(baseUrl + "/product/" + objToDelete.getId());
			String uriBuilder = builder.build().encode().toUriString();
			restTemplate.delete(uriBuilder);
		}
		catch(HttpClientErrorException e) {
			logger.error(e.getMessage());
		}
	}

	public PagedResources<Product> findAll(int page, int size, String order) {
		UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(baseUrl + "/product").queryParam("page", page)
				.queryParam("size", size).queryParam("order", order);
		String uriBuilder = builder.build().encode().toUriString();
		PagedResources<ProductDTO> queryResult = restTemplate.exchange(uriBuilder, HttpMethod.GET, null,
				new ParameterizedTypeReference<PagedResources<ProductDTO>>() {
				}).getBody();
		List<Product> objList = new ArrayList<Product>();
		queryResult.forEach(z -> objList.add(modelMapper.map(z, Product.class)));
		PagedResources<Product> result = new PagedResources<Product>(objList, queryResult.getMetadata(),
				new ArrayList<Link>());
		return result;
	}

	public Product create(Product objToCreate) {
		ProductDTO p = modelMapper.map(objToCreate, ProductDTO.class);
		HttpEntity<ProductDTO> request = new HttpEntity<>(p);
		UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(baseUrl + "/product");
		String uriBuilder = builder.build().encode().toUriString();
		ResponseEntity<ProductDTO> response = restTemplate.exchange(uriBuilder, HttpMethod.POST, request, ProductDTO.class);
		ProductDTO foo = response.getBody();
		objToCreate = modelMapper.map(foo, Product.class);
		return objToCreate;
	}	
	
	public Product update(Product objToUpdate) {
		ProductDTO p = modelMapper.map(objToUpdate, ProductDTO.class);
		HttpEntity<ProductDTO> request = new HttpEntity<>(p);
		UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(baseUrl + "/product/" + objToUpdate.getId());
		String uriBuilder = builder.build().encode().toUriString();
		ResponseEntity<ProductDTO> response = restTemplate.exchange(uriBuilder, HttpMethod.PUT, request, ProductDTO.class);
		ProductDTO foo = response.getBody();
		objToUpdate = modelMapper.map(foo, Product.class);
		return objToUpdate;
	}
}
