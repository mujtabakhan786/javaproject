package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class FourthJdbc {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/jdbc";
			String user = "root";
			String password = "root";
			Connection con = DriverManager.getConnection(url, user, password);
			String q = "insert into table2(id,name,city) values(?,?,?)";
			PreparedStatement ptm = con.prepareStatement(q);
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter id :");
			int id = sc.nextInt();
			sc.nextLine();

			System.out.println("Enter name :");
			String name = sc.nextLine();

			System.out.println("Enter city :");
			String city = sc.nextLine();

			ptm.setInt(1, id);
			ptm.setString(2, name);
			ptm.setString(3, city);
			ptm.execute();			
			System.out.println("inserted......");
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
