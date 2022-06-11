
package com.user;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Register2 extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("enter in the way");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String name=request.getParameter("user_name");
		String password=request.getParameter("user_password");
		String email=request.getParameter("user_email");
		out.println(name);
		out.println(password);
		out.println(email);
		
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/youtube";
		String user="root";
		String password1="root";
		Connection con = DriverManager.getConnection(url,user,password1);
		
		String q="insert into user(name,password,email) values(?,?,?)";
		PreparedStatement pstm = con.prepareStatement(q);
		pstm.setString(1, name);
		pstm.setString(2, password1);
		pstm.setString(3, email);
		pstm.executeUpdate();
		out.println("<h1>done.......</h1>");
		}
		catch (Exception e) {
		e.printStackTrace();	
		out.println("<h1>error........</h1>");
		}
	}

}
