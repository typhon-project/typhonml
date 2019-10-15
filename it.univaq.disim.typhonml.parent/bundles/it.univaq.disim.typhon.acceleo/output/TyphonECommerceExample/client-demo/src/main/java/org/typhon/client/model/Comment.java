package org.typhon.client.model;

import java.util.*;
	
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.typhon.client.service.*;

	
public class Comment {
	
private static final Logger logger = LoggerFactory.getLogger(Comment.class);

	private String content;
	private int commentId;
	private List<Comment> responsesObj; 
	private List<Integer> responses; 

		
	public void setContent (String content){
		this.content = content;
	}

	public String getContent(){
		return content;
	}

	public void setCommentId (int commentId){
		this.commentId = commentId;
	}

	public int getCommentId(){
		return commentId;
	}

	public List<Integer> getResponses(){
		return responses;
	}
	public void setResponses(List<Integer> responses){
		this.responses = responses;
	}


	public List<Comment> getCommentObj() {
		CommentService commentService = new CommentService("http://localhost:8091");
		List<Comment> result = new ArrayList<Comment>();
		for (Integer typeObj : responses) {
			try {
				result.add(commentService.findById(typeObj));
			}
			catch (Exception e) {
				logger.error(e.getMessage());
			}
		}
		return result;
	}

	
}

