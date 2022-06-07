package com.cg.product.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.cg.product.model.Product;

@Repository
public interface ProductRepository extends MongoRepository<Product,String> {
	@Query("{'Catagory.name':?0}")
List<Product>findByCategory(String category);
}
