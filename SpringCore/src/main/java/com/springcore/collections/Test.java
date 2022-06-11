package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context =new ClassPathXmlApplicationContext("com/springcore/collections/collectionconfig.xml");
		Emp e = (Emp)context.getBean("e");
		System.out.println(e.getName());
		System.out.println(e.getAddresses());
		System.out.println(e.getCourse());
		System.out.println(e.getPhones());
	}

}
