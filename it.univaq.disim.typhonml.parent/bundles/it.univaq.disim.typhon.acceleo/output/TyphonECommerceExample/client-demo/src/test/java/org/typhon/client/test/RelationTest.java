	
package org.typhon.client.test;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.typhon.client.model.*;
import org.typhon.client.service.*;

public class RelationTest {

	CommentService commentService;
	OrderService orderService;
	ProductService productService;
	ReviewService reviewService;
	UserService userService;

	@Before
	public void init() {
		commentService  = new CommentService("http://localhost:8091");
		orderService  = new OrderService("http://localhost:8092");
		productService  = new ProductService("http://localhost:8093");
		reviewService  = new ReviewService("http://localhost:8094");
		userService  = new UserService("http://localhost:8095");
	}
	
	@Test
	public void testFindCommentById() {
		Comment p = commentService.findById(1);
		List<Comment> responses = p.getCommentObj();
		System.out.println(String.format("The Comment is related with Comment:"));
		for (Comment iter : responses) {
				System.out.println("\t- " + iter.getContent());
				System.out.println("\t- " + iter.getCommentId());
		}	
	}
	@Test
	public void testFindOrderById() {
		Order p = orderService.findById("1");
		List<Product> orderProducts = p.getProductObj();
		System.out.println(String.format("The Order is related with Product:"));
		for (Product iter : orderProducts) {
				System.out.println("\t- " + iter.getDescription());
				System.out.println("\t- " + iter.getProductId());
		}	
	}
	@Test
	public void testFindProductById() {
		Product p = productService.findById(1);
		List<Order> productOrders = p.getOrderObj();
		System.out.println(String.format("The Product is related with Order:"));
		for (Order iter : productOrders) {
				System.out.println("\t- " + iter.getDate());
				System.out.println("\t- " + iter.getTotalAmount());
				System.out.println("\t- " + iter.getOrderId());
		}	
		List<Review> reviews = p.getReviewObj();
		System.out.println(String.format("The Product is related with Review:"));
		for (Review iter : reviews) {
				System.out.println("\t- " + iter.getRating());
				System.out.println("\t- " + iter.getTitle());
				System.out.println("\t- " + iter.getReviewId());
		}	
	}
	@Test
	public void testFindReviewById() {
		Review p = reviewService.findById("1");
		List<Comment> comment = p.getCommentObj();
		System.out.println(String.format("The Review is related with Comment:"));
		for (Comment iter : comment) {
				System.out.println("\t- " + iter.getContent());
				System.out.println("\t- " + iter.getCommentId());
		}	
		List<Product> product = p.getProductObj();
		System.out.println(String.format("The Review is related with Product:"));
		for (Product iter : product) {
				System.out.println("\t- " + iter.getDescription());
				System.out.println("\t- " + iter.getProductId());
		}	
	}
	@Test
	public void testFindUserById() {
		User p = userService.findById(1);
		List<Order> orders = p.getOrderObj();
		System.out.println(String.format("The User is related with Order:"));
		for (Order iter : orders) {
				System.out.println("\t- " + iter.getDate());
				System.out.println("\t- " + iter.getTotalAmount());
				System.out.println("\t- " + iter.getOrderId());
		}	
		List<Comment> comments = p.getCommentObj();
		System.out.println(String.format("The User is related with Comment:"));
		for (Comment iter : comments) {
				System.out.println("\t- " + iter.getContent());
				System.out.println("\t- " + iter.getCommentId());
		}	
		List<Review> reviews = p.getReviewObj();
		System.out.println(String.format("The User is related with Review:"));
		for (Review iter : reviews) {
				System.out.println("\t- " + iter.getRating());
				System.out.println("\t- " + iter.getTitle());
				System.out.println("\t- " + iter.getReviewId());
		}	
	}
}
