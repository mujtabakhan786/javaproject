package com.att;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DemoServlet1 extends HttpServlet {
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	resp.setContentType("text/html");
	PrintWriter out = resp.getWriter();
	ServletContext sc = getServletContext();
	sc.setAttribute("company","IBM");
	out.println("Welcome to first servlet");
	out.println("<a href='khan'>visit</a>");
	//RequestDispatcher rd = req.getRequestDispatcher("khan");
	//rd.forward(req, resp);
}
} 