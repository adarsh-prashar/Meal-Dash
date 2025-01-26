# MealDash 🍔🍲🍜
MealDash is a full-stack web application designed to streamline the food delivery process. The platform offers a seamless experience for customers to browse menus, place orders, and manage their food delivery preferences effortlessly.

## Features 🚀
- **User Authentication**: Secure login and registration system for customers.
- **Browse Menu**: Dynamic menu display with detailed food descriptions, images, and pricing.
- **Order Management**: Add items to the cart, customize orders, and track order status.
- **Admin Dashboard**: Manage menu items, view orders, and track delivery status.
- **Responsive Design**: Optimized for both desktop and mobile devices.
- **Real-time Updates**: Order tracking with status notifications.

## Technologies Used 💻
### Frontend:
- **HTML5**: Structure and layout.
- **CSS3**: Styling and responsive design.
- **JavaScript (ES6+)**: Dynamic UI interactions.

### Backend:
- **Java (JSE, JEE)**: Backend logic and server-side scripting.
- **JavaMail API**: For sending order confirmations and notifications.

### Database:
- **MySQL**: Storing user, order, and menu data.

## Installation and Setup ⚙️
### Prerequisites:
- **Java Development Kit (JDK)** (Version 11+)
- **Apache Tomcat** (Version 9+)
- **MySQL Server**
- **Maven** (For dependency management)

### Steps:
1. **Clone the Repository:**
   ```bash
   git clone https://github.com/adarsh-prashar/mealdash.git
   cd mealdash
   ```

2. **Setup MySQL Database:**
   - Create a new database named `meal_dash`.
   - Run the SQL script provided in the `db` folder to set up the tables.

3. **Configure Application:**
   - Update the `application.properties` file in the `src/main/resources` folder with your database credentials:
     ```properties

4. **Build and Run the Application:**
   ```bash
   mvn clean install
   mvn spring-boot:run
   ```

5. **Access the Application:**
   - Open your browser and go to [http://localhost:8080](http://localhost:8080).

## Project Structure 🗂️
```
mealdash/
|
├── src/
│   ├── main/
│   │   ├── java/com/mealdash/
│   │   │   ├── controller/
│   │   │   ├── model/
│   │   │   ├── repository/
│   │   │   ├── service/
│   │   │   └── MealDashApplication.java
│   │   ├── resources/
│   │   │   ├── static/ (CSS, JS, images)
│   │   │   ├── templates/ (HTML views)
│   │   │   └── application.properties
│   │   └── webapp/ (Web assets)
│   └── test/ (Test cases)
│
├── db/ (Database scripts)
│
├── README.md
├── pom.xml (Maven dependencies)
└── .gitignore
```

## Future Improvements 🌟
- **Automation**: Schedule daily offers and special discounts.
- **AI Integration**: Suggest popular dishes based on user preferences.
- **Payment Gateway**: Integration with secure payment systems.
- **Push Notifications**: Real-time updates for order status.

---
MealDash is designed to deliver an exceptional user experience, ensuring both convenience and reliability for customers and administrators alike!

