<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List" %>
<%@ page import="com.MealDash.model.Restaurant" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Restaurant Search Results</title>
    <link rel="stylesheet" href="Style/Search.css">
</head>
<body>
    <header>
        <h1>Find Your Favorite Restaurant</h1>
    </header>

    <div class="restaurant-container">
        <% 
        List<Restaurant> searchResults = (List<Restaurant>) request.getAttribute("searchResults");
        if (searchResults != null && !searchResults.isEmpty()) {
            for (Restaurant r : searchResults) {
        %>
            <!-- Restaurant card -->
            <a href="MenuServlet?restaurantId=<%= r.getRestaurantId() %>" class="restaurant-card-link">
                <div class="restaurant-card">
                    <img class="restaurant-image" src="<%= r.getImagepath() %>" alt="restaurant image">
                    <div class="restaurant-name"><%= r.getRestaurantName() %></div>
                    <div class="restaurant-details">
                        <%= r.getCuisineType() %> | <%= r.getRating() %> | <%= r.getdeliveryTime() %> mins
                    </div>
                    <div class="restaurant-address"><%= r.getAddress() %></div>
                </div>
            </a>
        <% 
            }
        } else {
        %>
            <p>No results found for your search.</p>
        <% 
        }
        %>
    </div>

</body>
</html>
