package com.example.java.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.java.model.Order;
import com.example.java.model.OrdersResponse;

@Service
public class OrderService {

	HashMap<Integer, List<Order>> allUsersOrders;
	{
		allUsersOrders = new HashMap<>();
		Order order1 = new Order(256, new Date(), 1);
		Order order2 = new Order(1024, new Date(), 2);
		Order order3 = new Order(500, new Date(), 3);
		Order order4 = new Order(488, new Date(), 4);
		Order order5 = new Order(1233, new Date(), 5);
		
		List<Order> ordersForUser1 = new ArrayList<>();
		List<Order> ordersForUser2 = new ArrayList<>();
		ordersForUser1.add(order1);
		ordersForUser1.add(order2);
		ordersForUser1.add(order3);
		ordersForUser2.add(order4);
		ordersForUser2.add(order5);
		
		allUsersOrders.put(1, ordersForUser1);
		allUsersOrders.put(2, ordersForUser2);
	}
	
	public HashMap<Integer, List<Order>> getAllOrders() {
		return allUsersOrders;
	}
	
	public OrdersResponse getUserOrders(Integer id) {
		OrdersResponse ordersResponse = new OrdersResponse();
		ordersResponse.setOrders(allUsersOrders.get(id));
		return ordersResponse;
	}
}
