package com.cruddelet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class CrudDelect {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/learn?" + "autoReconnect=true&useSSL=false";
			String username = "root";
			String password = "root";
			Connection con = DriverManager.getConnection(url, username, password);
//			String q = "delete from student where city='Mumbai'";
//			Statement createStatement = con.createStatement();
//			createStatement.executeUpdate(q);
			String q1="select * from student";
			Statement statement = con.createStatement();
			ResultSet set = statement.executeQuery(q1);
			while(set.next())
			{
				int id = set.getInt("id");
				String name = set.getString("name");
				String city = set.getString("city");
				System.out.println(id + " " + name + " " + city  );
			}
			
			System.out.println("delect successfully");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
