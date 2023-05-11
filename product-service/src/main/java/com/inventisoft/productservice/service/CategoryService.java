package com.inventisoft.productservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inventisoft.productservice.entity.Category;
import com.inventisoft.productservice.repository.CategoryRepository;
import java.util.Optional;
import org.springframework.transaction.annotation.Transactional;



/**
 *
 * @author Hector Ajumado
 */

@Service
@Transactional
public class CategoryService {
    
    @Autowired
    private CategoryRepository categoryRepository;
    
    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }
    
    public Category addCategory(Category category) {
        return categoryRepository.save(category);
    }
    
     public void deleteCategory(Integer id) {
        categoryRepository.deleteById(id);
    }
     
    public Category updateCategory(Category category) {
        return categoryRepository.save(category);
    }
    
    public Category getCategoryById(int categoryId) {
        Optional<Category> category = categoryRepository.findById(categoryId);
        if (category.isPresent()) {
            return category.get();
        } else {
            throw new RuntimeException("Category not found with id: " + categoryId);
        }
    }



   
    
}
