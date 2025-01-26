package com.MealDash.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.MealDash.daoimpl.UserDaoImpl;
import com.MealDash.model.User;

@WebServlet("/SignInServlet")
public class SignInServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String username = request.getParameter("username");
        String email = request.getParameter("email");
        String phoneNumberStr = request.getParameter("phoneNumber");
        String address = request.getParameter("address");
        String password = request.getParameter("password");

        long phoneNumber = 0;
        try {
            phoneNumber = Long.parseLong(phoneNumberStr);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            request.setAttribute("errorMessage", "Invalid phone number format.");
            request.getRequestDispatcher("error.jsp").forward(request, response);
            return;
        }

        User user = new User(name, username, email, phoneNumber, address, password);
        UserDaoImpl userDao = new UserDaoImpl();
        boolean result = userDao.addUser(user);

        if (result) {
            response.sendRedirect("success.jsp");
        } else {
            request.setAttribute("errorMessage", "Failed to sign in. Please try again later.");
            request.getRequestDispatcher("error.jsp").forward(request, response);
        }
    }

}
