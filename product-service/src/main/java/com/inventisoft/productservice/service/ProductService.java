package com.inventisoft.productservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.inventisoft.productservice.entity.Product;
import com.inventisoft.productservice.repository.ProductRepository;

/**
 * Class service product
 * 
 * @author atthort-arch
 *
 */

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	
	/**
	 * 	List all products
	 * @param Product(entity)
	 * @return
	 */
	@Transactional
	public List<Product> getAllProducts(){
		return productRepository.findAll();
	}
	
	/**
	 * Insert product
	 * @param product
	 * @return
	 */
	@Transactional
	public Product addProduct(Product product) {
		return productRepository.save(product);
	}
	
	/**
	 * Remove product for id
	 * @param id
	 */
	@Transactional
	public void deleteProduct(Integer id) {
		productRepository.deleteById(id);
	}
	
	/**
	 * Update product for id
	 * @param product
	 * @return
	 */
	@Transactional
	public Product updateProduct(Product product) {
		return productRepository.save(product);
	}
	
	/**
	 * Get product for id
	 * @param productId
	 * @return
	 */
	@Transactional
	public Product getProducById(int productId) {
        Optional<Product> product = productRepository.findById(productId);
        if (product.isPresent()) {
            return product.get();
        } else {
            throw new RuntimeException("Category not found with id: " + productId);
        }
    }


}