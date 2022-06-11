package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ThirdJdbc {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/jdbc";
			String user = "root";
			String password = "root";
			Connection con = DriverManager.getConnection(url, user, password);
			String q = "insert into table2(Name,City) values(?,?)";
			PreparedStatement ptm = con.prepareStatement(q);
			ptm.setString(1, "Mujtaba");
			ptm.setString(2, "Mumbai");
			ptm.execute();
			System.out.println("inserted...");
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
