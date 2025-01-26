package com.MealDash.model;

public class Menu {
	
	private int menuId;
	private int restaurantId;
	private String itemName;
	private String description;
	private double price;
	private double ratings;
	private String imagePath;
	
	public Menu() {
	}

	public Menu(int menuId, int restaurantId, String itemName, String description, double price, double ratings,
			String imagePath) {
		super();
		this.menuId = menuId;
		this.restaurantId = restaurantId;
		this.itemName = itemName;
		this.description = description;
		this.price = price;
		this.ratings = ratings;
		this.imagePath = imagePath;
	}
	
	public Menu(String itemName, String description, double price, double ratings,
			String imagePath) {
		super();
		this.itemName = itemName;
		this.description = description;
		this.price = price;
		this.ratings = ratings;
		this.imagePath = imagePath;
	}

	public int getMenuId() {
		return menuId;
	}

	public void setMenuId(int menuId) {
		this.menuId = menuId;
	}

	public int getRestaurantId() {
		return restaurantId;
	}

	public void setRestaurantId(int restaurantId) {
		this.restaurantId = restaurantId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	@Override
	public String toString() {
		return "Menu [menuId=" + menuId + ", restaurantId=" + restaurantId + ", itemName=" + itemName + ", description="
				+ description + ", price=" + price + ", ratings=" + ratings + ", imagePath=" + imagePath + "]";
	}
	
	
}
