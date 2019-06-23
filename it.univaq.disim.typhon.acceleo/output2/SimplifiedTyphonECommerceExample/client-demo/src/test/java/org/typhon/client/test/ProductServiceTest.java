package org.typhon.client.test;

import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.hateoas.PagedResources;
import org.typhon.client.model.*;
import org.typhon.client.service.*;

public class ProductServiceTest {
	ProductService productService;
	OrderService orderService;

	@Before
	public void init() {
		productService = new ProductService("http://localhost:8080");
		orderService = new OrderService("http://localhost:8080");
	}

	//Stub for object creation
	@Test
	public void testCreateProduct() {
		Product objToCreate = new Product();
		//TODO set the objToCreate attributes
		
		productService.create(objToCreate);
	}
		
	@Test
	public void testFindAll() {
		assertNotNull(productService.findAll(1,5,"ASC"));
		PagedResources<Product> v = productService.findAll(1,5,"ASC");
		v.getLinks();
	}
	
}

	
