package com.springcore.autowring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/autowring/autoconfig.xml");
		Emp e=(Emp) context.getBean("em");
		System.out.println(e);
	}

}