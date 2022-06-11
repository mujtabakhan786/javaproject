package com.jdbc;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class SixthJdbc {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/image";
			String user = "root";
			String password = "root";
			Connection con = DriverManager.getConnection(url, user, password);
			String q = "insert into image(pic) values(?)";
			PreparedStatement ptm = con.prepareStatement(q);
			JFileChooser jfc=new JFileChooser();
			jfc.showOpenDialog(null);
			File file=jfc.getSelectedFile();
			FileInputStream fis = new FileInputStream(file);
			ptm.setBinaryStream(1, fis, fis.available());
			ptm.executeUpdate();
			//System.out.println("Done");
			JOptionPane.showMessageDialog(null, "success");
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
