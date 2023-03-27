package com.inventisoft.productservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller_hello {
	@GetMapping(path="/")
	public String hello_world() {
		return ("hello world");
	}
}
