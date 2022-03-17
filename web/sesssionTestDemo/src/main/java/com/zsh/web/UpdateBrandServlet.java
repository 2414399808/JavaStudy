package com.zsh.web;

import com.zsh.pojo.Brand;
import com.zsh.service.BrandService;
import com.zsh.service.BrandServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/UpdateBrandServlet")
public class UpdateBrandServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String id = request.getParameter("id");
        String brandName = request.getParameter("brandName");
        String companyName = request.getParameter("companyName");
        String ordered = request.getParameter("ordered");
        String description = request.getParameter("description");
        String status = request.getParameter("status");
        BrandServiceImpl brandService=new BrandService();
        brandService.updateBrand(new Brand(Integer.parseInt(id),brandName,companyName,Integer.parseInt(ordered),description,Integer.valueOf(status)));
        request.getRequestDispatcher("/selectAllServlet").forward(request,response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
