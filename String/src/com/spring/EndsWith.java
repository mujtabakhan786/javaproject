package com.spring;

public class EndsWith {
public static void main(String[] args) {
	String s="Welcom to javatpoint.com";
	System.out.println(s.endsWith("point"));
	if(s.contains(".com"))
	{
		System.out.println("String ends with .com");
	}
	else {
		System.out.println("it does not end with .com");
	}
}
}
