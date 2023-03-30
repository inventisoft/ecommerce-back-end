package com.inventisoft.productservice.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.inventisoft.productservice.Entity.is_product;
import com.inventisoft.productservice.Repository.is_product_repository;

@Controller
@RequestMapping(path="/demo_product")
//@RestController
public class is_product_controller {
	/*@GetMapping(path="/")
	public String hello_world() {
		return ("hello world");
	}*/
	@Autowired
	private is_product_repository repository;
	
	@PostMapping(path="/add_product")
	public @ResponseBody String addNewProduct (@RequestParam String product_code, String product_name, BigDecimal product_price_before, 
			BigDecimal product_price_after, String product_short_description, String product_long_description, String product_additional_information, String product_size) {
		is_product isp = new is_product();
		isp.setProduct_code(product_code);
		isp.setProduct_name(product_name);
		isp.setProduct_price_before(product_price_before);
		isp.setProduct_price_after(product_price_after);
		isp.setProduct_short_description(product_short_description);
		isp.setProduct_long_description(product_long_description);
		isp.setProduct_additional_information(product_additional_information);
		isp.setProduct_size(product_size);
		repository.save(isp);
		return "saved";
	}
	@GetMapping(path="/all_product")
	public @ResponseBody Iterable<is_product> getAllProducts(){
		return repository.findAll();
	}
	@DeleteMapping(path="/delete_product/{id}")
	public String delete(@PathVariable Integer id) {
		repository.deleteById(id);
		return "delete";
	}
	
}