package com.zsh.web.response;



import org.apache.commons.io.IOUtils;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

@WebServlet("/ResponseDemo4")
public class ResponseDemo4 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        InputStream bis = new BufferedInputStream(new FileInputStream("E:\\movie/goutou.jpg"));


        ServletOutputStream os = response.getOutputStream();
        BufferedOutputStream bos = new BufferedOutputStream(os);
//        byte[] buffer=new byte[1024];
//        int len;
//        while((len=bis.read(buffer))!=-1){
//            bos.write(buffer,0,len);
//        }
        IOUtils.copy(bis,bos);
        bis.close();
        bos.close();
        os.close();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
