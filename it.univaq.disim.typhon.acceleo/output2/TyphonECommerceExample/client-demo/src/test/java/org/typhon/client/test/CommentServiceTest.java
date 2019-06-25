package org.typhon.client.test;

import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.hateoas.PagedResources;
import org.typhon.client.model.*;
import org.typhon.client.service.*;

public class CommentServiceTest {
	CommentService commentService;
	CommentService commentService;

	@Before
	public void init() {
		commentService = new CommentService("http://localhost:8080");
		commentService = new CommentService("http://localhost:8080");
	}

	//Stub for object creation
	@Test
	public void testCreateComment() {
		Comment objToCreate = new Comment();
		//TODO set the objToCreate attributes
		
		commentService.create(objToCreate);
	}
		
	@Test
	public void testFindAll() {
		assertNotNull(commentService.findAll(1,5,"ASC"));
		PagedResources<Comment> v = commentService.findAll(1,5,"ASC");
		v.getLinks();
	}
	
}

	
