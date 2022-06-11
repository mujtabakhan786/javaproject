package com.jdbc;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class fivethJdbc {

	public static void main(String[] args) {
		try 
		{
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/image";
		String user="root";
		String password="root";
		Connection con = DriverManager.getConnection(url, user, password);
		String q="insert into image(pic) values(?)";
		PreparedStatement ptm = con.prepareStatement(q);
		FileInputStream fis=new FileInputStream("C:\\Users\\Mujtaba khan\\OneDrive\\Desktop\\birds.jpg");
		ptm.setBinaryStream(1,fis,fis.available());
		ptm.executeUpdate();
		System.out.println("Done");
		con.close();
	}
		catch (Exception e) {
			e.printStackTrace();
		}

}
}
