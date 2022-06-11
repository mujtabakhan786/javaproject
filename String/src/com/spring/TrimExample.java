package com.spring;

public class TrimExample {
public static void main(String[] args) {
	String name="     ";
	if (name.trim().length()==0) {
		System.out.println("name is empty");
		}
	else {
		System.out.println("valid name");
	
	}
}
}
