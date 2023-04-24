package com.inventisoft.productservice.controller;

import com.inventisoft.productservice.dto.ProductDTO;
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
import com.inventisoft.productservice.vo.ProductVo;

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
	
	/**
	 * path:get all products
	 * @return
	 */
	@GetMapping("/products")
	public ResponseEntity<List<Product>> listProduct(){
		List<Product> product = productService.getAll();
		if(product.isEmpty()) {
			return ResponseEntity.noContent().build();
		}
		return ResponseEntity.ok(product);
	}
	
	/**
	 * Path: get products by id
	 * @param productId
	 * @return
	 */
	@GetMapping("/product/{id}")
	public ResponseEntity<Product> getProduct(@PathVariable("id") int productId){
		Product product = productService.getProductById(productId);
		if(product == null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(product);
	}
	
	/**
	 * Path: Save product
	 * @param product
	 * @return
	 */
	@PostMapping("/product")
	public ResponseEntity<Product> saveProduct(@RequestBody ProductDTO product){
		Product newProduct = productService.saveProduct(product);
		return ResponseEntity.ok(newProduct);
	}
	
	/**shortDescription
	 * Path: Delete product, request id product
	 * @param productId
	 */
	@DeleteMapping("/product/{id}")
	public void deleteProduct(@PathVariable("id") int productId) {
		Product product = this.productService.getProductById(productId);
		if(product != null) {
			this.productService.deleteProduct(product);
		}
	}
	
	/**
	 * Path: Update product, request id product
	 * @param id
	 * @param productvo
	 * @return
	 */
	@PutMapping("/product/{id}")
	public ResponseEntity<Product> updateProduct(@PathVariable("id") int id, ProductVo productvo){
		Product product = this.productService.getProductById(id);
		if(product == null) {
			return new ResponseEntity<Product>(HttpStatus.NOT_FOUND);
		}else {
			product.setCategoryId(productvo.getCategoryId());
			product.setCode(productvo.getCode());
			product.setName(productvo.getName());
			product.setShortDescription(productvo.getName());
			product.setLongDescription(productvo.getLongDescription());
			product.setAdditionalInformation(productvo.getAdditionalInformation());
			product.setBrand(productvo.getBrand());
		}
		return new ResponseEntity<>(this.productService.updateProduct(product), HttpStatus.OK);
	}
}
