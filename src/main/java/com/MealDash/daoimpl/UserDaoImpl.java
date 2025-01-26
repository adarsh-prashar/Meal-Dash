package com.MealDash.daoimpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import com.MealDash.dao.UserDao;
import com.MealDash.model.User;

public class UserDaoImpl implements UserDao{
	
	String url = "jdbc:mysql://localhost:3306/mealdash";
	String userName = "root";
	String password = "Adarsh@123";
	
	Connection connection = null;
	PreparedStatement statement = null;
	ResultSet resultset = null;
	
	public UserDaoImpl() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(url, userName, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	// In UserDaoImpl
	public boolean addUser(User user) {
	    String insert = "INSERT INTO `user`(`name`, `username`, `email`, `phonenumber`, `address`, `password`) VALUES(?, ?, ?, ?, ?, ?)";
	    
	    try (PreparedStatement statement = connection.prepareStatement(insert)) {
	        statement.setString(1, user.getName());
	        statement.setString(2, user.getUserName());
	        statement.setString(3, user.getEmail());
	        statement.setLong(4, user.getPhoneNumber());
	        statement.setString(5, user.getAddress());
	        statement.setString(6, user.getPassword());

	        int rowsInserted = statement.executeUpdate();
	        return rowsInserted > 0;
	    } catch (Exception e) {
	        e.printStackTrace();  // Log the exception
	        return false;
	    }
	}



	@Override
	public User getUser(int userId) {
		String collect = "SELECT * FROM `user` where `userId`=?";
		User user = null;
		
		try {
		    statement = connection.prepareStatement(collect);
			statement.setInt(1, userId);
			resultset = statement.executeQuery();
			
			if (resultset.next()) {
				user = extractUserFromResultSet(resultset);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return user;
	}

	private User extractUserFromResultSet(ResultSet resultset) {
		User user = new User();
		
		try {
			user.setUserId(resultset.getInt("userId"));
			user.setName(resultset.getString("name"));
			user.setEmail(resultset.getString("email"));
			user.setPhoneNumber(resultset.getLong("phoneNumber"));
			user.setAddress(resultset.getString("address"));
			user.setUserName(resultset.getString("userName"));
			user.setPassword(resultset.getString("password"));
			user.setRole(resultset.getString("role"));
			user.setCreatedDate(resultset.getTimestamp("createdDate").toLocalDateTime());
			user.setLastLoginDate(resultset.getTimestamp("lastLoginDate").toLocalDateTime());
	
			
			} catch (Exception e) {
			e.printStackTrace();
		}
		return user;
	}

	@Override
	public void updateUser(User user) {
		String update = "UPDATE `user` SET `name` = ?, `email` = ?, `phoneNumber` = ?, `address` = ?, `userName` = ?, `password` = ?, `role` = ?" + " WHERE `userId` = ?";
		
		try {
			statement = connection.prepareStatement(update);
			statement.setString(1, user.getName());
			statement.setString(2, user.getEmail());
			statement.setLong(3, user.getPhoneNumber());
			statement.setString(4, user.getAddress());
			statement.setString(5, user.getUserName());
			statement.setString(6, user.getPassword());
			statement.setString(7, user.getRole());
			statement.setInt(8, user.getUserId());
			
			statement.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void  deleteUser(int userId) {
		String delete = "DELETE FROM `user` WHERE `userId` = ?";
		
		try {
			statement = connection.prepareStatement(delete);
			statement.setInt(1, userId);
			statement.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<User> getAllUser() {
		String get = "SELECT * FROM `user`";
		User user = null;
		List<User> al = new ArrayList();
		
		try {
			statement = connection.prepareStatement(get);
			resultset = statement.executeQuery();
			
			while(resultset.next()) {
				user = extractUserFromResultSet(resultset);
				al.add(user);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return al;
	}

	@Override
	public User getUser(String userName) {
		String collect = "SELECT * FROM `user` where `userName`=? AND `password`=?";
		User user = null;
		try {
		    statement = connection.prepareStatement(collect);
			statement.setString(1, userName);
			statement.setString(2, password);
			resultset = statement.executeQuery();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return user;
	}	
}
