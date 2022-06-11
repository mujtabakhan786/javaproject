package com.manytomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


@Entity
public class MappingDemo {
 public static void main(String[] args) {
	Configuration cfg=new Configuration();
	cfg.configure();
	SessionFactory factory = cfg.buildSessionFactory();
	
	Emp e1=new Emp();
	Emp e2=new Emp();
	Emp e3=new Emp();
	
	
	e1.setEid(1);
	e1.setName("Mujtaba");
	
	e2.setEid(2);
	e2.setName("Khan");
	
	e3.setEid(3);
	e3.setName("Kha");
	
	Project p1=new Project();
	Project p2=new Project();
	
	p1.setPid(3);
	p1.setProjectName("Library management system");
	
	p2.setPid(4);
	p2.setProjectName("CHATBOT");
	
	List<Emp> list1=new ArrayList<Emp>();
	List<Project> list2=new ArrayList<Project>();
	
	list1.add(e1);
	list1.add(e2);
	list1.add(e3);
	
	list2.add(p1);
	list2.add(p2);
	
   e1.setProjects(list2);
   e2.setProjects(list2);
	p1.setEmps(list1); 
	
	Session session = factory.openSession();
	Transaction transaction = session.beginTransaction();
	session.save(e1);
	session.save(e2);
	session.save(e3);
	session.save(p1);
	session.save(p2);
	
	transaction.commit();
	factory.close();
	session.close();
}
}
