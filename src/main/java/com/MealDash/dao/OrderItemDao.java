package com.MealDash.dao;

import java.util.List;


import com.MealDash.model.OrderItem;

public interface OrderItemDao {

	void addOrderItem(OrderItem orderItem);
	OrderItem getOrderItem(int orderItemId);
	void updateOrderItem(OrderItem orderItem);
	void deleteOrderItem(int orderItemId);
	List<OrderItem> getAllMenu();
}
