package com.MealDash.controller;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import com.MealDash.model.CartItem;

@WebServlet("/CartServlet")
public class CartServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Get item details from the form
    	int itemId = 0; // Default value
    	String itemIdStr = req.getParameter("itemId");
    	if (itemIdStr != null && !itemIdStr.isEmpty()) {
    	    try {
    	        itemId = Integer.parseInt(itemIdStr);
    	    } catch (NumberFormatException e) {
    	        e.printStackTrace();
    	        // Optionally log the error or provide feedback
    	    }
    	}
        String itemName = req.getParameter("itemName");
        double itemPrice = Double.parseDouble(req.getParameter("itemPrice"));
        String itemImagePath = req.getParameter("itemImagePath");

     // Assuming you retrieve restaurantName from the request
        String restaurantName = req.getParameter("restaurantName");

     // Create a CartItem object with the restaurantName included
        CartItem cartItem = new CartItem(itemId, itemName, itemPrice, 1, itemImagePath, restaurantName, 0.0);



        // Get the cart from the session
        HttpSession session = req.getSession();
        List<CartItem> cart = (List<CartItem>) session.getAttribute("cart");

        if (cart == null) {
            cart = new ArrayList<>();
        }

        // Add the item to the cart
        cart.add(cartItem);
        session.setAttribute("cart", cart);

        // Redirect to the cart page
        resp.sendRedirect("cart.jsp");
        
     // Assuming you are calculating the total amount in a servlet or in a scriptlet in JSP
        List<CartItem> cart1 = (List<CartItem>) session.getAttribute("cart");
        double totalAmount = 0.0;

        if (cart != null) {
            for (CartItem item : cart1) {
                totalAmount += item.getPrice() * item.getQuantity(); 
            }
        }
        req.setAttribute("totalAmount", totalAmount); 
      

    }
}
