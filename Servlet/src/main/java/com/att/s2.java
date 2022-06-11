package com.att;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class s2 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		int nn1=Integer.parseInt(request.getParameter("n1"));
		int nn2=Integer.parseInt(request.getParameter("n2"));
		int p=nn1*nn2;
		int sum=(int)request.getAttribute("sum");
		out.println("<h1>");
		out.println("sum is ="+sum);
		out.println("Product is ="+p);
		out.println("</h1>");
	}


}
