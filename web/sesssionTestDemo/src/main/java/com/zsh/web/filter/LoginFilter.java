package com.zsh.web.filter;

import com.zsh.pojo.User;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebFilter("/*")
public class LoginFilter implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
        //判断访问的资源路径是否登录注册相关
        String[] urls={"/login.jsp","/imgs/","/css/","/LoginServlet","/register.jsp","/RegisterServlet","/CheckCodeServlet"};

        HttpServletRequest req=(HttpServletRequest) request;
        HttpSession session = req.getSession();
        String requestURL = req.getRequestURL().toString();
        for (String url : urls) {
            if(requestURL.contains(url))
            {
                chain.doFilter(request, response);
                return;
            }
        }
        User loginuser = (User)session.getAttribute("loginuser");
        if(loginuser==null) {
            req.setAttribute("msg_error","您还没有登录，请登录");
            req.getRequestDispatcher("/login.jsp").forward(req,response);
        }
            chain.doFilter(request, response);
    }

    public void init(FilterConfig config) throws ServletException {
    }

    public void destroy() {
    }

}
