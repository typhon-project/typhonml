package org.typhon.comment.model.repository;

import org.typhon.comment.model.Comment;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@Api
@RepositoryRestResource(collectionResourceRel = "comment", path = "comment")
public interface CommentRepository extends PagingAndSortingRepository<Comment, Long> {
	
	@ApiOperation("Get comment by content")
	List<Comment> findByContent(@Param("content") 
								@ApiParam(value="Content")String content);

	@ApiOperation("Get comment by id")
	List<Comment> findById(@Param("id") 
								@ApiParam(value="Id")String id);

}
