package com.system.spring.web.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.system.spring.repos.EmployeeRepository;
import com.system.spring.web.entities.Employees;


@RestController
@RequestMapping("/addEmp")
public class EmployeeController {

	@Autowired
	EmployeeRepository repository;
	
	/* @GetMapping
	public Iterable<Product> getProducts(){
		return repository.findAll();
	} */
	
	@PostMapping
    @ResponseStatus(HttpStatus.CREATED)
	public Employees create(@Valid @RequestBody Employees employees) {
		return repository.save(employees);
	}
	
	/* @PutMapping
	public Product update(@RequestBody Product product) {
		return repository.save(product);
	}
	
	@GetMapping("/{}id")
	public Product getProduct(@PathVariable("id") Long id) {
		return repository.findOne(id);
	} */ 
}
