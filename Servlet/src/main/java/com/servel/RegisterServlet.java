package com.servel;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType(("text/html"));
		PrintWriter out = resp.getWriter();
		out.println("<h1>welcome to Register Servlet</h1>");
		out.println("<h1><a href='index1.html'>Add More</a></h1>");
		String name = req.getParameter("user_name");
		String password = req.getParameter("user_password");
		String mailid = req.getParameter("user_mailid");
		String gender = req.getParameter("user_gender");
		String course = req.getParameter("user_course");
		String cond = req.getParameter("condition");
		if(cond!=null) {
			if(cond.equals("checked"))
			{
			
				out.println("<h2> Name : " + name + "</h2>");
				out.println("<h2> Password : " + password + "</h2>");
				out.println("<h2> Mailid : " + mailid + "</h2>");
				out.println("<h2> Gender : " + gender + "</h2>");
				out.println("<h2> Course : " + course  + "</h2>");
			}
		}
		else {
			out.println("<h2>You have not accepted the terms and condition</h2>");
		}
		
	}

}
