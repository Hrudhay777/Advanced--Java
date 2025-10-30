package com.example;

import java.io.IOException;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;

@WebFilter("/*")  // This filter will apply to all requests
public class LoggingFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("LoggingFilter initialized.");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {

        System.out.println("Filter: Request received at " + new java.util.Date());

        // Continue with the next filter or servlet
        chain.doFilter(request, response);

        System.out.println("Filter: Response sent at " + new java.util.Date());
    }

    @Override
    public void destroy() {
        System.out.println("LoggingFilter destroyed.");
    }
}
