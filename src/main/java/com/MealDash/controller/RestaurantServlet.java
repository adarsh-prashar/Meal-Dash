package com.MealDash.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.MealDash.daoimpl.RestaurantDaoImpl;
import com.MealDash.model.Restaurant;

@WebServlet("/RestaurantServlet")
public class RestaurantServlet extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RestaurantDaoImpl rdi = new RestaurantDaoImpl();
		List<Restaurant> restaurantlist = rdi.getAllRestaurant();
		
		
		
//	for(Restaurant list : restaurantlist) {
//		System.out.println(list.getRestaurantName());
//		System.out.println(list.getCuisineType());
//		}
////		
		HttpSession session = req.getSession();
		session.setAttribute("restaurantList", restaurantlist);
		
		

		RequestDispatcher rd = req.getRequestDispatcher("Restaurant.jsp");
		rd.forward(req, resp);
			
	}
}
