package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class FirstJdbc {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/jdbc";
			String user="root";
			String password="root";
			Connection con = DriverManager.getConnection(url, user, password);
			if(con.isClosed())
			{
				System.out.println("connection is closed");
			}
			else
			{
				System.out.println("connection is create");
			}
			
		}
			
		 
	catch (Exception e) {
			e.printStackTrace();
		}
	}
}	

