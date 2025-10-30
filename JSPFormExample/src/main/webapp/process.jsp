<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.example.User" %>
<jsp:useBean id="user" class="com.example.User" scope="request" />
<jsp:setProperty name="user" property="*" />

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Form Result</title>
</head>
<body>
    <h2>Form Submitted Successfully!</h2>
    <p>Name: <b><jsp:getProperty name="user" property="name" /></b></p>
    <p>Email: <b><jsp:getProperty name="user" property="email" /></b></p>
    <a href="index.jsp">Go Back</a>
</body>
</html>
