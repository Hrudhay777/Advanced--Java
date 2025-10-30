package com.mvc.controller;

import java.io.IOException;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import com.mvc.model.HelloModel;

public class HelloController extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("username");

        // Call the Model
        HelloModel model = new HelloModel();
        String message = model.getMessage(name);

        // Set data to request scope
        request.setAttribute("message", message);

        // Forward to the View (JSP)
        RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
        rd.forward(request, response);
    }
}
