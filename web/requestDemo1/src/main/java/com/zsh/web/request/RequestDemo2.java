package com.zsh.web.request;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.function.BiConsumer;

@WebServlet("/RequestDemo2")
public class RequestDemo2 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Map<String, String[]> parameterMap = request.getParameterMap();
        long l1 = System.currentTimeMillis();
        parameterMap.forEach(new BiConsumer<String, String[]>() {
            @Override
            public void accept(String s, String[] strings) {
                System.out.println(s+"="+Arrays.toString(strings));
            }
        });
        long l2 = System.currentTimeMillis();
        System.out.println((l2-l1));
        long l3 = System.currentTimeMillis();
        for(Map.Entry<String,String[]> entry :parameterMap.entrySet()){
            System.out.println(entry.getKey()+"="+Arrays.toString(entry.getValue()));
        }
        long l4 = System.currentTimeMillis();
        System.out.println(l4-l3);
        long l5 = System.currentTimeMillis();
       for(String key: parameterMap.keySet()){
           System.out.println(key+"="+Arrays.toString(parameterMap.get(key)));
       }
        long l6 = System.currentTimeMillis();
        System.out.println(l6-l5);
        String username = request.getParameter("username");
        System.out.println(username);
        String password = request.getParameter("password");
        System.out.println(password);
        String[] hobbies = request.getParameterValues("hobby");
        System.out.println(Arrays.toString(hobbies));

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
