/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet.spring.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 90462
 */
public class LoginService extends HttpServlet {
    @Override //method post
    public void doPost(
            HttpServletRequest request, 
            HttpServletResponse response
    )
    throws IOException, ServletException
    {
        String userid = request.getParameter("userid");
        String psw = request.getParameter("psw");
        /* Connect Mysql from jdbc*/
        boolean hasUser = false;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://203.151.27.179:3306/train_db", 
                "train", 
                "train"
            );
            Statement stmt = con.createStatement();
            ResultSet res = stmt.executeQuery(
                    "select user_code, user_first_name, user_last_name, user_age, user_dob " +
                    "  from sc_user " +
                    " where user_code = '"+userid+"'"+
                    "   and user_pwd = '"+psw+"'"
            );
            while(res.next()){
                System.out.println(res.getString("user_code"));
                hasUser = true;
            }
            
            res.close();
            stmt.close();
            con.close();  
        }catch(Exception e){
            e.printStackTrace();
        }
        if(hasUser){
            /**
             *  select user_code
                    , user_age
                        , user_last_name
                        , user_first_name
                        , user_dob
                 from sc_user
                where user_code = ''
             */
            Map<String, String> user = new HashMap();
            /*Start your logic*/
            user.put("name", "Johny");
            user.put("surname", "Woo");
            user.put("age", "78");
            user.put("dob", "01 Jan 2001");
            /*End your logic*/
            request.setAttribute("user", user);
            request.getRequestDispatcher("/userservice").forward(request, response);
        }else{
            request.setAttribute("error", "User or password not found");
            request.getRequestDispatcher("/jsp/index.jsp").forward(request, response);
        }
        
    }
}
