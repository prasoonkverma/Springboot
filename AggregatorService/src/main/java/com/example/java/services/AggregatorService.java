package com.example.java.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.java.model.OrderDetails;
import com.example.java.model.OrdersResponse;
import com.example.java.model.User;

@Service
public class AggregatorService {
	
	@Value("${USERSERVICE_URL}")
	String userServiceEndpoint;
	
	@Value("${ORDERSERVICE_URL}")
	String orderServiceEndpoint;
	
	@Autowired
	RestTemplate restTemplate;
	
	
	
	public OrderDetails getOrderDetails(Integer id) {

		String userServiceUri = userServiceEndpoint + "/users/" + id;
		System.out.println("CALLING API: UserService : " + userServiceUri);
	    User user = restTemplate.getForObject(userServiceUri, User.class);
	    System.out.println("Response from UserService : " + user);
	    
	    String orderServiceUri = orderServiceEndpoint + "/orders/" + id;
	    System.out.println("CALLING API: OrderService : " + orderServiceUri);
	    OrdersResponse orderResponse = restTemplate.getForObject(orderServiceUri, OrdersResponse.class);
	    System.out.println("Response from OrderService : " + orderResponse);

	    OrderDetails orderDetails = new OrderDetails();
	    orderDetails.setUserDetails(user);
	    orderDetails.setOrders(orderResponse.getOrders());
		return orderDetails;
	}
}
