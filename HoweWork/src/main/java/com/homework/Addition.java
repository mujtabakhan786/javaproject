package com.homework;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Addition extends HttpServlet{
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	resp.setContentType("text/html");
	PrintWriter out = resp.getWriter();
	String n1=req.getParameter("n1");
	String n2=req.getParameter("n2");
	int a = Integer.parseInt(n1);
	int b = Integer.parseInt(n2);
	int c=a+b;
	out.println("<h1> Result : " + c + "</h1>");
}
}
