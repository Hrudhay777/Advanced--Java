package com.demo;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String name = request.getParameter("username");

        // Create a new session
        HttpSession session = request.getSession();
        session.setAttribute("username", name);

        // Create a cookie and add it to the response
        Cookie userCookie = new Cookie("username", name);
        userCookie.setMaxAge(60 * 60); // 1 hour
        response.addCookie(userCookie);

        out.println("<h3>Welcome, " + name + "!</h3>");
        out.println("<a href='WelcomeServlet'>Go to Welcome Page</a>");
    }
}
