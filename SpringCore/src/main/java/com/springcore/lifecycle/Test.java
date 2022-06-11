package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml");
		context.registerShutdownHook();
//		Samosa s1 = (Samosa)context.getBean("s");
//		System.out.println(s1);
//		
//		
//		
//		Pepsi p1 = (Pepsi)context.getBean("p");
//		System.out.println(p1);
		
		Example e1= (Example) context.getBean("e");
		System.out.println(e1);
	}

}
