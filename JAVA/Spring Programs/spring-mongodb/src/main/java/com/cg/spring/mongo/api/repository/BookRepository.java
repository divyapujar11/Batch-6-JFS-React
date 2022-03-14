package com.cg.spring.mongo.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.cg.spring.mongo.api.model.Book;

public interface BookRepository extends MongoRepository<Book, Integer> {

}
