package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class GenServlet extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("this is servlet using generic servlet");
		resp.setContentType("text/html");
		PrintWriter out =resp.getWriter();
		out.println("<h1> this is mmy second servlet using generic servlet</h1>");
		
		
		
		
	}
	
	

}
