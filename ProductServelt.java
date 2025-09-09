package com.example.servlets;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ProductServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Sample product list
        String[] products = {"Laptop - 55000", "Mobile - 25000", "Headphones - 1500"};

        out.println("<html><body>");
        out.println("<h2>Product List</h2>");
        out.println("<ul>");
        for(String product : products) {
            out.println("<li>" + product + "</li>");
        }
        out.println("</ul>");
        out.println("<a href='index.jsp'>Back to Home</a>");
        out.println("</body></html>");
    }
}
