package org.typhon.client.model;

import java.util.*;
	
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.typhon.client.service.*;

	
public class Product {
	
private static final Logger logger = LoggerFactory.getLogger(Product.class);

	private String description;
	private int id;
	private List<Order> productOrdersObj; 
	private List<String> productOrders; 

	private List<Review> reviewsObj; 
	private List<String> reviews; 

		
	public void setDescription (String description){
		this.description = description;
	}

	public String getDescription(){
		return description;
	}

	public void setId (int id){
		this.id = id;
	}
	public int getId(){
		return id;
	}

	public List<String> getProductOrders(){
		return productOrders;
	}
	public void setProductOrders(List<String> productOrders){
		this.productOrders = productOrders;
	}
	public List<String> getReviews(){
		return reviews;
	}
	public void setReviews(List<String> reviews){
		this.reviews = reviews;
	}


	public List<Order> getOrderObj() {
		OrderService orderService = new OrderService("http://localhost:8092");
		List<Order> result = new ArrayList<Order>();
		for (String typeObj : productOrders) {
			try {
				result.add(orderService.findById(typeObj));
			}
			catch (Exception e) {
				logger.error(e.getMessage());
			}
		}
		return result;
	}

	public void setString(List<String> obj) {
		this.productOrders = obj;
	}
	public List<Review> getReviewObj() {
		ReviewService reviewService = new ReviewService("http://localhost:8094");
		List<Review> result = new ArrayList<Review>();
		for (String typeObj : reviews) {
			try {
				result.add(reviewService.findById(typeObj));
			}
			catch (Exception e) {
				logger.error(e.getMessage());
			}
		}
		return result;
	}

	public void setString(List<String> obj) {
		this.reviews = obj;
	}
}

