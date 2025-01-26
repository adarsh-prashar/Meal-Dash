<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login - Meal Dash</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css">
    <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@400;500;600&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="Style/LogIn.css">
</head>
<body>
    <div class="theme-controls">
        <button class="mode-btn" id="darkModeToggle" title="Toggle Dark Theme">
            <i class="fas fa-moon"></i>
            <span>Dark Theme</span>
        </button>
    </div>

    <div class="background-design"></div>
    
    <div class="container">
        <div class="login-container">
            <div class="login-header">
                <div class="logo-text">Meal<span>Dash</span></div>
                <h1>Welcome Back!</h1>
                <p>Sign in to continue your food journey</p>
            </div>
            <form id="loginForm" class="login-form" action="Restaurant.jsp" method="post">
                <div class="form-group">
                    <input type="text" id="username" placeholder="Username" required>
                    <i class="fas fa-user"></i>
                </div>
                <div class="form-group">
                    <input type="password" id="password" placeholder="Password" required>
                    <i class="fas fa-eye-slash password-toggle" id="passwordToggle"></i>
                </div>
                <div class="form-options">
                    <label class="remember-me">
                        <input type="checkbox" id="rememberMe">
                        <span>Remember me</span>
                    </label>
                    <a href="#" class="forgot-password">Forgot Password?</a>
                </div>
                <button type="submit" class="login-btn">LOGIN</button>
                <div class="signup-link">
                    <p>New to our platform? <a href="SignIn.jsp">Create account</a></p>
                </div>
            </form>
        </div>
    </div>

    <script src="Style/LogIn.js"></script>
</body>
</html>
