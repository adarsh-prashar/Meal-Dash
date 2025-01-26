<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="com.MealDash.model.CartItem" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Shopping Cart</title>
    <link rel="stylesheet" href="Style/Cart.css">
    <script>
        function updatePrice(quantity, price, itemId) {
            var totalPrice = quantity * price;
            // Update total price on the page
            document.getElementById("totalPrice_" + itemId).innerText = '₹' + totalPrice.toFixed(2);
            // Update hidden input value (for form submission)
            document.getElementById("itemPrice_" + itemId).value = totalPrice.toFixed(2);
            updateTotalAmount();
        }

        function updateTotalAmount() {
            var totalAmount = 0;
            var prices = document.querySelectorAll('.item-total-price');
            prices.forEach(function (priceElement) {
                totalAmount += parseFloat(priceElement.innerText.replace('₹', '').trim());
            });
            document.getElementById("totalAmount").innerText = '₹' + totalAmount.toFixed(2);
        }

        window.onload = updateTotalAmount; // Initialize the total amount when the page loads
    </script>
</head>
<body>

<h1 class="aesthetic-title">Everything You Need In One Place For Your Convenience And Delight</h1>

<%
    List<CartItem> cart = (List<CartItem>) session.getAttribute("cart");
    if (cart != null && !cart.isEmpty()) {
        for (CartItem cartItem : cart) {
%>

<div class="cart-item">
    <img src="<%= cartItem.getImagePath() %>" alt="<%= cartItem.getItemName() %>">
    <div class="cart-item-details">
        <div class="cart-item-info">
            <h2><%= cartItem.getItemName() %></h2>
            <p class="restaurant-name"><strong>Restaurant:</strong> 
                <%= (cartItem.getRestaurantName() != null) ? cartItem.getRestaurantName() : "Unknown Restaurant" %>
            </p>
            <div class="cart-item-price">
                <span class="price"><span id="totalPrice_<%= cartItem.getItemId() %>" class="item-total-price"><%= cartItem.getPrice() * cartItem.getQuantity() %></span></span>
            </div>
            <div class="quantity-container">
                <label for="quantity_<%= cartItem.getItemId() %>">Qty:</label>
                <input type="number" id="quantity_<%= cartItem.getItemId() %>" name="quantity" value="<%= cartItem.getQuantity() %>" min="1" 
                       onchange="updatePrice(this.value, <%= cartItem.getPrice() %>, <%= cartItem.getItemId() %>)">
            </div>
        </div>
        
        <div class="cart-item-buttons">
            <form action="Restaurant.jsp" method="post">
                <input type="hidden" name="itemId" value="<%= cartItem.getItemId() %>">
                <input type="hidden" name="itemName" value="<%= cartItem.getItemName() %>">
                <input type="hidden" name="itemPrice" id="itemPrice_<%= cartItem.getItemId() %>" value="<%= cartItem.getPrice() * cartItem.getQuantity() %>">
                <input type="hidden" name="itemImagePath" value="<%= cartItem.getImagePath() %>">
                <input type="hidden" name="restaurantName" value="<%= cartItem.getRestaurantName() %>">
                <input type="hidden" name="rating" value="<%= cartItem.getRestaurantName() %>">
                <button type="submit" class="update-button">Update Cart</button>
            </form>
            
            <form action="DeleteFromCartServlet" method="post" style="display:inline;">
                <input type="hidden" name="itemId" value="<%= cartItem.getItemId() %>">
                <button type="submit" class="delete-button">Delete</button>
            </form>
        </div>
    </div>
</div>

<%
        }
    } else {
%>
    <p>Your cart is empty.</p>
<%
    }
%>

<!-- To Pay Amount Box -->
<div class="total-amount-box">
    <div class="bill-details">
        <p><strong>To Pay: <span id="totalAmount">₹0.00</span></p>
    </div>
    <div class="action-buttons">
        <a href="Restaurant.jsp" class="button add-more-items">Add More Items</a>
        <a href="Checkout.jsp" class="button proceed-to-checkout">Proceed to Checkout</a>
    </div>
</div>


</body>
</html>
