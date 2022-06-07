package com.cg.service;

import java.util.ArrayList;


import org.springframework.stereotype.Service;

import com.cg.entity.Cart;
import com.cg.repository.CartRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class CartService {
	
	private CartRepository cartRepository;

	public String addToCart(Cart cart)
	{
		cartRepository.save(cart);
		return "success!!!";
	}
	
	public String removeFromCart(Cart cart)
	{
		cartRepository.delete(cart);
		return "Deleted from cart";
	}
	
	public ArrayList<Cart> displayAllProducts(String userId)
	{
		ArrayList<Cart> cartList = cartRepository.findByUserId(userId);
		
		return cartList;		
	}
	
}
