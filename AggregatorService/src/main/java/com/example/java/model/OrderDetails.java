package com.example.java.model;

import java.util.List;

public class OrderDetails {

	User userDetails;
	List<Order> orders;
	
	public OrderDetails() {
		super();
	}
	
	public User getUserDetails() {
		return userDetails;
	}
	public void setUserDetails(User userDetails) {
		this.userDetails = userDetails;
	}
	public List<Order> getOrders() {
		return orders;
	}
	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	@Override
	public String toString() {
		return "OrderDetails [userDetails=" + userDetails + ", orders=" + orders + "]";
	}
	
	
}
