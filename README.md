﻿# :popcorn: :film_projector: CinemaHub :film_projector: :popcorn:

## Project description:
___

***Simple web-application that supports Authentication, registration and other CRUD methods. This application is designed to manage relations between cinema customers and cinema administration.
Cinema services company should be owners and server. And customers will be users, who will be need
to authorized. This application has some features, which is listed below.***
### Features:
- registration like a User;
- Authentication as a User;
- Authentication as a Admin;
- create of Movie and Cinema hall by Admin;
- create/update/remove of Movie Session by Admin;
- all authenticated profiles can get information Movies/Cinema Halls/Movie Sessions;
- Admin user can get information about registered customer by email;
- any registered and authenticated customer can get information about his Shopping cart and complete his order;
- any registered and authenticated customer can get information about his order history;
- any registered and authenticated customer can get information about available Movie Session by the date;
- logout;

### Project structure:
* main:
    * java.taxi:
        * config - contains application configuration files.
        * controllers - contains all controllers.
        * dao - dao layer of project. All sql query's is here.
        * dto:
          * request - contains required request DTO.
          * response - contains required response DTO. 
        * exception - custom exception for project.
        * lib - contains email validator.
        * model - models of CinemaHall, Movie, MovieSession, Order, Role, ShoppingCart, Ticket, User.
        * service - service layer of project. No sql query's. All business logic is here. Also contains all required mappers.
        * util - contains utility files. DataInitializer - injecting roles and admin on the start of application.
    * resources:
        * db.properties - contains properties for connection to DB;

### Technologies:
* JDK 11
* Maven
* MySQL
* Hibernate
* Spring(MVC, Security,)
* Tomcat
* REST
* Json
* Jackson 


### !!!!To Run Project!!!!
- configure ConnectionUtil from util directory to get connection to your DB.
- configure DataInitializer.
- use Tomcat 9.0.75 to run project.
