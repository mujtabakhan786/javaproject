package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class InsertingValue {
public static void main(String[] args) {
	
	try {
		Class.forName("com.mysql.jdbc.Driver");
		
		String url="jdbc:mysql://localhost:3306/learn";
		String username="root";
		String password="root";
		
		Connection con = DriverManager.getConnection(url, username, password);
		
		String q="insert into test1 values(?,?,?)";
		String q1="select * from test1";
		PreparedStatement pstm = con.prepareStatement(q);
		pstm.setInt(1, 80);
		pstm.setString(2, "azhar");
		pstm.setString(3, "mumbai");
		pstm.executeUpdate();
		System.out.println("values inserted successfully");
		ResultSet set = pstm.executeQuery(q1);
		while(set.next())
		{
			int id=set.getInt(1);
			String name = set.getString(2);
			String city = set.getString(3);
			System.out.println(id+" "+name+ " "+city);
				}
		
		
		
		con.close();
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	
	
}
}
