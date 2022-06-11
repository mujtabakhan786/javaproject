package com.onetoone;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapDemo {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory Factory = cfg.buildSessionFactory();

		Question q = new Question();
		q.setQuestionIid(1);
		q.setQuestion("what is java?");

		Answer a = new Answer();
		a.setAnswerId(10);
		a.setAnswer("Java is programming language");
		a.setQuestion(q);


		Answer a1 = new Answer();
		a1.setAnswerId(11);
		a1.setAnswer("with the help of java we can a create software");
		a1.setQuestion(q);
		
		
		Answer a2 = new Answer();
		a2.setAnswerId(12);
		a2.setAnswer("java has different type a of Frameworks");
		a2.setQuestion(q);
		
		List<Answer> list=new ArrayList<Answer>();
		list.add(a);
		list.add(a1);
		list.add(a2);
		
		q.setAnswers(list);
		
		
		Session session = Factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(q);
		session.save(a);
		session.save(a1);
		session.save(a2);
		
//		Question question = (Question)session.get(Question.class, 1);
//		System.out.println(question.getQuestion());
//		
//		
//		for(Answer a : question.getAnswers()) {
//			System.out.println(a.getAnswer());
//		}
//		
		
		transaction.commit();		
		Factory.close(); 
		session.close();
	}

}
