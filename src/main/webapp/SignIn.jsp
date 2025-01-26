<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Sign In - Meal Dash</title>
  <link rel="stylesheet" href="Style/SignIn.css"> 
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css">
  <script src="Style/SignIn.js"></script> 
</head>
<body>
  <!-- Dark Mode Button -->
  <button id="themeToggle" class="theme-toggle">Dark Mode</button>

  <!-- Main Container -->
  <div class="main-container">
    <!-- Left Section -->
    <div class="left-side">
      <h1>Welcome to Meal Dash</h1>
      <p>Discover delicious meals and sign in to get started.</p>
      <img src="https://wallpapercave.com/wp/wp7029441.jpg" alt="Delicious Meal" class="food-image">
    </div>

    <!-- Right Section -->
    <div class="right-side">
      <form id="signinForm" action="LogIn.jsp" method="POST">
        <div class="signin-card">
          <!-- Logo text before Sign In -->
          <div class="meal-dash-logo">
            <h2>Meal Dash</h2>
          </div>

          <h2>Sign In</h2>
          <div class="input-group">
            <i class="fas fa-user"></i>
            <input type="text" id="name" placeholder="Full Name" required>
          </div>
          <div class="input-group">
            <i class="fas fa-user-tag"></i>
            <input type="text" id="username" placeholder="Username" required>
          </div>
          <div class="input-group">
            <i class="fas fa-envelope"></i>
            <input type="email" id="email" placeholder="Email" required>
          </div>
          <div class="input-group">
            <i class="fas fa-phone"></i>
            <input type="tel" id="phoneNumber" placeholder="phoneNumber" required>
          </div>
          <div class="input-group">
            <i class="fas fa-home"></i>
            <textarea id="address" placeholder="Address" required></textarea>
          </div>
          <div class="input-group">
            <i class="fas fa-lock"></i>
            <input type="password" id="password" placeholder="Password" required>
            <i class="fas fa-eye-slash toggle-password"></i>
          </div>
          <button type="submit" class="signin-btn">Sign In</button>
        </div>
      </form>
    </div>
  </div>

  
</body>
</html>
