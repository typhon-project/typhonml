package org.typhon.client.model.dto;

import java.util.*;
	
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
	
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserDTO {

	private String name;
	private String surname;
	private int id;
	private List<String> ordersObj; 
		
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
		return ordersObj;
	}
	public void setOrders(List<String> ordersObj){
		this.ordersObj = ordersObj;
	}

}
