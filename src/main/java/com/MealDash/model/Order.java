package com.MealDash.model;
import java.time.LocalDateTime;

public class Order {

	int orderId;
	LocalDateTime orderDate;
	String imagepath;
	double price;
	String name;
	String status;
	String paymentMethod;
	int userId;
	int restaurantId;
	
	public Order() {
	}

	public Order(int orderId, LocalDateTime orderDate, String imagepath, double price, String name, String status,
			String paymentMethod, int userId, int restaurantId) {
		super();
		this.orderId = orderId;
		this.orderDate = orderDate;
		this.imagepath = imagepath;
		this.price = price;
		this.name = name;
		this.status = status;
		this.paymentMethod = paymentMethod;
		this.userId = userId;
		this.restaurantId = restaurantId;
	}
	
	public Order(LocalDateTime orderDate, String imagepath, double price, String name, String status,
			String paymentMethod) {
		super();
		this.orderDate = orderDate;
		this.imagepath = imagepath;
		this.price = price;
		this.name = name;
		this.status = status;
		this.paymentMethod = paymentMethod;
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

	public String getImagepath() {
		return imagepath;
	}

	public void setImagepath(String imagepath) {
		this.imagepath = imagepath;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getRestaurantId() {
		return restaurantId;
	}

	public void setRestaurantId(int restaurantId) {
		this.restaurantId = restaurantId;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", orderDate=" + orderDate + ", imagepath=" + imagepath + ", price="
				+ price + ", name=" + name + ", status=" + status + ", paymentMethod=" + paymentMethod + ", userId="
				+ userId + ", restaurantId=" + restaurantId + "]";
	}
	
	
}
