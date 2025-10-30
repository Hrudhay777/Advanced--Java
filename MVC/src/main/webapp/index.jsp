<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Simple MVC Example</title>
</head>
<body>
    <h2>Simple MVC Example</h2>
    <form action="HelloController" method="post">
        Enter your name: <input type="text" name="username" />
        <input type="submit" value="Submit" />
    </form>

    <h3>
        <% String msg = (String) request.getAttribute("message");
           if (msg != null) out.print(msg);
        %>
    </h3>
</body>
</html>
