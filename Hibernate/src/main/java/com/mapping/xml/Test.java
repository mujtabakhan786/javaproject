package com.mapping.xml;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Person p=new Person(11,"Mujtaba","9167263547","Mumbai");
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(p);
		transaction.commit();
		session.close();
		factory.close();
	}

}
