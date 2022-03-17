package com.zsh.web;

import com.zsh.pojo.User;
import com.zsh.service.UserService;
import com.zsh.service.UserServiceImpl;
import com.zsh.util.CheckCodeUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        UserServiceImpl userService=new UserService();
        String checkCode = request.getParameter("checkCode");
        HttpSession session = request.getSession();
        String modelcheckcode = (String)session.getAttribute("checkcode");

        if(modelcheckcode.equalsIgnoreCase(checkCode)){
            boolean add = userService.add(new User(username, password));
            if(add){
                request.setAttribute("register_msg","注册成功，请登录");
                request.getRequestDispatcher("/login.jsp").forward(request,response);
            }else{
                request.setAttribute("register_msg","用户名已存在");
                request.getRequestDispatcher("/register.jsp").forward(request,response);
            }
        }else{
            request.setAttribute("register_msg","验证码输入错误");
            request.getRequestDispatcher("/register.jsp").forward(request,response);
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
