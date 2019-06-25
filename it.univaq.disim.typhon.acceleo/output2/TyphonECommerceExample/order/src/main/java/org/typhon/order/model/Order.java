package org.typhon.order.model;

import java.util.*;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document
public class Order {

	@Id
	private String id;

	private Date date;
	private int totalAmount;

	private List<Integer> orderProducts; 

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setDate(Date date){
		this.date = date;
	}

	public Date getDate(){
		return date;
	}
	public void setTotalAmount(int totalAmount){
		this.totalAmount = totalAmount;
	}

	public int getTotalAmount(){
		return totalAmount;
	}

	public void setOrderProducts(List<Integer> orderProducts){
		this.orderProducts = orderProducts;
	}

	public List<Integer> getOrderProducts(){
		return orderProducts;
	}
}
