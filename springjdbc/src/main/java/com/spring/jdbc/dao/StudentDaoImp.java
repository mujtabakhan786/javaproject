package com.spring.jdbc.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.spring.jdbc.entites.Student;

public class StudentDaoImp implements StudentDao{
	private JdbcTemplate jdbcTemplate;

	public int insert(Student student) {
		//insert query
		String q="insert into student(id,name,city) values(?,?,?)";
		int i = this.jdbcTemplate.update(q,student.getId(),student.getName(),student.getCity());
		return i;
	}
	
	public int change(Student student) {
		String q="update student set name=?, city=? where id=?";
		int r = this.jdbcTemplate.update(q,student.getName(),student.getCity(),student.getId());
		return r;
	}
	
	public int delete(Student student) {
		String q="delete from student where id=?";
		int i = this.jdbcTemplate.update(q,student.getId());
		return i;
	}
	
	public Student getStudent(int studentId) {
		String q="select * from student where id=?";
		RowMapper<Student> rowMapper = new RowMapperImpl();
		Student student = this.jdbcTemplate.queryForObject(q, rowMapper,studentId);
		return student;
	}
	
	public List<Student> getAllStudents() {
		String q="select * from student";
		List<Student> students = this.jdbcTemplate.query(q,new RowMapperImpl());
		return students;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	
}
