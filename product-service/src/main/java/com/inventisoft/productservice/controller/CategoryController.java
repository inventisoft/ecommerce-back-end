package com.inventisoft.productservice.controller;

import com.inventisoft.productservice.dto.CategoryDto;
import com.inventisoft.productservice.entity.Category;
import com.inventisoft.productservice.service.CategoryService;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Hector Ajumado
 */

@RestController
@RequestMapping("/categories")
public class CategoryController {
    
    @Autowired
    private CategoryService categoryService;
    
    @GetMapping("/")
    public List<CategoryDto> getAllCategories() {
        List<Category> categories = categoryService.getAllCategories();
        List<CategoryDto> categoryDtos = new ArrayList<>();

        for (Category category : categories) {
            categoryDtos.add(new CategoryDto(category.getId(), category.getName()));
        }

        return categoryDtos;
    }
    
    @PostMapping("")
    public Category addCategory(@RequestBody Category category) {
        return categoryService.addCategory(category);
    }
    
    @DeleteMapping("/{categoryId}")
    public void deleteCategory(@PathVariable int categoryId) {
        categoryService.deleteCategory(categoryId);
    }
    
    @PutMapping("/{categoryId}")
    public Category updateCategory(@PathVariable int categoryId, @RequestBody Category category) {
        category.setId(categoryId);
        return categoryService.updateCategory(category);
    }
    
    @GetMapping("/{categoryId}")
    public Category getCategoryById(@PathVariable int categoryId) {
        return categoryService.getCategoryById(categoryId);
    }
    
    
}
