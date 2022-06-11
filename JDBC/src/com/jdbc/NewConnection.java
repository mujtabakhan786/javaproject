package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class NewConnection {

	public static void main(String[] args) {
		
		try {
			//load the driver
			Class.forName("com.mysql.jdbc.Driver");
			
			String url="jdbc:mysql://localhost:3306/learn";
			String username="root";
			String password="root";
			
			Connection con = DriverManager.getConnection(url, username, password);
			
			if(con.isClosed())
			{
				System.out.println("connection is closed");
			}
			else
			{
				System.out.println("connection is created");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	
		
	
	}
	
}
