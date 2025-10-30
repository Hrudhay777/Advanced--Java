package com.login;

import java.io.IOException;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class LogoutServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession(false);
        if (session != null) {
            session.invalidate(); // end session
        }

        response.setContentType("text/html");
        response.getWriter().println("<h3>You have been logged out successfully.</h3>");
        RequestDispatcher rd = request.getRequestDispatcher("login.html");
        rd.include(request, response);
    }
}
