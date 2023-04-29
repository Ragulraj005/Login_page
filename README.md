# Login_page

[Login-page.docx](https://github.com/Ragulraj005/Login_page/files/11359797/Login-page.docx)
Login Page

project-documentation
 
Login-page     
________________________________________
📝 Table of Contents
•	📔About
•	System Requirements and Software used.
•	Module of the Project
•	Libraries used.
•	Built Using
•	Acknowledgments
 About
This is a login page using microservices and MySQL. The servlet receives a username and password input from an HTML form, validates the input, and checks it against a MySQL database to authenticate the user.
The servlet uses JDBC to create a database connection and execute SQL queries on the database. It also uses the HttpSession object to maintain user session data, specifically storing the user's name after successful authentication.
The servlet is implemented as a microservice, which is a small, independently deployable component of a larger software system that performs a specific function. The use of a microservice architecture allows for modular and scalable development, as well as better fault tolerance and easier deployment.
Overall, the servlet provides a secure and user-friendly login experience for a web application that is integrated with a MySQL database and implemented as a microservice.

System Requirements and Software Used:
A modern computer with a dual-core processor, 4 GB of RAM, and 500 GB of hard disk space should be sufficient for most small to medium-sized organizations.
Eclipse is a popular open-source integrated development environment (IDE) primarily used for Java development, but it also supports other programming languages such as C++, Python, and Ruby. It was originally developed by IBM in 2001 but has since been maintained by the Eclipse Foundation.
Eclipse provides a robust set of tools and features for software development, including code editing, debugging, testing, and deployment. It also has a large plugin ecosystem that allows developers to extend the functionality of Eclipse by adding additional tools and features.
SQLyog is a graphical user interface (GUI) tool for managing MySQL databases. It allows users to create, edit, and execute SQL queries, manage database objects such as tables, views, and stored procedures, and perform other database administration tasks. SQLyog is available in both free and commercial versions, and supports Windows operating systems.









Module of the Project:

 
a)Sign-in Page
It is simple web application that implements a login form using JSP and servlets. The user enters their username and password, and if the credentials are correct, they are redirected to the home page. Otherwise, the user is redirected back to the login page with an error message.
The HTML code contains the layout of the login form, along with the necessary CSS and JavaScript files. The JavaScript code includes a function called checkStatus(), which checks for any error messages sent from the server and displays them using the SweetAlert library.
The Java code contains a servlet called Login, which handles the user authentication process. The servlet first checks whether the user has entered a valid username and password. If not, it sets an error message and forwards the request back to the login page. Otherwise, it checks the user's credentials against the database using a PreparedStatement object. If the user's credentials are correct, the servlet creates a session and sets a session attribute with the user's username. The servlet then redirects the user to the home page. If the user's credentials are incorrect, the servlet sets an error message and forwards the request back to the login page.


This is a simple implementation of a login form using JSP and servlets. However, there are several areas for improvement. For example, the password is stored in plain text in the database, which is a security risk. Also, the code does not handle session timeouts or invalid session IDs, which can lead to security vulnerabilities. Additionally, the code does not use a framework or library to handle the user authentication process, which can make the code more difficult to maintain and update. Finally, the code does not provide any feedback to the user when the login process is successful, which can lead to confusion and frustration.

 
b)create account

This application uses JSP, Servlets, and MySQL database to achieve the functionality.
The front-end of the application is built using HTML and CSS, and the UI is designed to capture user details such as name, email, password, and mobile number. On submitting the registration form, the form is processed by the back-end of the application.
 
The Back-end is built using Java Servlets that handle HTTP requests from the front-end. The Servlets receive user data from the form, validate the data, and store the data in the MySQL database using JDBC. The servlet class name is registrationServlet, and it implements the doPost method, which receives the HTTP POST requests from the registration form.
If there are any invalid fields in the form, such as empty fields, incorrect password confirmation, or invalid mobile numbers, the servlet will redirect the user back to the registration page and display an error message.
If the form data is valid, the servlet will connect to the MySQL database, insert the user data into the users table and redirect the user back to the registration page to display a success message.
The application uses the java.sql package to connect to the MySQL database and the RequestDispatcher class to redirect the user to the registration page. The application also uses JSTL to retrieve the error/success message attributes from the request object and display them on the registration page.
Overall, this application is a simple example of how to create a web-based registration system using Java Servlets, JSP, and MySQL.
 

This is a Java Servlet class that handles user logout functionality in a web application. When a user logs out of the application, this servlet is responsible for terminating their session and redirecting them to the login page.
The class extends the HttpServlet class, which is a base class for all servlets. It overrides the doGet() method, which is invoked when the servlet receives an HTTP GET request from the client.
The first line of the doGet() method retrieves the current HttpSession object associated with the request. The HttpSession object represents a user's session on the server and contains user-specific data that persists across multiple requests.
The second line invalidates the user's session by removing all attributes associated with it. This effectively logs the user out of the application.
Finally, the response.sendRedirect() method is called to redirect the user to the login page. This method sends an HTTP redirect response to the client, which causes the client to navigate to the specified URL.
Overall, this servlet provides a simple and effective way to implement user logout functionality in a Java web application.

Libraries used:
1.	Google Fonts: A free and open-source font library with a wide variety of fonts available for use on the web. It provides a simple and easy-to-use API for integrating fonts into your web project. 
Link: https://fonts.google.com/
2.	Font Awesome: A popular icon font library that includes over 7,000 icons. It provides scalable vector icons that can be easily customized and styled using CSS.


 Built Using
•	HTML5 -HTML stands for Hyper Text Mark-up Language. It is used to design web pages using mark-up language. HTML is the combination of Hypertext and Mark-up language. Hypertext defines the link between the web pages. A markup language is used to define the text document within tag which defines the structure of web pages. HTML5 is the fifth and current version of HTML. It has improved the mark-up available for documents and has introduced application programming interfaces (API) and Document Object Model (DOM).
•	CSS -Cascading Style Sheets, fondly referred to as CSS, is a simply designed language intended to simplify the process of making web pages presentable. CSS allows you to apply styles to web pages. More importantly, CSS enables you to do this independent of the HTML that makes up each web page.
•	JavaScript - JavaScript is a lightweight, cross-platform and interpreted scripting language. It is well-known for the development of web pages, and many non-browser environments also use it. JavaScript can be used for Client-side developments as well as Server-side developments.
•	Java - Java is a high-level, object-oriented programming language designed to be portable and platform-independent. It was created by James Gosling at Sun Microsystems (which was later acquired by Oracle Corporation) in the mid-1990s. Java code is compiled into bytecode, which can be run on any machine with a Java Virtual Machine (JVM) installed.
•	Mysql - MySQL is a popular open-source relational database management system (RDBMS) that is widely used for developing web applications. It was created by Michael Widenius and David Axmark in 1995 and is now owned by Oracle Corporation.


•	Acknowledgments
FreeCodeCamp: FreeCodeCamp is an online learning platform that provides free coding challenges and projects to help you learn front-end development.
Skill-lync 




















