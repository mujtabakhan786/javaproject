package com.bantai;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bantai.mapping.onetoone.Answer;
import com.bantai.mapping.onetoone.Question;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		Question question = new Question();
		question.setQid(1);
		question.setQname("What is Class in Java?");

		Answer answer = new Answer();
		answer.setAnswerId(2);
		answer.setAnswer("class is group of object");
		question.setAnswer(answer);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(question);
		session.save(answer);
		tx.commit();
		session.close();
		factory.close();
	}
}
