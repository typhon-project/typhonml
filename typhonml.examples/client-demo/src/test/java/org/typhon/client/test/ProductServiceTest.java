package org.typhon.client.test;

import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.hateoas.PagedResources;
import org.typhon.client.model.Order;
import org.typhon.client.model.Product;
import org.typhon.client.service.OrderService;
import org.typhon.client.service.ProductService;

public class ProductServiceTest {
	ProductService productService;
	OrderService orderService;

	@Before
	public void init() {
		productService = new ProductService("http://localhost:8080");
		orderService = new OrderService("http://localhost:8080");
	}
	@Ignore
	@Test
 	public void testCreateProduct() {
 		Product objToCreate = new Product();
 		objToCreate.setDescription("A description.");
 		
 		List<String> orders = new ArrayList<String>();
 			Order o1 = new Order();
 			o1.setTotalAmount(30);
 			o1.setDate(new Date());
 			Order o1_created = orderService.create(o1);
 			System.out.println(o1_created.getId());
 			orders.add(o1_created.getId());
 			Order o2 = new Order();
 			o2.setTotalAmount(60);
 			o2.setDate(new Date());
 			Order o2_created = orderService.create(o2);
 			System.out.println(o2_created.getId());
 			orders.add(o2_created.getId());
 			Order o3 = new Order();
 			o3.setTotalAmount(90);
 			o3.setDate(new Date());
 			Order o3_created = orderService.create(o3);
 			System.out.println(o3_created.getId());
 			orders.add(o3_created.getId());
 		
 		objToCreate.setProductOrders(orders);
 		
 		productService.create(objToCreate);
 		System.out.println("Product created!");
 	}
	
	@Test
	public void testFindAll() {
		PagedResources<Product> v = productService.findAll(0,5,"ASC");
		assertNotNull(productService.findAll(0,5,"ASC"));
		
		for (Product product : v.getContent()) {
			for (Order order : product.getOrderObj()) {
				System.out.println(order.getTotalAmount() + " " + order.getId());
			}
		}
		v.getLinks();
	}
	
}

	
