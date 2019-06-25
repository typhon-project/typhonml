package org.typhon.product.model.repository;

import org.typhon.product.model.Product;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@Api
@RepositoryRestResource(collectionResourceRel = "product", path = "product")
public interface ProductRepository extends PagingAndSortingRepository<Product, Long> {
	
	@ApiOperation("Get product by description")
	List<Product> findByDescription(@Param("description") 
								@ApiParam(value="Description")String description);

	@ApiOperation("Get product by id")
	List<Product> findById(@Param("id") 
								@ApiParam(value="Id")String id);

}
