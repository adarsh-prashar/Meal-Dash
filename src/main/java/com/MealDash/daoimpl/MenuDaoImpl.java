package com.MealDash.daoimpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.MealDash.dao.MenuDao;
import com.MealDash.model.Menu;
import com.MealDash.model.Restaurant;


public class MenuDaoImpl implements MenuDao{
	
	String url = "jdbc:mysql://localhost:3306/mealdash";
	String userName = "root";
	String password = "Adarsh@123";
	
	Connection connection = null;
	PreparedStatement statement = null;
	ResultSet resultset = null;
	
	public MenuDaoImpl() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(url, userName, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void addMenu(Menu menu) {
        String insert = "INSERT INTO `menu`(`itemName`,`description`,`price`,`ratings`,`imagePath`) VALUES(?,?,?,?,?)";
		
		try {
			statement = connection.prepareStatement(insert);
			statement.setString(1, menu.getItemName());
			statement.setString(2, menu.getDescription());
			statement.setDouble(3, menu.getPrice());
			statement.setDouble(4, menu.getRatings());
			statement.setString(5, menu.getImagePath());
			
			statement.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public Menu getMenu(int menuId) {
		String collect = "SELECT * FROM `menu` where `menuId`=?";
		Menu menu = null;
		
		try {
			statement = connection.prepareStatement(collect);
			statement.setInt(1, menuId);
			resultset = statement.executeQuery();
			
			if (resultset.next()) {
				menu = extractMenuFromResultSet(resultset);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return menu;
	}

	private Menu extractMenuFromResultSet(ResultSet resultset) {
		Menu menu = new Menu();
		try {
			menu.setMenuId(resultset.getInt("menuId"));
			menu.setRestaurantId(resultset.getInt("restaurantId"));
			menu.setItemName(resultset.getString("itemName"));
			menu.setDescription(resultset.getString("description"));
			menu.setPrice(resultset.getDouble("price"));
			menu.setRatings(resultset.getDouble("ratings"));
			menu.setImagePath(resultset.getString("imagePath"));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return menu;
	}

	@Override
	public void updateMenu(Menu menu) {
        String update = "UPDATE `menu` SET `itemName` = ?, `description` = ?, `price` = ?, `ratings` = ?, `imagePath` = ? WHERE `menuId` = ?";
		
		try {
			statement = connection.prepareStatement(update);
			statement.setString(1, menu.getItemName());
			statement.setString(2, menu.getDescription());
			statement.setDouble(3, menu.getPrice());
			statement.setDouble(4, menu.getRatings());
			statement.setString(5, menu.getImagePath());
			statement.setInt(6, menu.getMenuId());
			
			statement.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void deleteMenu(int MenuId) {
        String delete = "DELETE FROM `menu` WHERE `menuId` = ?";
		
		try {
			statement = connection.prepareStatement(delete);
			statement.setInt(1, MenuId);
			statement.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
	}

	@Override
	public List<Menu> getAllMenu() {
		String get = "SELECT * FROM `menu`";
		Menu menu = null;
		List<Menu> al = new ArrayList();
		
		try {
			statement = connection.prepareStatement(get);
			resultset = statement.executeQuery();
			
			while(resultset.next()) {
				menu = extractMenuFromResultSet(resultset);
				al.add(menu);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return al;
	}

	@Override
	public List<Menu> getAllMenuByRestaurant(int RestaurantId) {
		String getRestaurant = "SELECT * FROM `menu` WHERE `RestaurantId` = ?";
		Menu menu = null;
		List<Menu> al = new ArrayList();
		
		try {
			statement = connection.prepareStatement(getRestaurant);
			statement.setInt(1, RestaurantId);
			resultset = statement.executeQuery();
			
			while(resultset.next()) {
				menu = extractMenuFromResultSet(resultset);
				al.add(menu);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return al;
	}

}
