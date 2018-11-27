package org.typhon.user.model;

import java.util.*;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private String name; 
	private String surname; 

	@ElementCollection
	private List<String> orders; 
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
		
	public void setName(String name){
		this.name = name;
	}

	public String getName (){
		return name;
	}
	public void setSurname(String surname){
		this.surname = surname;
	}

	public String getSurname (){
		return surname;
	}

	public void setOrders(List<String> orders){
		this.orders = orders;
	}

	public List<String> getOrders(){
		return orders;
	}
}
