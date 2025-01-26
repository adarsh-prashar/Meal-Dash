package com.MealDash.model;


public class CartItem {
	    private int itemId;
	    private String itemName;
	    private double price;
	    private int quantity;
	    private String imagePath;
	    private String restaurantName;
	    private double rating; // Assuming rating is a double

	    public CartItem(int itemId, String itemName, double price, int quantity, String imagePath, String restaurantName, double rating) {
	        this.itemId = itemId;
	        this.itemName = itemName;
	        this.price = price;
	        this.quantity = quantity;
	        this.imagePath = imagePath;
	        this.restaurantName = restaurantName;
	        this.rating = rating;
	    }

    // Getters
    public int getItemId() { return itemId; }
    public String getItemName() { return itemName; }
    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }
    public String getImagePath() { return imagePath; }
    public String getRestaurantName() { return restaurantName; }

    // Setters (optional, depending on if you need to modify these fields later)
    public void setItemId(int itemId) { this.itemId = itemId; }
    public void setItemName(String itemName) { this.itemName = itemName; }
    public void setPrice(double price) { this.price = price; }
    public void setQuantity(int quantity) { this.quantity = quantity; }
    public void setImagePath(String imagePath) { this.imagePath = imagePath; }
    public void setRestaurantName(String restaurantName) { this.restaurantName = restaurantName; }

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}
}
