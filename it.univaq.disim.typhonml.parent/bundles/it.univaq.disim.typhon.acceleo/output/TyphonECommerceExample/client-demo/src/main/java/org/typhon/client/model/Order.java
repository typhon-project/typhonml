package org.typhon.client.model;

import java.util.*;
	
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.typhon.client.service.*;

	
public class Order {
	
private static final Logger logger = LoggerFactory.getLogger(Order.class);

	private Date date;
	private int totalAmount;
	private int orderId;
	private List<Product> orderProductsObj; 
	private List<Integer> orderProducts; 

		
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
		return orderProducts;
	}
	public void setOrderProducts(List<Integer> orderProducts){
		this.orderProducts = orderProducts;
	}


	public List<Product> getProductObj() {
		ProductService productService = new ProductService("http://localhost:8093");
		List<Product> result = new ArrayList<Product>();
		for (Integer typeObj : orderProducts) {
			try {
				result.add(productService.findById(typeObj));
			}
			catch (Exception e) {
				logger.error(e.getMessage());
			}
		}
		return result;
	}

	
}

