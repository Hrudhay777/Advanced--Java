package com.demo;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class HelloServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h2>Hello, welcome to my first web app on Tomcat 10.1!</h2>");
        out.println("<p>This page is served by a servlet.</p>");
        out.println("</body></html>");
    }
}
