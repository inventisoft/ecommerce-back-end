package com.inventisoft.productservice.service;

import com.inventisoft.productservice.dto.ProductDTO;
import com.inventisoft.productservice.mapper.ProductMapper;
import java.util.List;

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
	public List<Product> getAll(){
		return productRepository.findAll();
	}

	/**
	 * Find product by product_id
	 * @param id
	 * @return
	 */
	public Product getProductById(int id) {
		return productRepository.findById(id).orElse(null);

	}

	/**
	 * Save product
	 * @param productDTO(entity)
	 * @return
	 */
	@Transactional
	public Product saveProduct(ProductDTO productDTO) {
		Product product = ProductMapper.INSTANCE.productDtoToProduct(productDTO);
		Product newProduct = productRepository.save(product);
		return newProduct;
	}

	/**
	 * Update product
	 * @param product
	 * @return
	 */
	@Transactional
	public Product updateProduct(Product product) {
		return this.productRepository.save(product);
	}

	/**
	 * Delete product
	 * @param product
	 */
	@Transactional
	public void deleteProduct(Product product) {
		this.productRepository.delete(product);
	}




}
