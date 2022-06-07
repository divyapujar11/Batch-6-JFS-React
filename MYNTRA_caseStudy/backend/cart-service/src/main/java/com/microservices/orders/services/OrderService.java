package com.microservices.orders.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.microservices.orders.entity.Cart;
import com.microservices.orders.repositories.OrderRepository;

import lombok.extern.slf4j.Slf4j;


public interface OrderService {
	
	
	public Cart addorder(  Cart order );
	 public List<Cart> fetchAllOrders();
	 public Cart update(Cart order);
	 public String deleteById(String id);
	 
	

}
