package com.aman.user.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
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
@WebServlet("/updateServlet")
public class UpdateUserServlet extends HttpServlet {
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
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		try {
			Statement statement = con.createStatement();
			int result = statement.executeUpdate("update user set password='"+password+"' where email='"+email+"'");
		PrintWriter out = response.getWriter();
		if(result>0) {
			out.print("<h1>Password Updated</h1>");
		}
		else {
			out.print("<h1>error updating password</h1>");
		}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
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
