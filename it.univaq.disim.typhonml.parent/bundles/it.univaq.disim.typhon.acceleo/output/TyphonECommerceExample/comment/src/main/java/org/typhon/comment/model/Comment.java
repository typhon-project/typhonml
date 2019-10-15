package org.typhon.comment.model;

import java.util.*;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Comment {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private String content; 
	private int commentId; 

	@ElementCollection
	private List<String> responses; 
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
		
	public void setContent(String content){
		this.content = content;
	}

	public String getContent (){
		return content;
	}
	public void setCommentId(int commentId){
		this.commentId = commentId;
	}

	public int getCommentId (){
		return commentId;
	}

	public void setResponses(List<String> responses){
		this.responses = responses;
	}

	public List<String> getResponses(){
		return responses;
	}
}

