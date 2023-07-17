package com.service2.order_service.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service2.order_service.dto.OrderRequest;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api/order")
public class OrderController {
	
	@PostMapping
	public String placeOrder(@RequestBody OrderRequest orderRequest) {
		return "Ordine sistemato con successo";
	}
	

}
