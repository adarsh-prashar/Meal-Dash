package com.MealDash.service;
import java.util.List;
import java.util.stream.Collectors;
import com.MealDash.model.Restaurant;

import com.MealDash.daoimpl.RestaurantDaoImpl;

public class RestaurantService {
    private RestaurantDaoImpl restaurantDAO = new RestaurantDaoImpl();

    public List<Restaurant> searchRestaurants(String query) {
        List<Restaurant> allRestaurants = restaurantDAO.getAllRestaurant();
        return allRestaurants.stream()
            .filter(r -> r.getRestaurantName().toLowerCase().contains(query.toLowerCase()))
            .collect(Collectors.toList());
    }
}
