package com.example;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Uncomment below line to test 500 error
        // int x = 10 / 0;

        response.setContentType("text/html");
        response.getWriter().println("<h2>Welcome to the Hello Servlet!</h2>");
        response.getWriter().println("<p>Try accessing a wrong URL for 404 error.</p>");
        response.getWriter().println("<p>Or uncomment the divide-by-zero line for 500 error.</p>");
    }
}
