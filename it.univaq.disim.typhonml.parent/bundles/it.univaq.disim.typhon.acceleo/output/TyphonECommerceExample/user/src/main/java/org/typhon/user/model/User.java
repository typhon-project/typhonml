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
	private int userId; 
	private String JURI; 
	private String JURI2; 

	@ElementCollection
	private List<String> orders; 
	@ElementCollection
	private List<String> comments; 
	@ElementCollection
	private List<String> reviews; 
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
	public void setUserId(int userId){
		this.userId = userId;
	}

	public int getUserId (){
		return userId;
	}
	public void setJURI(String JURI){
		this.JURI = JURI;
	}

	public String getJURI (){
		return JURI;
	}
	public void setJURI2(String JURI2){
		this.JURI2 = JURI2;
	}

	public String getJURI2 (){
		return JURI2;
	}

	public void setOrders(List<String> orders){
		this.orders = orders;
	}

	public List<String> getOrders(){
		return orders;
	}

	public void setComments(List<String> comments){
		this.comments = comments;
	}

	public List<String> getComments(){
		return comments;
	}

	public void setReviews(List<String> reviews){
		this.reviews = reviews;
	}

	public List<String> getReviews(){
		return reviews;
	}
}

