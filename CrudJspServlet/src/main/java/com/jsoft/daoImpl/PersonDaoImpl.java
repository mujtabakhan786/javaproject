/**
 * 
 */
package com.jsoft.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.jsoft.dao.PersonDao;
import com.jsoft.pojo.Person;
import com.jsoft.utility.DbConnection;

/**
 * @author Mujtaba khan
 *
 */
public class PersonDaoImpl implements PersonDao {

	@Override
	public void create(Person p) {

		PreparedStatement ps = null;
		Connection con = null;
		String query = "insert into person(name,email,password,age) values(?,?,?,?)";
		con = DbConnection.getConnection();
		try {
			ps = con.prepareStatement(query);
			ps.setString(1, p.getName());
			ps.setString(2, p.getEmail());
			ps.setString(3, p.getPassword());
			ps.setInt(4, p.getAge());
			ps.executeUpdate();
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	@Override
	public List<Person> read() {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		Person p = null;
		String s = "select * from person";
		List<Person> list = new ArrayList<Person>();
		con = DbConnection.getConnection();
		try {
			ps = con.prepareStatement(s);
			rs = ps.executeQuery(s);

			while (rs.next()) {
				p = new Person();
				p.setId(rs.getInt("id"));
				p.setName(rs.getString("name"));
				p.setEmail(rs.getString("email"));
				p.setPassword(rs.getString("password"));
				p.setAge(rs.getInt("age"));

				list.add(p);
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return list;
	}

}
