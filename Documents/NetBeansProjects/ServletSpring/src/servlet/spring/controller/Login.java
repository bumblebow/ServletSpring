/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet.spring.controller;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.*;
/**
 *
 * @author 90462
 */
public class Login extends HttpServlet{
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
        out.println("<form method='POST' action='loginservice'>");
        out.println("<input type='text' name='userid' />");
        out.println("<input type='password' name='psw' />");
        out.println("<input type='submit' name='sutmitbtn' value='Login' />");
        out.println("</form>");
        out.println("</body>");
        out.println("</html>");

    }
    
    @Override //method get
    public void doPost(HttpServletRequest request, HttpServletResponse response)
    throws IOException, ServletException {
        this.doGet(request, response);
    }
}
