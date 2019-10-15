package org.typhon.review.model;

import java.util.*;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document
public class Review {

	@Id
	private String id;

	private int rating;
	private String title;
	private int reviewId;

	private List<Integer> comment; 
	private List<Integer> product; 

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setRating(int rating){
		this.rating = rating;
	}

	public int getRating(){
		return rating;
	}
	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
	}
	public void setReviewId(int reviewId){
		this.reviewId = reviewId;
	}

	public int getReviewId(){
		return reviewId;
	}

	public void setComment(List<Integer> comment){
		this.comment = comment;
	}

	public List<Integer> getComment(){
		return comment;
	}

	public void setProduct(List<Integer> product){
		this.product = product;
	}

	public List<Integer> getProduct(){
		return product;
	}
}
