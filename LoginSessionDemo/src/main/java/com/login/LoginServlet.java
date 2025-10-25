package com.login;

import java.io.IOException;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Simple check (you can connect DB later)
        if ("admin".equals(username) && "1234".equals(password)) {
            // Create session
            HttpSession session = request.getSession();
            session.setAttribute("username", username);

            // Redirect to welcome page
            response.sendRedirect("WelcomeServlet");
        } else {
            response.setContentType("text/html");
            response.getWriter().println("<h3 style='color:red;'>Invalid credentials!</h3>");
            RequestDispatcher rd = request.getRequestDispatcher("login.html");
            rd.include(request, response);
        }
    }
}
