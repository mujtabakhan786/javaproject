package com.hql;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.manytomany.Emp;
import com.pro.Student;

public class HQLExample {
 public static void main(String[] args) {
	Configuration cfg=new Configuration();
	cfg.configure();
	SessionFactory factory = cfg.buildSessionFactory();
	Session session = factory.openSession();
	
	
//	similar like sql(select *from Student) or fetching
//	String q="from Student where course='Andriod'";
//	
//	Query query = session.createQuery(q);
//	List<Student> list = query.list();
//	
//	for(Student e : list)
//	{
//		System.out.println(e.getName());
//	}
	
	System.out.println("--------------------------------------------");
	
	//for delete
	Transaction transaction = session.beginTransaction();
	
	
//	Query query2 = session.createQuery("delete from Student as s where s.city=:s");
//	query2.setParameter("s", "Sakinaka");
//	int i = query2.executeUpdate();
//	System.out.println("Delect :");
//	System.out.println(i);
//	for updating
	
	Query query3 = session.createQuery("update Student set city=:x where course=:n");
	query3.setParameter("x", "Sakinaka");
	query3.setParameter("n", "Hibernate");
	int i =query3.executeUpdate();
	System.out.println(i + "objects updates");

	 	
	transaction.commit();
	
	session.close();
	factory.close();
	
}
}
