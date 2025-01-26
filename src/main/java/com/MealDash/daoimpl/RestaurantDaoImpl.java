package com.MealDash.daoimpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.MealDash.dao.RestaurantDao;
import com.MealDash.model.Restaurant;


public class RestaurantDaoImpl implements RestaurantDao{
	
	String url = "jdbc:mysql://localhost:3306/mealdash";
	String userName = "root";
	String password = "Adarsh@123";
	
	Connection connection = null;
	PreparedStatement statement = null;
	ResultSet resultset = null;
	
	public RestaurantDaoImpl() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(url, userName, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	@Override
	public void addRestaurant(Restaurant restaurant) {
		String insert = "INSERT INTO `restaurant`(`restaurantName`,`imagepath`,`rating`,`deliveryTime`,`cuisineType`,`address`,`isActive`) VALUES(?,?,?,?,?,?,?)";
		
		try {
			statement = connection.prepareStatement(insert);
			statement.setString(1, restaurant.getRestaurantName());
			statement.setString(2, restaurant.getImagepath());
			statement.setDouble(3, restaurant.getRating());
			statement.setInt(4, restaurant.getdeliveryTime());
			statement.setString(5, restaurant.getCuisineType());
			statement.setString(6, restaurant.getAddress());
			statement.setBoolean(7, restaurant.getIsActive());
			
			statement.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public Restaurant getRestaurant(int restaurantId) {
		String collect = "SELECT * FROM `restaurant` where `restaurantId`=?";
		Restaurant restaurant = null;
		
		try {
			statement = connection.prepareStatement(collect);
			statement.setInt(1, restaurantId);
			resultset = statement.executeQuery();
			
			if (resultset.next()) {
				restaurant = extractRestaurantFromResultSet(resultset);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return restaurant;
	}

	private Restaurant extractRestaurantFromResultSet(ResultSet resultset) {
		Restaurant restaurant = new Restaurant();
		try {
			restaurant.setRestaurantId(resultset.getInt("restaurantId"));
			restaurant.setRestaurantName(resultset.getString("restaurantName"));
			restaurant.setImagepath(resultset.getString("imagepath"));
			restaurant.setRating(resultset.getDouble("rating"));
			restaurant.setdeliveryTime(resultset.getInt("deliveryTime"));
			restaurant.setCuisineType(resultset.getString("cuisineType"));
			restaurant.setAddress(resultset.getString("address"));
			restaurant.setIsActive(resultset.getBoolean("isActive"));
			restaurant.setRestaurantOwnerId(resultset.getInt("restaurantOwnerId"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return restaurant;
	}


	@Override
	public void updateRestaurant(Restaurant restaurant)  {
		String update = "UPDATE `restaurant` SET `restaurantName` = ?, `imagepath` = ?, `rating` = ?, `deliveryTime` = ?, `cuisineType` = ?, `address` = ?, `isActive` = ? WHERE `restaurantId` = ?";
		
		try {
			statement = connection.prepareStatement(update);
			statement.setString(1, restaurant.getRestaurantName());
			statement.setString(2, restaurant.getImagepath());
			statement.setDouble(3, restaurant.getRating());
			statement.setInt(4, restaurant.getdeliveryTime());
			statement.setString(5, restaurant.getCuisineType());
			statement.setString(6, restaurant.getAddress());
			statement.setBoolean(7, restaurant.getIsActive());
			statement.setInt(8, restaurant.getRestaurantId());
			
			statement.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void deleteRestaurant(int restaurantId) {
        String delete = "DELETE FROM `restaurant` WHERE `restaurantId` = ?";
		
		try {
			statement = connection.prepareStatement(delete);
			statement.setInt(1, restaurantId);
			statement.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
	}

	@Override
	public List<Restaurant> getAllRestaurant() {
		String get = "SELECT * FROM `restaurant`";
		Restaurant restaurant = null;
		List<Restaurant> al = new ArrayList();
		
		try {
			statement = connection.prepareStatement(get);
			resultset = statement.executeQuery();
			
			while(resultset.next()) {
				restaurant = extractRestaurantFromResultSet(resultset);
				al.add(restaurant);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return al;
	}

}
