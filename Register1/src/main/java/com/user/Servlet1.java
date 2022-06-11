package com.user;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		String name=req.getParameter("user_name");
		out.println(name);
		//out.println("<h1><a href='aa?user="+name+"'>Go to second Servlet2</a></h1>");
		//hidden form
		out.println(""
				+"<form action='aa'>"
				+"<input type='hidden' name='user_name' value='"+name+"'/>"
				+"<button type='submit' style='color:blue;'>Go to second servlet</button>"
				+""
				+""
				+""
				+""
				+"</form>"
				);
	}

}
