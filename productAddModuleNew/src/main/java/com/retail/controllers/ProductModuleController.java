package com.retail.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/app")
public class ProductModuleController {
	@RequestMapping(name="MappingName1", path="/productAdd", produces="application/json")
	public String ProductAddHome() {
		System.out.println("Inside ProductAddHome!!!");
		return "Success";
		
	}
}
