/**
 * 
 */
package com.learn.controller;

import com.learn.DaoImpl.StudentDaoImpl;
import com.learn.dao.StudentDao;
import com.learn.pojo.Student;

/**
 * @author Mujtaba khan
 *
 */
public class StudentMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Hello world");
		Student s=new Student(1,"Mujtaba","Mumbai","9167263547",28);
		System.out.println(s);
		StudentDao sd=new StudentDaoImpl();
		int i = sd.getValue(s);
		System.out.println(i);
	}

}
