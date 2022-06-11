package com.pegination;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.pro.Student;

public class Pegination {
	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		Query query = session.createQuery("from Student");
		query.setFirstResult(0);
		query.setMaxResults(3);
		List<Student> list = query.list();
		for(Student s: list)
		{
			System.out.println(s.getCity() + " : " + s.getId() + " : " + s.getName());
		}
		
		session.close();
		factory.close();
	}
}
