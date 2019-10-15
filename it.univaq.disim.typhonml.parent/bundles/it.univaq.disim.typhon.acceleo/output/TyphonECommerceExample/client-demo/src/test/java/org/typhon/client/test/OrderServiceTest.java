package org.typhon.client.test;

import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.hateoas.PagedResources;
import org.typhon.client.model.*;
import org.typhon.client.service.*;

public class OrderServiceTest {
	OrderService orderService;
	ProductService orderproductsService;

	@Before
	public void init() {
		orderService = new OrderService("http://localhost:8080");
		orderproductsService = new ProductService("http://localhost:8080");
	}

	//Stub for object creation
	@Test
	public void testCreateOrder() {
		Order objToCreate = new Order();
		//TODO set the objToCreate attributes
		
		orderService.create(objToCreate);
	}
		
	@Test
	public void testFindAll() {
		assertNotNull(orderService.findAll(1,5,"ASC"));
		PagedResources<Order> v = orderService.findAll(1,5,"ASC");
		v.getLinks();
	}
	
}

	
