package com.MealDash.dao;

import java.util.List;

import com.MealDash.model.User;

public interface UserDao {
	
	boolean addUser(User user);
	User getUser(int userId);
	User getUser(String userName);
	void updateUser(User user);
    void  deleteUser(int userId);
	List<User> getAllUser();
}
