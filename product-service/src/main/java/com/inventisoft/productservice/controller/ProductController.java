package com.inventisoft.productservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
	private final ProductService productService;
	
	public ProductController(ProductService productservice) {
		this.productService = productservice;
	}
	
	@GetMapping("/products")
	public ResponseEntity<List<Product>> listProduct(){
		List<Product> product = productService.getAll();
		if(product.isEmpty()) {
			return ResponseEntity.noContent().build();
		}
		return ResponseEntity.ok(product);
	}
	
	@GetMapping("/product/{id}")
	public ResponseEntity<Product> getProduct(@PathVariable("id") int productId){
		Product product = productService.getProductById(productId);
		if(product == null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(product);
	}
	
	@PostMapping("/product")
	public ResponseEntity<Product> saveProduct(@RequestBody Product product){
		Product newProduct = productService.saveProduct(product);
		return ResponseEntity.ok(newProduct);
	}
	
	@DeleteMapping("/product/{id}")
	public void deleteProduct(@PathVariable("id") int productId) {
		Product product = this.productService.getProductById(productId);
		if(product != null) {
			this.productService.deleteProduct(product);
		}
	}
	
	@PutMapping("/product")
	public ResponseEntity<Product> updateProduct(@PathVariable("id") int productId){
		Product product = this.productService.getProductById(productId);
		if(product == null) {
			return ResponseEntity.notFound().build();
		}else {
		}
		return new ResponseEntity<Product>(this.productService.updateProduct(product), HttpStatus.OK);
	}
}