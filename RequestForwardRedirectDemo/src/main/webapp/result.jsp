<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Result Page</title>
</head>
<body>
    <h2>Response Result:</h2>
    <%
        String msg = (String) request.getAttribute("message");
        if (msg == null) {
            msg = request.getParameter("msg");
        }
    %>
    <p><strong><%= msg %></strong></p>

    <a href="index.html">← Back</a>
</body>
</html>
