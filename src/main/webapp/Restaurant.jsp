<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List" %>
<%@ page import="com.MealDash.model.Restaurant" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Restaurant List</title>
<link rel="stylesheet" href="Style/Restaurant.css"> 
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.1/css/all.min.css" integrity="sha512-DTOQO9RWCH3ppGqcWaEA1BIZOC6xxalwEsw9c2QQeAIftl+Vegovlnee1c9QX4TctnWMn13TZye+giMm8e2LwA==" crossorigin="anonymous" referrerpolicy="no-referrer" />
<link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-50..200&icon_names=person" />

</head>
<body>
  <div class="nv">
<nav>
    <p>Meal Dash</p>
    <div class="right">
        <a href="offer.jsp"><i class="fas fa-gift"></i> Offers</a> 
         <a href="help.jsp"><i class="fas fa-question-circle"></i> Help</a>
        <a href="profile.jsp"><i class="fas fa-user"></i> Profile</a> 
        <a href="cart.jsp"><i class="fas fa-shopping-cart"></i> Cart</a>
        <a href="LogIn.jsp"><i class="fas fa-sign-in-alt"></i> Log In</a>
        <a href="SignIn.jsp"><i class="fas fa-user-plus"></i> Sign In</a>
        <a href="SignIn.jsp"><i class="fas fa-sign-out-alt"></i> Log Out</a>
    </div>
</nav>

<h1 id="welcome">Hi <span id="name">${sessionScope.name}</span>Welcome to Meal Dash</h1>
  <div class="logo">
  </div>  
  <div class="text">
    <h1>Discover the best food & drinks</h1>
  </div>
 <div class="inp">
    <form action="/MealDash/SearchServlet" method="GET"> 
        <input type="text" name="query" placeholder="Search items">
    </form>
</div>
    </div>
   
    <div class="coll"></div>
    <div class="txt">
        <h1>Discover Hidden Gems</h1>
        <p>Explore curated lists of top restaurants,cafes,pubs,and bars, based on trends</p>
    </div>
 <div class="restaurant-container">
        <!-- Loop through restaurants and display each as a card -->
        <%
        List<Restaurant> restaurants = (List<Restaurant>) session.getAttribute("restaurantList");
            for (Restaurant r : restaurants) {
        %>
        <form action="MenuServlet" method="POST">
            <button type="submit" class="restaurant-card" name="restaurantId"  value="<%= r.getRestaurantId() %>">
            <img class="restaurant-image" src=<%=r.getImagepath()%>
                alt="restaurant image" />
            <div class="restaurant-name"><%=r.getRestaurantName()%></div>
            <div class="restaurant-details">
                <span class="rating-logo"></span>
                <%=r.getCuisineType()%> |
                <span class="rating-logo"><i class="fas fa-star"></i></span>
                <%=r.getRating()%> |
                <span class="rating-logo"></span><i class="fas fa-motorcycle" style="color: green; font-size: 16px;"></i>
                <%= r.getdeliveryTime()%>mins
            </div>
            <div class="restaurant-address"><i class="fas fa-map-marker-alt" style="color: green; font-size: 16px;"></i>
<%=r.getAddress()%></div>
        </button></form>
        <%
        }
        %>
</div>


    <div class="app">
        <img src="https://b.zmtcdn.com/data/o2_assets/a500ffc2ab483bc6a550aa635f4e55531648107832.png" alt="">
    <h1>Get the My App</h1>
    </div>
    
    <div class="btn">
   <h1>Explore options near me</h1>
   <button>Popular Cities near me</button>
   <button>Popular restaurant near me</button>
   <button>Top restaurant near me</button>
   <button>Cities we deliver to</button>
    </div>
    
    
    <div class ="footer">
    <div class="list">
  <h2>About Myapp</h2>
  <p>Who we are</p>
  <p>Blog</p>
  <p>Work with us</p>
  <p>Investor Relation</p>
  <p>Help</p>
    </div>
    <div class="list">
        <h2>Zomaverse</h2>
        <p>Zomato</p>
        <p>Swiggy</p>
        <p>Blinkit</p>
        <p>Feeding India</p>
        <p>Hyperpure</p>
          </div>
          
        <div class="list">
            <h2>ForRestaurants</h2>
            <p>Partner with us</p>
            <p>apps for you</p>
             <p>Grow with Us</p>
            <p>Your Restaurant, Our Platform</p>
            <p>Transform Your Restaurant Experience</p>
         </div>
         
          <div class="list">
                <h2>ForEnterorises</h2>
                <p>myapp for work</p>
                <p>Next-Gen Business Solutions</p>
                <p>One App for All Your Needs</p>
                <p>Business Done Smarter</p>
                <p>Revolutionize Your Workplace</p>
          </div>
                                   
           <div class="list">
                    <h2>LearnMore</h2>
                    <p>Privacy</p>
                    <p>Security</p>
                    <p>Terms</p>
                    <p>Sitemap</p>
                    <p>Legal Information</p>
           </div>
</div>

</body>
</html>