package com.servel;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		String name = req.getParameter("name");
		out.println("<h1> Hello " + name + "Welcome to my website ....</h1>");
		out.println("<h1><a href='servlet2'>Go to Servlet2</a></h1>");
		
		//create a cookie
		Cookie c=new Cookie("user_name", name);
		resp.addCookie(c);
	}
}
