/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet.spring.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.Map;
import javax.servlet.ServletException;


/**
 *
 * @author 90462
 */
public class HelloWorld extends HttpServlet{
    
    /**
     *
     * @param request
     * @param response
     */
    @Override //method get
    public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws IOException, ServletException {
        String q = request.getQueryString();
        System.out.println(q);
        
        String name = request.getParameter("name"); //ชื่อต้องตรงกับพารามิเตอร์ที่เรียกจาก url
        System.out.println(name);
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<body>");
        out.println("<head>");
        out.println("<title>Hello World!</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Hello World! "+name+"</h1>");
        out.println("</body>");
        out.println("</html>");

    }
    @Override //method post
    public void doPost(HttpServletRequest request, HttpServletResponse response)
    throws IOException, ServletException
    {
        Map<String, String> user = (Map)request.getAttribute("user");
        String name = user.get("name"); //ชื่อต้องตรงกับพารามิเตอร์ที่เรียกจาก url
        String surName = user.get("surname");
        String age = user.get("age");
        String dob = user.get("dob");
        System.out.println(name);
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        out.println("<html>");
        out.println("<body>");
        out.println("<head>");
        out.println("<title>Hello World!</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Name = "+name+"</h1>");
        out.println("<h1>Surname = "+surName+"</h1>");
        out.println("<h1>Age = "+age+"</h1>");
        out.println("<h1>DOB = "+dob+"</h1>");
        out.println("</body>");
        out.println("</html>");
    }
}
