package com.microservices.orders.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.microservices.orders.entity.Cart;

@Repository
public interface OrderRepository extends MongoRepository<Cart, String>{


    Cart findByOrderId(String orderId);
}
