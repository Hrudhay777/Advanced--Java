package com.servletdemo;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Set response content type
        response.setContentType("text/html");

        // Get writer to send output to browser
        PrintWriter out = response.getWriter();

        // Output HTML
        out.println("<html><body>");
        out.println("<h2>Hello from Servlet!</h2>");
        out.println("<p>This is a simple servlet example running on Tomcat 10.1</p>");
        out.println("</body></html>");
    }
}
