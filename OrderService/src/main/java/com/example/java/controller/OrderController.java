package com.example.java.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.java.services.OrderService;

@RestController
@RequestMapping("/orders")
public class OrderController {

	@Autowired
	OrderService orderService;

	@GetMapping("/all")
	public ResponseEntity<Object> getAllOrders() {
		return ResponseEntity.status(HttpStatus.OK).body(orderService.getAllOrders());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Object> getUserOrders(@PathVariable Integer id) {
		return ResponseEntity.status(HttpStatus.OK).body(orderService.getUserOrders(id));
	}
}
