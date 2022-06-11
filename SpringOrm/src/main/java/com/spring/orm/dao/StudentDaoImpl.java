package com.spring.orm.dao;

import org.springframework.orm.hibernate5.HibernateTemplate;
import com.spring.orm.entities.Student;

public class StudentDaoImpl implements StudentDao {
	private HibernateTemplate hibernateTemplate;

	public int insert(Student student) {
		  int i = (Integer) this.hibernateTemplate.save(student);
		return i;
	}

}
