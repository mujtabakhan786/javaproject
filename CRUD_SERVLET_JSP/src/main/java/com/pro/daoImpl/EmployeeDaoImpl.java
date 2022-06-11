/**
 * 
 */
package com.pro.daoImpl;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.pro.dao.EmployeeDao;

import com.pro.pojo.Employee;
import com.pro.utility.DbConnection;

/**
 * @author Mujtaba khan
 *
 */
public class EmployeeDaoImpl implements EmployeeDao {
	Connection con;
	PreparedStatement pstmt;
	ResultSet rs;
//	Statement stmt;

	// insert
	@Override
	public void create(Employee e) {
		String query = "insert into Employee(name,salary,address) values(?,?,?)";
		con = DbConnection.getConnection();
		try {
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, e.getName());
			pstmt.setDouble(2, e.getSalary());
			pstmt.setString(3, e.getAddress());
			int executeUpdate = pstmt.executeUpdate();
			System.out.println("record is inserted : " + executeUpdate);
		} catch (SQLException e1) {

			e1.printStackTrace();
		}

	}

//	fetch
	@Override
	public List<Employee> read() {

		String query = "select * from Employee";
		con = DbConnection.getConnection();
		List<Employee> list = new ArrayList<Employee>();
		try {
			pstmt = con.prepareStatement(query);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				Employee employee = new Employee();
				
				employee.setId(rs.getInt("id"));
				employee.setName(rs.getString("name"));
				employee.setSalary(rs.getDouble("salary"));
				employee.setAddress(rs.getString("address"));
				list.add(employee);
				System.out.println(employee.toString());
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return list;
	}

}
