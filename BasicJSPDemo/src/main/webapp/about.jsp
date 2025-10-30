<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>About Page</title>
</head>
<body>
    <h2>Hello JSP User!</h2>
    <%
        String user = request.getParameter("username");
        if (user != null && !user.isEmpty()) {
    %>
        <p>Welcome, <strong><%= user %></strong>!</p>
    <%
        } else {
    %>
        <p>You didn’t enter your name. Go back and try again.</p>
    <%
        }
    %>
    <a href="index.jsp">← Back to Home</a>
</body>
</html>
