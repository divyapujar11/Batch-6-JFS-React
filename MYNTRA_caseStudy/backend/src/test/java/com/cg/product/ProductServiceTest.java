package com.cg.product;



import com.cg.product.model.Product;
import com.cg.product.config.ProductConfiguration;
import com.cg.product.exception.CurrencyNotValidException;
import com.cg.product.exception.OfferNotValidException;



import com.cg.product.repository.ProductRepository;
import com.cg.product.service.ProductService;



import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;



import org.junit.jupiter.api.Test;




import java.util.List;
import java.util.Optional;



import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;



import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;



class ProductServiceTest {
	private ProductRepository productRepository;



	private ProductConfiguration productConfiguration;



	private ProductService productService;



	@BeforeEach
	void setUp() {
		productRepository = mock(ProductRepository.class);
		productConfiguration = new ProductConfiguration();
		productConfiguration.setCurrencies(List.of("INR", "USD"));
		productService = new ProductService(productRepository, productConfiguration);
	}


	@Test
	@DisplayName("Offer not valid scenario")
	void addProductOfferNotValidException() {
		Product product = new Product();
		product.setPrice(0.0);
		product.setDiscount(10);
		assertThrows(OfferNotValidException.class, () -> productService.addProduct(product));
	}



	@Test
	@DisplayName("Currency not valid scenario")
	void addProductCurrencyNotValidException() {
		Product product = new Product();
		product.setPrice(10000.0);
		product.setDiscount(10);
		product.setCurrency("HKD");
		assertThrows(CurrencyNotValidException.class, () -> productService.addProduct(product));
	}


	@Test
	@DisplayName("Product found for given id")
	void productByIdTest() {
		Product product = new Product();
		product.setName("roadster crop top");
		product.setPrice(1000.0);
		product.setDiscount(10);
		product.setCurrency("INR");



		when(productRepository.findById(anyString())).thenReturn(Optional.of(product));
		Product actualProduct = productService.productById("random-id");
		assertThat(product).isEqualTo(actualProduct);
	}



}
