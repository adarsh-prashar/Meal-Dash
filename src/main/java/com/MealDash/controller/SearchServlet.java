package com.MealDash.controller;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.MealDash.model.Restaurant;
import com.MealDash.service.RestaurantService;

@WebServlet("/SearchServlet")  
public class SearchServlet extends HttpServlet {
 
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String query = request.getParameter("query");
        RestaurantService restaurantService = new RestaurantService();
        List<Restaurant> searchResults = restaurantService.searchRestaurants(query);

        request.setAttribute("searchResults", searchResults);
        request.getRequestDispatcher("searchResults.jsp").forward(request, response);
    }
}
