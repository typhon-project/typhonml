package org.typhon.client.model;

import java.util.*;
	
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.typhon.client.service.*;

	
public class User {
	
private static final Logger logger = LoggerFactory.getLogger(User.class);

	private String name;
	private String surname;
	private int id;
	private List<Order> ordersObj; 
	private List<String> orders; 

		
	public void setName (String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setSurname (String surname){
		this.surname = surname;
	}

	public String getSurname(){
		return surname;
	}

	public void setId (int id){
		this.id = id;
	}
	public int getId(){
		return id;
	}

	public List<String> getOrders(){
		return orders;
	}
	public void setOrders(List<String> orders){
		this.orders = orders;
	}


	public List<Order> getOrderObj() {
		OrderService orderService = new OrderService("http://localhost:8091");
		List<Order> result = new ArrayList<Order>();
		for (String typeObj : orders) {
			try {
				result.add(orderService.findById(typeObj));
			}
			catch (Exception e) {
				logger.error(e.getMessage());
			}
		}
		return result;
	}

	public void setString(List<String> obj) {
		this.orders = obj;
	}
}

