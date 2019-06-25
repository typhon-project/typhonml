package org.typhon.client.model.dto;

import java.util.*;
	
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
	
@JsonIgnoreProperties(ignoreUnknown = true)
public class OrderDTO {

	private Date date;
	private int totalAmount;
	private String id;
	private List<Integer> orderProductsObj; 
		
	public void setDate (Date date){
		this.date = date;
	}

	public Date getDate(){
		return date;
	}

	public void setTotalAmount (int totalAmount){
		this.totalAmount = totalAmount;
	}

	public int getTotalAmount(){
		return totalAmount;
	}

	public void setId (String id){
		this.id = id;
	}
	public String getId(){
		return id;
	}

	public List<Integer> getOrderProducts(){
		return orderProductsObj;
	}
	public void setOrderProducts(List<Integer> orderProductsObj){
		this.orderProductsObj = orderProductsObj;
	}

}
