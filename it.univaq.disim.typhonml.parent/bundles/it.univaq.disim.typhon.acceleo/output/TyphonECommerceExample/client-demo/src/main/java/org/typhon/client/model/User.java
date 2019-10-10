package org.typhon.client.model;

import java.util.*;
	
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.typhon.client.service.*;

	
public class User {
	
private static final Logger logger = LoggerFactory.getLogger(User.class);

	private String name;
	private String surname;
	private int userId;
	private String JURI;
	private String JURI2;
	private List<Order> ordersObj; 
	private List<String> orders; 

	private List<Comment> commentsObj; 
	private List<Integer> comments; 

	private List<Review> reviewsObj; 
	private List<String> reviews; 

		
	public void setName (String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setSurname (String surname){
		this.surname = surname;
	}

	public String getSurname(){
		return surname;
	}

	public void setUserId (int userId){
		this.userId = userId;
	}

	public int getUserId(){
		return userId;
	}

	public void setJURI (String JURI){
		this.JURI = JURI;
	}

	public String getJURI(){
		return JURI;
	}

	public void setJURI2 (String JURI2){
		this.JURI2 = JURI2;
	}

	public String getJURI2(){
		return JURI2;
	}

	public List<String> getOrders(){
		return orders;
	}
	public void setOrders(List<String> orders){
		this.orders = orders;
	}
	public List<Integer> getComments(){
		return comments;
	}
	public void setComments(List<Integer> comments){
		this.comments = comments;
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
		for (String typeObj : orders) {
			try {
				result.add(orderService.findById(typeObj));
			}
			catch (Exception e) {
				logger.error(e.getMessage());
			}
		}
		return result;
	}

	
	public List<Comment> getCommentObj() {
		CommentService commentService = new CommentService("http://localhost:8091");
		List<Comment> result = new ArrayList<Comment>();
		for (Integer typeObj : comments) {
			try {
				result.add(commentService.findById(typeObj));
			}
			catch (Exception e) {
				logger.error(e.getMessage());
			}
		}
		return result;
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

	
}

