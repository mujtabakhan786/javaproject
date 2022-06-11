package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Table {
public static void main(String[] args) {
	
	try {
		
		Class.forName("com.mysql.jdbc.Driver");
		
		String url="jdbc:mysql://localhost:3306/learn";
		String username="root";
		String password="root";
		
		Connection con = DriverManager.getConnection(url, username, password);
		
		String q="create table test1(id int primary key ,name varchar(500),city varchar(500))";
		
		Statement st = con.createStatement();
		st.executeUpdate(q);
		System.out.println("table crated succsessfully");
		
	} catch (Exception e) {
		e.printStackTrace();
	}
}
}
