package com.MealDash.dao;

import java.util.List;

import com.MealDash.model.OrderHistory;


public interface OrderHistoryDao {

	void addOrderHistory(OrderHistory orderHistory);
	OrderHistory getOrderHistory(int orderHistoryId);
	void updateOrderHistory(OrderHistory orderHistory);
	void deleteOrderHistory(int orderHistoryId);
	List<OrderHistory> getAllMenu();
}
