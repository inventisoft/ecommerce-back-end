package com.inventisoft.productservice.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inventisoft.productservice.entity.Product;

/**
 * Class Repositoy
 * 
 * @author atthort-arch
 *
 */

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
}
