package com.inventisoft.productservice.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.inventisoft.productservice.dto.ProductDto;
import com.inventisoft.productservice.entity.Product;
import com.inventisoft.productservice.service.ProductService;

/**
 * Class controller, post, get, delete, update product
 * 
 * @author atthort-arch
 *
 */

@RestController
@RequestMapping("/api")
public class ProductController {
	@Autowired
	private ProductService productService;
	
	/**
	 * Get all products
	 * @return
	 */
	@GetMapping("/products")
	public List<ProductDto> getAllProduct() {
        List<Product> product = productService.getAllProducts();
        List<ProductDto> productDtos = new ArrayList<>();

        for (Product products : product) {
            productDtos.add(new ProductDto());
        }

        return productDtos;
    }
	
	/**
	 * Register new product
	 * @param product
	 * @return
	 */
	@PostMapping("/product")
    public Product addProduct(@RequestBody Product product) {
        return productService.addProduct(product);
    }
    
	/**
	 * Delete product for id
	 * @param id
	 */
    @DeleteMapping("/product/{id}")
    public void deleteProduct(@PathVariable int id) {
        productService.deleteProduct(id);
    }
    
    /**
     * Update product for id
     * @param id
     * @param product
     * @return
     */
    @PutMapping("/product/{id}")
    public Product updateProduct(@PathVariable int id, @RequestBody Product product) {
        product.setId(id);
        return productService.updateProduct(product);
    }
    
    /**
     * Get product for id
     * @param id
     * @return
     */
    @GetMapping("/product/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable("id") int id) {
    	Product product = productService.getProducById(id);
    	if(product == null) {
			return ResponseEntity.noContent().build();
		}
    	return ResponseEntity.ok(product);
    }
	
}