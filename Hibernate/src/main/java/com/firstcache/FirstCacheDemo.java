package com.firstcache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.pro.Student;

public class FirstCacheDemo {
	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		
		Student student = (Student)session.get(Student.class, 121);
		System.out.println(student);
		
		System.out.println("working something");
		Student student1 = (Student)session.get(Student.class, 121);
		System.out.println(student1);

		
		session.close();
		factory.close();
	}
}
