package com.user;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Registers
 */
public class Registers extends HttpServlet {
	
	
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException{
    	response.setContentType("text/html);charset=UTF-8");
    	try (PrintWriter out =response.getWriter()){
    		
    		out.println("<!DOCTYPE html>");
    		out.println("<html>");
    		out.println("<head>");
    		out.println("<title>Servlet Register</title>");
    		out.println("<body>");
    		
    		String name =request.getParameter("user_name");
    		String email =request.getParameter("user_email");
    		String password =request.getParameter("user_password");
    		
    		out.println(name);
    		out.println(password);
    		out.println(email);
    		
    		out.println("</body>");
    		out.println("<html>");
    		
    		// connection
    		try {
    			Class.forName("com.mysql.jdbc.Driver");
    			Connection con=DriverManager.getConnection(arg0)
    		}
    	}
    }
    
    
    

}
