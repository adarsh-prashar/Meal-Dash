package com.MealDash.model;

public class OrderItem {

	private int orderItemId;
	private int userId;
	private int menuId;
	private String itemName;
	private int quantity;
	private double price;
	private double ratings;
	private int orderid;
	
	public OrderItem() {
	}

	public OrderItem(int orderItemId, int userId, int menuId, String itemName, int quantity, double price,
			double ratings, int orderid) {
		super();
		this.orderItemId = orderItemId;
		this.userId = userId;
		this.menuId = menuId;
		this.itemName = itemName;
		this.quantity = quantity;
		this.price = price;
		this.ratings = ratings;
		this.orderid = orderid;
	}

	public int getOrderItemId() {
		return orderItemId;
	}

	public void setOrderItemId(int orderItemId) {
		this.orderItemId = orderItemId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getMenuId() {
		return menuId;
	}

	public void setMenuId(int menuId) {
		this.menuId = menuId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getRatings() {
		return ratings;
	}

	public void setRatings(double ratings) {
		this.ratings = ratings;
	}

	public int getOrderid() {
		return orderid;
	}

	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}

	@Override
	public String toString() {
		return "OrderItem [orderItemId=" + orderItemId + ", userId=" + userId + ", menuId=" + menuId + ", itemName="
				+ itemName + ", quantity=" + quantity + ", price=" + price + ", ratings=" + ratings + ", orderid="
				+ orderid + "]";
	}
	
	
}
