package com.MealDash.model;

public class Restaurant {

	private int restaurantId;
	private String restaurantName;
	private String imagepath;
	private double rating;
	private int deliveryTime;
	private String cuisineType;
	private String address;
	private boolean isActive;
	private int restaurantOwnerId;
	
	public Restaurant() {
		
	}

	public Restaurant(int restaurantId, String restaurantName, String imagepath, double rating, int deliveryTime,
			String cuisineType, String address, boolean isActive, int restaurantOwnerId) {
		super();
		this.restaurantId = restaurantId;
		this.restaurantName = restaurantName;
		this.imagepath = imagepath;
		this.rating = rating;
		this.deliveryTime = deliveryTime;
		this.cuisineType = cuisineType;
		this.address = address;
		this.isActive = isActive;
		this.restaurantOwnerId = restaurantOwnerId;
	}
	
	public Restaurant(String restaurantName, String imagepath, double rating, int deliveryTime,
			String cuisineType, String address, boolean isActive) {
		super();
		this.restaurantName = restaurantName;
		this.imagepath = imagepath;
		this.rating = rating;
		this.deliveryTime = deliveryTime;
		this.cuisineType = cuisineType;
		this.address = address;
		this.isActive = isActive;
	}

	public int getRestaurantId() {
		return this.restaurantId;
	}

	public void setRestaurantId(int restaurantId) {
		this.restaurantId = restaurantId;
	}

	public String getRestaurantName() {
		return restaurantName;
	}

	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}

	public String getImagepath() {
		return imagepath;
	}

	public void setImagepath(String imagepath) {
		this.imagepath = imagepath;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public int getdeliveryTime() {
		return this.deliveryTime;
	}

	public void setdeliveryTime(int deliveryTime) {
		this.deliveryTime = deliveryTime;
	}

	public String getCuisineType() {
		return cuisineType;
	}

	public void setCuisineType(String cuisineType) {
		this.cuisineType = cuisineType;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public boolean getIsActive() {
		return this.isActive;
	}

	public void setIsActive(boolean isActive) {
		this.isActive = isActive;
	}

	public int getRestaurantOwnerId() {
		return restaurantOwnerId;
	}

	public void setRestaurantOwnerId(int restaurantOwnerId) {
		this.restaurantOwnerId = restaurantOwnerId;
	}

	@Override
	public String toString() {
		return "Restaurant [restaurantId=" + restaurantId + ", restaurantName=" + restaurantName + ", imagepath="
				+ imagepath + ", rating=" + rating + ", deliveryTime=" + deliveryTime + ", cuisineType=" + cuisineType + ", address="
				+ address + ", isActive=" + isActive+ "]";
	}
	
	
}
