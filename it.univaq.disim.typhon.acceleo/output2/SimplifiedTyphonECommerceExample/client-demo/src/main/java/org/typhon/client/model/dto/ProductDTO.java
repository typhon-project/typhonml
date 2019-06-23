package org.typhon.client.model.dto;

import java.util.*;
	
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
	
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductDTO {

	private String description;
	private int id;
	private List<String> productOrdersObj; 
		
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
		return productOrdersObj;
	}
	public void setProductOrders(List<String> productOrdersObj){
		this.productOrdersObj = productOrdersObj;
	}

}
