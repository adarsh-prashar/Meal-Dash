package com.MealDash.dao;

import java.util.List;

import com.MealDash.model.Menu;

public interface MenuDao {

	void addMenu(Menu menu);
	Menu getMenu(int menuId);
	void updateMenu(Menu menu);
	void deleteMenu(int MenuId);
	List<Menu> getAllMenu();
	List<Menu> getAllMenuByRestaurant(int RestaurantId);
}
