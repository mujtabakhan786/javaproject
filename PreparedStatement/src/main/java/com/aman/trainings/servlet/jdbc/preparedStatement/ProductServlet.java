package com.aman.trainings.servlet.jdbc.preparedStatement;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ProductServlet
 */
@WebServlet("/ProductServlet")
public class ProductServlet extends HttpServlet {
	Connection con;
	PreparedStatement ps;
	private static final long serialVersionUID = 1L;
       public void init() {
    	  try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root");
			ps=con.prepareStatement("insert into product values(?,?,?,?)");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       }
   
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		String desc = request.getParameter("description");
		int price = Integer.parseInt(request.getParameter("price"));
		
		try {
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setString(3, desc);
			ps.setInt(4, price);
			int result = ps.executeUpdate();
			System.out.println(result);
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.print("<br>"+result+"products created");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
public void destroy() {
	try {
		ps.close();
		con.close();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
