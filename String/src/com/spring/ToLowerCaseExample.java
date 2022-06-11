package com.spring;

public class ToLowerCaseExample {
public static void main(String[] args) {
	String s="Mujtaba";
	System.out.println(s.toLowerCase());
	System.out.println(s.toUpperCase());
	//----------------------------
	
	int a=10, b=20;
	System.out.println(a+b);
	String s1=String.valueOf(a);
	String s2=String.valueOf(b);
	System.out.println(s1+s2);
	
	
	char[] c=s.toCharArray();
	System.out.println(c);
}
}
