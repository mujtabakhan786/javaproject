package com.servel;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterServlet1 extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("<h1>Welcome to Register Servlet</h1>");
		String name = req.getParameter("user_name");
		String password = req.getParameter("user_password");
		String email = req.getParameter("user_email");
		String gender = req.getParameter("user_gender");
		String course = req.getParameter("user_course");
		String cond = req.getParameter("condition");
		if(cond!=null) {
		if(cond.equals("checked"))
		{
			out.println("<h2> Name : " + name + "</h2>");
			out.println("<h2> Password : " + password + "</h2>");
			out.println("<h2> Email : " + email + "</h2>");
			out.println("<h2> Gender : " + gender + "</h2>");
			out.println("<h2> Course : " + course  + "</h2>");
			
			RequestDispatcher rd = req.getRequestDispatcher("success");
			rd.forward(req, resp);
		}}
		else {
			out.println("<h2>You have not accepted the terms and condition</h2>");
		}
		RequestDispatcher rd = req.getRequestDispatcher("index1.html");
		rd.include(req, resp);
		
	}
	
	
	

}
