package org.typhon.client.model;

import java.util.*;
	
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.typhon.client.service.*;

	
public class Review {
	
private static final Logger logger = LoggerFactory.getLogger(Review.class);

	private int rating;
	private String title;
	private String id;
	private List<Comment> commentObj; 
	private List<Integer> comment; 

	private List<Product> productObj; 
	private List<Integer> product; 

		
	public void setRating (int rating){
		this.rating = rating;
	}

	public int getRating(){
		return rating;
	}

	public void setTitle (String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
	}

	public void setId (String id){
		this.id = id;
	}
	public String getId(){
		return id;
	}

	public List<Integer> getComment(){
		return comment;
	}
	public void setComment(List<Integer> comment){
		this.comment = comment;
	}
	public List<Integer> getProduct(){
		return product;
	}
	public void setProduct(List<Integer> product){
		this.product = product;
	}


	public List<Comment> getCommentObj() {
		CommentService commentService = new CommentService("http://localhost:8091");
		List<Comment> result = new ArrayList<Comment>();
		for (Integer typeObj : comment) {
			try {
				result.add(commentService.findById(typeObj));
			}
			catch (Exception e) {
				logger.error(e.getMessage());
			}
		}
		return result;
	}

	public void setInteger(List<Integer> obj) {
		this.comment = obj;
	}
	public List<Product> getProductObj() {
		ProductService productService = new ProductService("http://localhost:8093");
		List<Product> result = new ArrayList<Product>();
		for (Integer typeObj : product) {
			try {
				result.add(productService.findById(typeObj));
			}
			catch (Exception e) {
				logger.error(e.getMessage());
			}
		}
		return result;
	}

	public void setInteger(List<Integer> obj) {
		this.product = obj;
	}
}

