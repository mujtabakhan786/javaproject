package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class deleteQuery {
public static void main(String[] args) {
	
	try {
Class.forName("com.mysql.jdbc.Driver");
		
		String url="jdbc:mysql://localhost:3306/learn";
		String username="root";
		String password="root";
		
		Connection con = DriverManager.getConnection(url, username, password);
		String q4="delete from test1 where id=20";
		
		Statement statement = con.createStatement();
		statement.executeUpdate(q4);
		System.out.println("deleted successfully");
		
	} catch (Exception e) {
		
	}
}
}
