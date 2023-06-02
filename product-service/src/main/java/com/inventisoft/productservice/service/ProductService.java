package com.inventisoft.productservice.service;

import com.inventisoft.productservice.dto.ProductDTO;
import com.inventisoft.productservice.mapper.ProductMapper;
import java.util.List;
import java.util.Optional;

import lombok.extern.slf4j.Slf4j;
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
@Slf4j
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	
	/**
	 * 	List all products
	 * @param Product(entity)
	 * @return
	 */
	@Transactional
	public List<ProductDTO> getAllProducts(){
		List<ProductDTO> products = ProductMapper.INSTANCE.productListToProductDTOList(productRepository.findAll());
		return products;
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
	public ProductDTO getProducById(int productId) {
        Optional<Product> product = productRepository.findById(productId);
        if (product.isPresent()) {
					ProductDTO productDTO = ProductMapper.INSTANCE.productToProductDTO(product.get());
          return productDTO;
        } else {
          log.error("Product not found with id: " + productId);
					return null;
        }
    }


}
