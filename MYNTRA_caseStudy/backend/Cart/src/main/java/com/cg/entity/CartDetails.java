package com.cg.entity;

import java.util.ArrayList;

import lombok.Data;

@Data
public class CartDetails {
	
	private String userId;
	private ArrayList<Product> productList;

}
