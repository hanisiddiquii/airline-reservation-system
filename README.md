# Airline Reservation System

## Overview
The **Airline Reservation System** is a web-based application designed to manage flight reservations and related functionalities for airlines. This system allows users to search flights, book tickets, manage flight routes, and leave feedback. It also provides functionalities for airline staff to add, modify, and delete flights, routes, and airports.

This application is built using **Java**, **Spring Boot** for the backend, and **JSP** for the frontend. It supports both administrators and customers, offering role-based access for different users to interact with the system.

## Table of Contents
- [Features](#features)
- [Setup Instructions](#setup-instructions)
- [Technologies](#technologies)
- [Licenses](#licenses)

## Features
The Airline Reservation System offers the following key features:

1. **Flight Search**  
   Users can search for available flights by specifying departure and arrival cities, date, and number of passengers.

2. **Flight Booking**  
   Customers can book flights by selecting available flights from the search results and entering passenger details.

3. **View Booking Details**  
   Users can view the status and details of their booked flights, including flight information and passenger data.

4. **Feedback System**  
   Customers can provide feedback on their flight experience, which is stored and can be viewed by administrators.

5. **Airport Management**  
   Administrators can add, update, and delete airport information, including airport names, locations, and codes.

6. **Flight Management**  
   Administrators can add, modify, and remove flights, including details such as flight number, airline, and flight schedule.

7. **Route Management**  
   Users (primarily administrators) can add, modify, or remove routes, specifying the origin and destination airports.

8. **Ticket Cancellation**  
   Users can cancel their booked tickets and receive confirmation of cancellation.

9. **User Registration & Authentication**  
   New users can register, and existing users can log in to their accounts. Authentication is secure, and role-based access is implemented.

10. **Booking Confirmation**  
    Once a flight is booked, a confirmation page is shown with details of the booking and a ticket number.

11. **Admin Dashboard**  
    Administrators have access to a dashboard where they can view all bookings, manage flights, routes, and airport data.

## Technologies
- **Backend:** Java, Spring Boot
- **Frontend:** JSP, HTML, CSS, JavaScript
- **Database:** In-memory database (or you can configure any RDBMS such as MySQL)
- **Build Tool:** Maven
- **Authentication:** Spring Security

## Setup Instructions
To set up and run the Airline Reservation System locally, follow the steps below.

### Prerequisites:
- Java 11 or later
- Maven
- IDE like IntelliJ IDEA or Eclipse (optional)
- Access to the internet to download dependencies (via Maven)

### Step-by-Step Setup:

1. **Clone the repository:**
   Clone the project to your local machine using Git.

   ```bash
   git clone https://github.com/yourusername/airline-reservation-system.git
   cd airline-reservation-system

2. **Install dependencies:**
   Make sure you have Maven installed on your machine. You can install Maven by following this [video](https://www.youtube.com/watch?v=km3tLti4TCM).

   Run the following command to install the required dependencies:

    ```bash
    mvn install
    
3. **Configure Database (optional):** If you are using a database like MySQL, update the application.properties file located in src/main/resources with your database connection details.

   Example for MySQL:

    ```bash
    spring.datasource.url=jdbc:mysql://localhost:3306/airline_reservation
    spring.datasource.username=root
    spring.datasource.password=password
    
4. **Run the Application:** After dependencies are installed and configurations are set, run the application using Maven:
    ```bash
    mvn spring-boot:run
    
5. **Access the Application:** Once the application starts, open your browser and visit http://localhost:8081 to access the Airline Reservation System.

## Licenses
This project is licensed under the MIT License. Feel free to fork, modify, and distribute the project as per the license terms.
