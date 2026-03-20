package com.ecommerce.servlet;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;

import java.io.IOException;
import java.util.*;

@WebServlet("/cart")
public class CartServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession();
        List<String> cart = (List<String>) session.getAttribute("cart");

        if(cart == null){
            cart = new ArrayList<>();
        }

        String product = request.getParameter("product");

        if(product != null){
            cart.add(product);
        }

        session.setAttribute("cart", cart);

        request.setAttribute("cart", cart);
        request.getRequestDispatcher("cart.jsp").forward(request, response);
    }
}
