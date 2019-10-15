package org.typhon.client.model.dto;

import java.util.*;
	
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
	
@JsonIgnoreProperties(ignoreUnknown = true)
public class OrderDTO {

	private Date date;
	private int totalAmount;
	private int orderId;
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

	public void setOrderId (int orderId){
		this.orderId = orderId;
	}

	public int getOrderId(){
		return orderId;
	}

	public List<Integer> getOrderProducts(){
		return orderProductsObj;
	}
	public void setOrderProducts(List<Integer> orderProductsObj){
		this.orderProductsObj = orderProductsObj;
	}

}
