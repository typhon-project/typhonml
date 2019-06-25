package org.typhon.client.model.dto;

import java.util.*;
	
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
	
@JsonIgnoreProperties(ignoreUnknown = true)
public class CommentDTO {

	private String content;
	private int id;
	private List<Integer> responsesObj; 
		
	public void setContent (String content){
		this.content = content;
	}

	public String getContent(){
		return content;
	}

	public void setId (int id){
		this.id = id;
	}
	public int getId(){
		return id;
	}

	public List<Integer> getResponses(){
		return responsesObj;
	}
	public void setResponses(List<Integer> responsesObj){
		this.responsesObj = responsesObj;
	}

}
