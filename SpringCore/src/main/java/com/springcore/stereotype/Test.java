package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/stereotype/seteroconfi.xml");
		Student student = (Student) context.getBean("ob");
//		System.out.println(student);
//		System.out.println(student.getAddress());
//		System.out.println(student.getAddress().getClass().getName());
		
		System.out.println(student.hashCode());
		
		
		Student student1 = (Student) context.getBean("ob");
		System.out.println(student1.hashCode());
	}

}
