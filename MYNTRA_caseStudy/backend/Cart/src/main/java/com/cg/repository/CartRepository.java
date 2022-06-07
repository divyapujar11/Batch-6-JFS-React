package com.cg.repository;

import java.util.ArrayList;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.cg.entity.Cart;

@Repository
public interface CartRepository extends MongoRepository<Cart, String> {
	
	@Query("{ 'userId' : ?0 }")
	ArrayList<Cart> findByUserId(String userId);

}
