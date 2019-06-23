	
package org.typhon.client.test;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.typhon.client.model.*;
import org.typhon.client.service.*;

public class RelationTest {

	OrderService orderService;
	ProductService productService;
	UserService userService;

	@Before
	public void init() {
		orderService  = new OrderService("http://localhost:8091");
		productService  = new ProductService("http://localhost:8092");
		userService  = new UserService("http://localhost:8093");
	}
	
	@Test
	public void testFindOrderById() {
		Order p = orderService.findById("1");
		List<Product> orderProducts = p.getProductObj();
		System.out.println(String.format("The Order is related with Product:"));
		for (Product iter : orderProducts) {
				System.out.println("\t- " + iter.getDescription());
				System.out.println("\t- " + iter.getId());
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
				System.out.println("\t- " + iter.getId());
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
				System.out.println("\t- " + iter.getId());
		}	
	}
}
