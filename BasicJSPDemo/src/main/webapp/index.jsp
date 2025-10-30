<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Basic JSP Demo</title>
</head>
<body>
    <h2>Welcome to My First JSP Page!</h2>
    <p>Current Date and Time: <%= new java.util.Date() %></p>

    <hr>
    <form action="about.jsp" method="get">
        <label for="name">Enter your name:</label>
        <input type="text" id="name" name="username">
        <input type="submit" value="Go to About Page">
    </form>
</body>
</html>
