package com.example.tomcatdemo1;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
@WebServlet("/test")
public class test implements Servlet {
    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("初始化成功");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("处理器处理中");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {
        System.out.println("终结");
    }
}
