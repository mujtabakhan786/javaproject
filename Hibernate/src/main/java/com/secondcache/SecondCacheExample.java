package com.secondcache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.pro.Student;

public class SecondCacheExample {

	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session session1= factory.openSession();
		
		Student student1=session1.get(Student.class, 121);
		System.out.println(student1);
		session1.close();
		
		Session session2 = factory.openSession();
		Student student2=session2.get(Student.class, 121);
		System.out.println(student2);

		session2.close();
		
		
	}

}
