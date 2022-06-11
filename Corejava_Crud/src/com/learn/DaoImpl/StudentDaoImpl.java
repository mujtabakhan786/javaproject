package com.learn.DaoImpl;

import com.learn.dao.StudentDao;
import com.learn.pojo.Student;

public class StudentDaoImpl implements StudentDao {

	@Override
	
		public int getValue(Student s) {
			System.out.println("id :"+ s.getId());
			System.out.println("name :"+ s.getName());
			System.out.println("mob :"+ s.getMob());
			System.out.println("address :"+ s.getAddress());
			System.out.println("age :"+ s.getAge());
			return s.getAge();
		}
		
	}
	

