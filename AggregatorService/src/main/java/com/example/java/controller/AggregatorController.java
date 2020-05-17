package com.example.java.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.java.services.AggregatorService;

@RestController
@RequestMapping("/orderdetails")
public class AggregatorController {

	@Autowired
	AggregatorService aggregatorService;

	@GetMapping("/{id}")
	public ResponseEntity<Object> getUser(@PathVariable Integer id) {
		return ResponseEntity.status(HttpStatus.OK).body(aggregatorService.getOrderDetails(id));
	}
}
