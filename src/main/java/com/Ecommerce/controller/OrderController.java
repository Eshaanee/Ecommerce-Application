package com.Ecommerce.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Ecommerce.Model.Orders;
import com.Ecommerce.Service.OrderService;
import com.Ecommerce.web.dto.GetOrdersDto;


@RestController
@RequestMapping("/getOrders")
public class OrderController {

	private OrderService orderservice;
	
	@Autowired
    public OrderController(OrderService orderservice) {
        this.orderservice = orderservice;
    }
	
	 @GetMapping
	public List<Orders> getOrders(@RequestParam("userId") int userId) {
		 
		System.out.println("order id is " + userId);
		List<Orders> order =  orderservice.getorders(userId);
		
		return order;
	}
	
}
