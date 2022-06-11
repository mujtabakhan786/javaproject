package com.att;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class s1 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		String n1 = request.getParameter("n1");
		String n2 = request.getParameter("n2");

		int nn1 = Integer.parseInt(n1);
		int nn2 = Integer.parseInt(n2);
		int s = nn1 + nn2;

		request.setAttribute("sum", s);

		RequestDispatcher rd = request.getRequestDispatcher("s2");
		rd.forward(request, response);
	}

}
