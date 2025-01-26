package com.MealDash.dao;

import java.util.List;

import com.MealDash.model.Order;



public interface OrderDao {

	void addOrder(Order order);
	Order getOrder(int orderId);
	void updateOrder(Order order);
	void deleteOrder(int orderId);
	List<Order> getAllMenu();
}
