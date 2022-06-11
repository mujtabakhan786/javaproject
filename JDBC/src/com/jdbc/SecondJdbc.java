package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class SecondJdbc {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/jdbc";
			String user = "root";
			String password = "root";
			Connection con = DriverManager.getConnection(url, user, password);
			String q = "create table table2(id int(20) primary key auto_increment,name varchar(50),city varchar(50))";
			Statement stm = con.createStatement();
			stm.executeUpdate(q);
			System.out.println("table is created in database");
			con.close();
		}

		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
