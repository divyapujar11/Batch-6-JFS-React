package com.cg.entity;

import java.util.List;



import com.cg.entity.Category;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data
public class Product {
	
private String id;
	
	private String name;
	

	private Category category;
	private double price;
	
	private String currency;
	

	private double discount;
	private String discountDescription;
	private List<String> imageURLs;

}
