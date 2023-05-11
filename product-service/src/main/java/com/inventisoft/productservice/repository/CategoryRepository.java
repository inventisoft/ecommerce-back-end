package com.inventisoft.productservice.repository;

import com.inventisoft.productservice.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Hector Ajumado
 */

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {
    
}
