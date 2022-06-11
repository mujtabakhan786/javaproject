package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class EigthJdbc {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/learn";
			String user = "root";
			String password = "root";
			Connection con = DriverManager.getConnection(url, user, password);
			String query = "select * from student";
			Statement stm = con.createStatement();
			ResultSet set = stm.executeQuery(query);
			while (set.next()) {
				int id = set.getInt(1);
				String name = set.getString(2);
				String country = set.getString(3);
				System.out.println(id + " " + name + " " + country);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
