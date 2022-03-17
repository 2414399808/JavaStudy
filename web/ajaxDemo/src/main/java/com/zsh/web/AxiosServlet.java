package com.zsh.web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/AxiosServlet")
public class AxiosServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("POST");
        String username = request.getParameter("username");
        response.getWriter().write("hello axios"+username);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("GET");
        String username = request.getParameter("username");
        response.getWriter().write("hello axios"+username);
    }
}
