package com.servel;

import java.io.IOException;
import java.io.PrintWriter;
import java.rmi.server.ServerCloneException;
import java.util.Date;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HttpServletExample extends HttpServlet
{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException,IOException
	{
		res.setContentType("text/html");
		 PrintWriter out = res.getWriter();
		 out.println("<h1> this is my httpservlet</h1>");
		 out.println(new Date().toString());
	}
	
	
}

 
