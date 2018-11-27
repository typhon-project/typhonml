package org.typhon.user.model.repository;

import org.typhon.user.model.User;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@Api
@RepositoryRestResource(collectionResourceRel = "user", path = "user")
public interface UserRepository extends PagingAndSortingRepository<User, Long> {
	
	@ApiOperation("Get user by name")
	List<User> findByName(@Param("name") 
								@ApiParam(value="Name")String name);

	@ApiOperation("Get user by surname")
	List<User> findBySurname(@Param("surname") 
								@ApiParam(value="Surname")String surname);

	@ApiOperation("Get user by id")
	List<User> findById(@Param("id") 
								@ApiParam(value="Id")String id);

}
