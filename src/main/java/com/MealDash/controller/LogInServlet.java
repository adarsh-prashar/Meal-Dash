package com.MealDash.controller;

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.MealDash.daoimpl.UserDaoImpl;
import com.MealDash.model.User;

@WebServlet("/LogInServlet")
public class LogInServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String userName = request.getParameter("username");
		String password = request.getParameter("password");
		
		UserDaoImpl userDaoImpl = new UserDaoImpl();
		User user = new User();
		userDaoImpl.getUser(userName);
		userDaoImpl.getUser(password);
		System.out.println("failed");
		if(password.equals(user.getPassword())) {
			RequestDispatcher rd = request.getRequestDispatcher("Restaurant.jsp");
			rd.forward(request, response);
		}
		else {
			response.sendRedirect("RestaurantFailure.jsp");
			System.out.println("failed");
		}
	}

}
