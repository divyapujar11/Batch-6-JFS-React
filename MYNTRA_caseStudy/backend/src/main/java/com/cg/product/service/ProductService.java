package com.cg.product.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import com.cg.product.config.ProductConfiguration;
import com.cg.product.exception.CurrencyNotValidException;
import com.cg.product.exception.OfferNotValidException;
import com.cg.product.model.Product;
import com.cg.product.repository.ProductRepository;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@AllArgsConstructor
@Slf4j
@Service
public class ProductService {

	private ProductRepository productRepository;
	
	private ProductConfiguration productConfiguration;

	

	public String addProduct(Product product) {

		log.info("adding product");
		if (product.getPrice() == 0 && product.getDiscount() > 0) {
			throw new OfferNotValidException("No discount is allowed at 0 product price");
		}

		
		
		if (!productConfiguration.getCurrencies().contains(product.getCurrency().toUpperCase())) {
			throw new CurrencyNotValidException("Invalid Currency. Valid currencies:" +  productConfiguration.getCurrencies());
		}

		productRepository.save(product);

		return "success";

	}

	public List<Product> listAllProduct() {
		return productRepository.findAll();
	}

	public List<Product> productCatagoryList(String catagory) {

		return productRepository.findByCategory(catagory);
	}

	public Product productById(String id) {
		return productRepository.findById(id).get();
	}

	public String updateProduct(Product product) {

		productRepository.save(product);

		return "product updated ";
	}

	public String deleteById(String id) {
		productRepository.deleteById(id);
		return "product deleted";

	}

}
