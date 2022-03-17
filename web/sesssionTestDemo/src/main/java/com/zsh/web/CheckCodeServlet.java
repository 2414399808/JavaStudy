package com.zsh.web;

import com.zsh.util.CheckCodeUtil;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;

@WebServlet("/CheckCodeServlet")
public class CheckCodeServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletOutputStream os = response.getOutputStream();
        OutputStream bos=new BufferedOutputStream(os);
        String s = CheckCodeUtil.outputVerifyImage(100, 50, bos, 4);
        HttpSession session = request.getSession();
        session.setAttribute("checkcode",s);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
