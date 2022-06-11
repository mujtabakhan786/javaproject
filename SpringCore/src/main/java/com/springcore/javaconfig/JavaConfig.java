package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
	
	@Bean
	public Cricket getCricket()
	{
		return new Cricket();
	}
	
	
	@Bean(name = {"getStudent","Mumbai","Khan"})
	public Student getStudent()
	{
		Student student = new Student(getCricket());
		return student;
	}

}
