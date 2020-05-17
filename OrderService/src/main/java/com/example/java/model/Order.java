package com.example.java.model;

import java.util.Date;

public class Order {

	private Integer orderAmount;
	private Date orderDate;
	private Integer orderId;
	
	public Order() {
		super();
	}
	
	public Order(Integer orderAmount, Date orderDate, Integer orderId) {
		super();
		this.orderAmount = orderAmount;
		this.orderDate = orderDate;
		this.orderId = orderId;
	}

	public Integer getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(Integer orderAmount) {
		this.orderAmount = orderAmount;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
}
