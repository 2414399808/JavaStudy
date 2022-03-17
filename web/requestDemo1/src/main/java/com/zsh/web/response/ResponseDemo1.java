package com.zsh.web.response;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/ResponseDemo1")
public class ResponseDemo1 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("resp1...");
        //重定向
        //1设置响应状态吗302
//        response.setStatus(302);
//        response.setHeader("Location","/requestDemo1/ResponseDemo2");
        response.sendRedirect(request.getContextPath()+"/ResponseDemo2");
//        response.sendRedirect("http://www.baidu.com");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
