package com.spring;

public class ContainsExample {
public static void main(String[] args) {
	String s="Mujtaba";
	System.out.println(s.charAt(2));
	System.out.println(s.indexOf('a'));
	System.out.println(s.lastIndexOf('a'));
	System.out.println(s.contains("a"));
	System.out.println(s.startsWith("M"));
	System.out.println(s.startsWith("m"));
	System.out.println(s.endsWith("a"));
}
}
