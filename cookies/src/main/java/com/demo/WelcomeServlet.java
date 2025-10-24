package com.demo;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.net.URLDecoder;

public class WelcomeServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        HttpSession session = request.getSession(false);
        String nameFromSession = null;

        if (session != null) {
            nameFromSession = (String) session.getAttribute("username");
        }

        String nameFromCookie = null;
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie c : cookies) {
                if (c.getName().equals("username")) ;
                nameFromCookie = URLDecoder.decode(c.getValue(), "UTF-8");
                }
            }
        }

        if (nameFromSession != null) {
            out.println("<h3>Welcome back (from session), " + nameFromSession + "!</h3>");
        } else if (nameFromCookie != null) {
            out.println("<h3>Welcome back (from cookie), " + nameFromCookie + "!</h3>");
        } else {
            out.println("<h3>No session or cookie found. Please <a href='index.html'>login again</a>.</h3>");
        }
    }
}
