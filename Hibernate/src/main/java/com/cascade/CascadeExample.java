package com.cascade;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.onetoone.Answer;
import com.onetoone.Question;

public class CascadeExample {

	public static void main(String[] args) {
		Configuration cfg= new Configuration();
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();

		Question q1 = new Question();
		q1.setQuestionIid(1);
		q1.setQuestion("what is Cascading");

		Answer a1 = new Answer(23, "In hibernate it is important concepy");
		Answer a2 = new Answer(24, "Second Answer");
		Answer a3 = new Answer(25, "Third Answer");

		List<Answer> list = new ArrayList();
		list.add(a1);
		list.add(a2);
		list.add(a3);
		
		q1.setAnswers(list);
		Transaction transaction = session.beginTransaction();
		session.save(q1);
//		session.save(a1);
//		session.save(a2);
//		session.save(a3);
		
		transaction.commit();
		session.close();
		factory.close();

	}

}
