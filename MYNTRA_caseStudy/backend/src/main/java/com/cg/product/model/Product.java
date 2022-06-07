package com.cg.product.model;

import java.util.List;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor

@Data
@Document(collection = "product")
public class Product {

	@Id
	private String id;
	@NotNull(message = "product name should not be null")
	private String name;

	@NotNull(message = "catagory should not be null")
	private Catagory catagory;

	@Min(0)
	private double price;

	private String currency;
	@Max(100)
	private double discount;
	private String discountDescription;
	private List<String> imageURLS;
}
