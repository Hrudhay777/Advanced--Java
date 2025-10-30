<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ page import="jakarta.servlet.http.HttpSession" %>
<!DOCTYPE html>
<html>
<head>
    <title>Welcome Page</title>
</head>
<body>
<%
    HttpSession session = request.getSession(false);
    String user = null;

    if (session != null) {
        user = (String) session.getAttribute("username");
    }

    if (user == null) {
%>
        <h3 style="color:red;">You are not logged in!</h3>
        <a href="login.html">Go to Login Page</a>
<%
    } else {
%>
        <h2>Welcome, <%= user %>!</h2>
        <p>You have successfully logged in using Servlets and Session.</p>
        <a href="LogoutServlet">Logout</a>
<%
    }
%>
</body>
</html>
