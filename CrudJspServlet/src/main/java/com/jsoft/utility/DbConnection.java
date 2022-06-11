/**
 * 
 */
package com.jsoft.utility;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @author Mujtaba khan
 *
 */
public class DbConnection {
	public final static String DRIVER = "com.mysql.cj.jdbc.Driver";
	public final static String URL = "jdbc:mysql://localhost:3306/personcrud";
	public final static String USERNAME = "root";
	public final static String PASSWORD = "root";

	public static Connection getConnection() {
		Connection con = null;

		try {
			Class.forName(DRIVER);
		con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		} catch (Exception e) {

			e.printStackTrace();
		}

		return con;
	}
}
