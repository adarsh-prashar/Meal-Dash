package com.MealDash.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.MealDash.daoimpl.MenuDaoImpl;
import com.MealDash.model.Menu;


@WebServlet("/MenuServlet")
public class MenuServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	    int restaurantId = Integer.parseInt(req.getParameter("restaurantId"));
	    String restaurant = req.getParameter("restaurantName");

	    MenuDaoImpl menuDaoImpl = new MenuDaoImpl();
	    List<Menu> menuList = menuDaoImpl.getAllMenuByRestaurant(restaurantId);
	    req.setAttribute("menuList", menuList);
	    req.setAttribute("restaurantName", restaurant); 
	    
	    RequestDispatcher rd = req.getRequestDispatcher("Menu.jsp");
	    rd.forward(req, resp);
	}

}
