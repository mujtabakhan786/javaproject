package com.aman.jdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.protocol.Resultset;

public class AccountDao {
	public static void main(String[] args) {
		
		
		  //Getting the connection
	      String mysqlUrl = "jdbc:mysql://localhost/mydb";
	      System.out.println("Connection established......");
	      //Registering the Driver
	      try(Connection con = DriverManager.getConnection(mysqlUrl, "root", "root");
	      Statement stmt = con.createStatement();  
	         ResultSet rs = stmt.executeQuery("select * from account");){
	            //Retrieving the data
	            while(rs.next()) {
	              System.out.println( rs.getString(2));
	               System.out.println(rs.getString(3));
	               System.out.println(rs.getInt(4));
	            }
	         } catch (SQLException e) {
	            e.printStackTrace();
	         }
	      } 
		}

