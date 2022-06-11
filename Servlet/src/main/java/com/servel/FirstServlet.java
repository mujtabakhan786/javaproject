package com.servel;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FirstServlet implements Servlet{
	ServletConfig conf;
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("going to destroy");
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return this.conf;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return "this servlet is created by Mujtaba";
	}

	@Override
	public void init(ServletConfig conf) throws ServletException {
		// TODO Auto-generated method stub
		this.conf=conf;
		System.out.println("Creating an Object");
	}

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("servicing......");
		
		
		
	arg1.setContentType("text/html");	
	PrintWriter	out=arg1.getWriter();
	out.println("<h1>this is my first project</h1>");
	out.println("<h1>Todays date and time is "+new Date().toString()+"</h1>");
	}
	             
	
	
}




