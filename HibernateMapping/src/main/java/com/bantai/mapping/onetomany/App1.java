package com.bantai.mapping.onetomany;

import java.util.ArrayList;

import java.util.List;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App1 {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		Question1 question = new Question1();
		question.setqId(43);
		question.setqName("What is Java?");

		Answer1 answer = new Answer1();
		answer.setAnsId(44);
		answer.setAnswer("Java is Object Oriented");
		answer.setQuestion(question);

		Answer1 answer1 = new Answer1();
		answer1.setAnsId(45);
		answer1.setAnswer("Java is Hogh Level");
		answer1.setQuestion(question);

		Answer1 answer2 = new Answer1();
		answer2.setAnsId(46);
		answer2.setAnswer(
				"Java is Secure");
		answer2.setQuestion(question);

		List<Answer1> list = new ArrayList<Answer1>();
		list.add(answer);
		list.add(answer1);
		list.add(answer2);
		question.setAnswer(list);

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(question);
		session.save(answer);
		session.save(answer1);
		session.save(answer2);
		tx.commit();
		session.close();
		factory.close();
	}
}
