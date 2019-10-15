package org.typhon.client.test;

import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.hateoas.PagedResources;
import org.typhon.client.model.*;
import org.typhon.client.service.*;

public class ReviewServiceTest {
	ReviewService reviewService;
	CommentService commentService;
	ProductService productService;

	@Before
	public void init() {
		reviewService = new ReviewService("http://localhost:8080");
		commentService = new CommentService("http://localhost:8080");
		productService = new ProductService("http://localhost:8080");
	}

	//Stub for object creation
	@Test
	public void testCreateReview() {
		Review objToCreate = new Review();
		//TODO set the objToCreate attributes
		
		reviewService.create(objToCreate);
	}
		
	@Test
	public void testFindAll() {
		assertNotNull(reviewService.findAll(1,5,"ASC"));
		PagedResources<Review> v = reviewService.findAll(1,5,"ASC");
		v.getLinks();
	}
	
}

	
