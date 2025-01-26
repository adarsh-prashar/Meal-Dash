<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="com.MealDash.model.Menu" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Menu List</title>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css">
<link rel="stylesheet" href="Style/Menu.css"> 
</head>
<body>
<%
    String restaurantName = (String) request.getAttribute("restaurantName");  
%>

<header>
    <h1><%= restaurantName != null ? restaurantName : "Meal Dash" %></h1>
</header>

<main>
    <div class="menu-container">
        <%
            List<Menu> menuList = (List<Menu>) request.getAttribute("menuList");
            if (menuList != null) {
                for (Menu menu : menuList) {
        %>
            <div class="menu-item">
                <img src="<%= menu.getImagePath() %>" alt="<%= menu.getItemName() %>">
                <div class="menu-item-content">
                    <h2><%= menu.getItemName() %></h2>
                    <p class="description"><%= menu.getDescription() %></p>
                    <p class="price">&#8377;<%= menu.getPrice() %></p>
                    <div class="ratings">
                        <span class="rating-logo"><i class="fas fa-star"></i></span>
                        <span><%= menu.getRatings() %></span>
                    </div>
                </div>
                <form action="CartServlet" method="post">
                    <input type="hidden" name="itemId" value="<%= menu.getMenuId() %>">
                    <input type="hidden" name="itemName" value="<%= menu.getItemName() %>">
                    <input type="hidden" name="itemPrice" value="<%= menu.getPrice() %>">
                    <input type="hidden" name="itemImagePath" value="<%= menu.getImagePath() %>">
                    <input type="hidden" name="restaurantName" value="<%= restaurantName %>">
                    <input type="hidden" name="quantity" value="1">
                    <button type="submit" class="add-button">Add to Cart</button>
                </form>
            </div>
        <%
                }
            } else {
        %>
        <p>No menu items available.</p>
        <% } %>
    </div>
</main>
</body>
</html>
