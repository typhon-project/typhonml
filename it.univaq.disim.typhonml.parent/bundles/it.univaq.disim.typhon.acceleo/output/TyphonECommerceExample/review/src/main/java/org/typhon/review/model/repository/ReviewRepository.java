package org.typhon.review.model.repository;

import org.typhon.review.model.Review;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "review", path = "review")
public interface ReviewRepository extends PagingAndSortingRepository<Review, String> {

}
