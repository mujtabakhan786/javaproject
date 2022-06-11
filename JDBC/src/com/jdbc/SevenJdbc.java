package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class SevenJdbc {

	public static void main(String[] args){
		try {
		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/learn";
		String user="root";
		String password="root";
		Connection con = DriverManager.getConnection(url, user, password);
		String q="update student set name=?, country=? where id=?";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter new name :");
		String name = sc.next();
		sc.nextLine();
		
		System.out.println("Enter new country :");
		String country = sc.next();
		
		System.out.println("Enter the student id :");
		int id = sc.nextInt();
		
		PreparedStatement stm = con.prepareStatement(q);
		stm.setString(1, name);
		stm.setString(2, country);
		stm.setInt(3, id);
		stm.executeUpdate();
		System.out.println("Done");
		con.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
