package com.aman.user.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CreateUserServlet
 */
@WebServlet("/fetch")
public class ReadUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Connection con;
public void init() {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root");
		
	} catch (SQLException e) {
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet");
		
			try {
				Statement statement = con.createStatement();
				ResultSet resultSet = statement.executeQuery("select * from user");
				PrintWriter out = response.getWriter();
				/*
				 * while(resultSet.next()) { out.println(resultSet.getString(1));
				 * out.println(resultSet.getString(2)); out.println(resultSet.getString(3)); }
				 */
				out.print("<table>");
				out.print("<tr>");
				out.print("<th>");
				out.print("First Name");
				out.print("</th>");
				out.print("<th>");
				out.print("Last Name");
				out.print("</th>");
				out.print("<th>");
				out.print("email");
				out.print("</th>");
				out.print("</tr>");
				
				 while(resultSet.next()) {
					 out.print("<tr>"); 
					 out.print("<td>"); 
					 out.print(resultSet.getString(1)); 
					 out.print("</td>"); 
					 out.print("<td>"); 
					 out.print(resultSet.getString(2)); 
					 out.print("</td>"); 
					 out.print("<td>");
					 out.print(resultSet.getString(3)); 
					 out.print("</td>"); 
					 out.print("</tr>"); 
				 }
				 out.print("</table>");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		
	}
public void destroy() {
	try {
		System.out.println("destroy");
		con.close();
		System.out.println("closed");
	} catch (SQLException e) {
		e.printStackTrace();
	}
}
}
