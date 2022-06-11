package com.deletecrud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeleteCrud {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/learn";
			String username="root";
			String password="root";
			Connection con = DriverManager.getConnection(url, username, password);
			String q="delete from student where city=Mum";
			Statement statement = con.createStatement();
			statement.executeUpdate(q);
			System.out.println("delect successfully");
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}

}
