package com.aman.user.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CreateUserServlet
 */
@WebServlet(urlPatterns = "/addServlet",initParams = {
		@WebInitParam(name = "dbUrl",value ="jdbc:mysql://localhost:3306/mydb" ),
		@WebInitParam(name = "dbUser",value = "root"),@WebInitParam(name = "dbPassword",value = "root")
})
public class CreateUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Connection con;
public void init(ServletConfig config) {
	try {
		System.out.println("init");
		Class.forName("com.mysql.cj.jdbc.Driver");
		//con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root");
		con=DriverManager.getConnection(config.getInitParameter("dbUrl"),config.getInitParameter("dbUser"),
				config.getInitParameter("dbPassword")	);
		
	} catch (SQLException e) {
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		try {
			Statement statement = con.createStatement();
			int result = statement.executeUpdate("insert into user values ('"+firstName+"','"+lastName+"','"+email+"','"+password+"')");
		PrintWriter out = response.getWriter();
		if(result>0) {
			out.print("<h1>User Created</h1>");
		}
		else {
			out.print("<h1>error creating user </h1>");
		}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
public void destroy() {
	try {
		con.close();
		
	} catch (SQLException e) {
		e.printStackTrace();
	}
}
}
