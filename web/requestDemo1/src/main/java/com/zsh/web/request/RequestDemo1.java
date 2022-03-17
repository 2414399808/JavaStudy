package com.zsh.web.request;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.Arrays;

@WebServlet("/RequestDemo1")
public class RequestDemo1 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println(request.getMethod());//获取请求方法 GET POST
        System.out.println(request.getRequestURL());//获取URL（统一资源定位符）
        System.out.println(request.getRequestURI());//获取URI（统一资源标识符）
        System.out.println(request.getContextPath());//获取虚拟路径（项目访问路径）
        System.out.println(request.getQueryString());//请求参数
        String queryString = request.getQueryString();
        String[] split = queryString.split("&");
        System.out.println(Arrays.toString(split));
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
