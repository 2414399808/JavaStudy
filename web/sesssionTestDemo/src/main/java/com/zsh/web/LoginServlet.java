package com.zsh.web;

import com.zsh.pojo.User;
import com.zsh.service.UserService;
import com.zsh.service.UserServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String remember = request.getParameter("remember");
        UserServiceImpl userService=new UserService();
        User user = userService.selectByUsernameAndPassword(username, password);
        if(user!=null){
            System.out.println("登录成功");
            HttpSession session = request.getSession();
            User user1 = new User(username, password);
            session.setAttribute("loginuser",user1);
            if(remember!=null){
                Cookie loginUsername = new Cookie("username", username);
                Cookie loginPassword = new Cookie("password", password);
                loginUsername.setMaxAge(60*60*24*7);
                loginPassword.setMaxAge(60*60*24*7);
                response.addCookie(loginPassword);
                response.addCookie(loginUsername);

            }
            response.sendRedirect("/sesssionTestDemo/selectAllServlet");
        }else{
            System.out.println("登录失败");
            request.setAttribute("msg_error","用户名或密码错误");
            request.getRequestDispatcher("/login.jsp").forward(request,response);
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
