package org.typhon.product.model;

import java.util.*;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private String description; 
	private int productId; 

	@ElementCollection
	private List<String> productOrders; 
	@ElementCollection
	private List<String> reviews; 
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
		
	public void setDescription(String description){
		this.description = description;
	}

	public String getDescription (){
		return description;
	}
	public void setProductId(int productId){
		this.productId = productId;
	}

	public int getProductId (){
		return productId;
	}

	public void setProductOrders(List<String> productOrders){
		this.productOrders = productOrders;
	}

	public List<String> getProductOrders(){
		return productOrders;
	}

	public void setReviews(List<String> reviews){
		this.reviews = reviews;
	}

	public List<String> getReviews(){
		return reviews;
	}
}

