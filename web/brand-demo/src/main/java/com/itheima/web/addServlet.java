package com.itheima.web;

import com.alibaba.fastjson.JSON;
import com.itheima.pojo.Brand;
import com.itheima.service.BrandService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.BufferedReader;
import java.io.IOException;

@WebServlet("/addServlet")
public class addServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取请求体
//        BufferedReader br = request.getReader();
//        String s = br.readLine();
//        Brand brand = JSON.parseObject(s, Brand.class);
//        BrandService brandService=new BrandService();
//        brandService.add(brand);
        BufferedReader br = request.getReader();
        String s = br.readLine();
        Brand brand = JSON.parseObject(s, Brand.class);
        BrandService brandService=new BrandService();
        brandService.add(brand);

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
