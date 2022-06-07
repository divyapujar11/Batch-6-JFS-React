package com.cg.product.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.product.model.Product;
import com.cg.product.service.ProductService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@CrossOrigin
@RestController
@RequestMapping("/v1")
public class ProductController {

	private ProductService productService;

	public ProductController(ProductService productservice) {
		this.productService = productservice;
	}

	@PostMapping("/addProduct")
	ResponseEntity<Product> addProduct(@RequestBody @Valid Product product) {

		String status = productService.addProduct(product);

		log.info("Product added status-{}", status);
		return ResponseEntity.status(HttpStatus.CREATED).body(product);

	}

	@GetMapping("/productList")
	List<Product> productList() {
		return productService.listAllProduct();
	}

	@GetMapping("/productList/catagory")
	List<Product> productCatagoryList(@PathVariable String catagory) {
		return productService.productCatagoryList(catagory);
	}

	@GetMapping("/productList/{id}")
	Product productById(@PathVariable String id) {
		return productService.productById(id);
	}

	@PutMapping
	String updateProduct(@RequestBody Product product) {
		return productService.updateProduct(product);
	}

	@DeleteMapping("/product/{id}")
	String deleteById(@PathVariable String id) {
		return productService.deleteById(id);
	}

}
