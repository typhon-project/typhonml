package org.typhon.client.test;

import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.hateoas.PagedResources;
import org.typhon.client.model.*;
import org.typhon.client.service.*;

public class UserServiceTest {
	UserService userService;
	OrderService orderService;

	@Before
	public void init() {
		userService = new UserService("http://localhost:8080");
		orderService = new OrderService("http://localhost:8080");
	}

	//Stub for object creation
	@Test
	public void testCreateUser() {
		User objToCreate = new User();
		//TODO set the objToCreate attributes
		
		userService.create(objToCreate);
	}
		
	@Test
	public void testFindAll() {
		assertNotNull(userService.findAll(1,5,"ASC"));
		PagedResources<User> v = userService.findAll(1,5,"ASC");
		v.getLinks();
	}
	
}

	
