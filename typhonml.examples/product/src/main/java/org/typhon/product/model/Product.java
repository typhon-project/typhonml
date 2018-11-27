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

	@ElementCollection
	private List<String> productOrders; 
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

	public void setProductOrders(List<String> productOrders){
		this.productOrders = productOrders;
	}

	public List<String> getProductOrders(){
		return productOrders;
	}
}

