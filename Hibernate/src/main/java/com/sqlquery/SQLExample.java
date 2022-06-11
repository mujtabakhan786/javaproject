package com.sqlquery;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;

import com.pro.Student;

public class SQLExample {
	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		
		//SQL Query
		String q="select * from student";
		NativeQuery sqlQuery = session.createSQLQuery(q);
		List<Object[]> list = sqlQuery.list();
		for(Object[] s:list)
		{
			System.out.println(s[1] +"  " + s[3]);
		}
		
		session.close();
		factory.close();
	}
}
