package org.typhon.client.model.dto;

import java.util.*;
	
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
	
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductDTO {

	private String description;
	private int productId;
	private List<String> productOrdersObj; 
	private List<String> reviewsObj; 
		
	public void setDescription (String description){
		this.description = description;
	}

	public String getDescription(){
		return description;
	}

	public void setProductId (int productId){
		this.productId = productId;
	}

	public int getProductId(){
		return productId;
	}

	public List<String> getProductOrders(){
		return productOrdersObj;
	}
	public void setProductOrders(List<String> productOrdersObj){
		this.productOrdersObj = productOrdersObj;
	}
	public List<String> getReviews(){
		return reviewsObj;
	}
	public void setReviews(List<String> reviewsObj){
		this.reviewsObj = reviewsObj;
	}

}
