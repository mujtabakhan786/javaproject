package com.pro;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmDemo {
	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Student student1=new Student();
		student1.setId(121);
		student1.setName("Khan");
		student1.setCity("Sakinaka");
		
		Certificate cf=new Certificate();
		cf.setCourse("Android");
		cf.setDuration("2 month");
		student1.setCerti(cf);
		
		Student student2=new Student();
		student2.setId(122);
		student2.setName("Faisal");
		student2.setCity("Tilak Nagar");
		
		Certificate cf1=new Certificate();
		cf1.setCourse("Hibernate");
		cf1.setDuration("1.5 month");
		student2.setCerti(cf1);
		
		
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(student1);
		session.save(student2);
		
		
		transaction.commit();
		factory.close();
		session.close();
	}
}
