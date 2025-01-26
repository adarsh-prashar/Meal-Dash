package com.MealDash.model;

import java.time.LocalDateTime;

public class OrderHistory {

	private int orderHistoryId;
	private int userId;
	private int orderId;
	private LocalDateTime orderDate;
	private double price;
	private String status;
	
	public OrderHistory() {
	}

	public OrderHistory(int orderHistoryId, int userId, int orderId, LocalDateTime orderDate, double price,
			String status) {
		super();
		this.orderHistoryId = orderHistoryId;
		this.userId = userId;
		this.orderId = orderId;
		this.orderDate = orderDate;
		this.price = price;
		this.status = status;
	}

	public int getOrderHistoryId() {
		return orderHistoryId;
	}

	public void setOrderHistoryId(int orderHistoryId) {
		this.orderHistoryId = orderHistoryId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public LocalDateTime getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDateTime orderDate) {
		this.orderDate = orderDate;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "OrderHistory [orderHistoryId=" + orderHistoryId + ", userId=" + userId + ", orderId=" + orderId
				+ ", orderDate=" + orderDate + ", price=" + price + ", status=" + status + "]";
	}
	
	
}
