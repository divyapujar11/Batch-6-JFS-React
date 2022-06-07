package com.cg.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cg.entity.Cart;
import com.cg.entity.CartDetails;
import com.cg.entity.Product;
import com.cg.service.CartService;


@CrossOrigin("*")
@RestController
@RequestMapping("/cart")
public class CartController {
	
	@Autowired
	private CartService cartService;
	
	@Autowired
	private LoadBalancerClient loadBalancerClient;
	
	
	private RestTemplate restTemplate = new RestTemplate();
	
	@PostMapping("/add")
	public String addToCart(@RequestBody Cart cart)
	{
		String status = cartService.addToCart(cart);
		return status;
	}

	@DeleteMapping("/delete")
	public String removeFromCart(@RequestBody Cart cart)
	{
		String status = cartService.removeFromCart(cart);
		return status;
	}
	
	@GetMapping("/show/{userId}")
	public CartDetails displayAllProducts(@PathVariable String userId)
	{
		CartDetails cartDetails = new CartDetails();
		cartDetails.setUserId(userId);
		
		ArrayList<Cart> cartList = cartService.displayAllProducts(userId);
		ArrayList<Product> products = new ArrayList<Product>();
		
		for(int i=0;i<cartList.size();i++)
		{
			Product productInfo = restTemplate.getForObject(getBaseUrl() + "/v1/product/" + cartList.get(i).getProductId(), Product.class);
			products.add(productInfo);
		}
		
		cartDetails.setProductList(products);
		return cartDetails;
	}
	
	private String getBaseUrl()
	{
		ServiceInstance instance = loadBalancerClient.choose("PRODUCTS MICROSERVICE IN DEV ENV");
		return instance.getUri().toString();
	}
	
}
