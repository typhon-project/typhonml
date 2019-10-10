package org.typhon.client.model.dto;

import java.util.*;
	
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
	
@JsonIgnoreProperties(ignoreUnknown = true)
public class ReviewDTO {

	private int rating;
	private String title;
	private int reviewId;
	private List<Integer> commentObj; 
	private List<Integer> productObj; 
		
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

	public void setReviewId (int reviewId){
		this.reviewId = reviewId;
	}

	public int getReviewId(){
		return reviewId;
	}

	public List<Integer> getComment(){
		return commentObj;
	}
	public void setComment(List<Integer> commentObj){
		this.commentObj = commentObj;
	}
	public List<Integer> getProduct(){
		return productObj;
	}
	public void setProduct(List<Integer> productObj){
		this.productObj = productObj;
	}

}
