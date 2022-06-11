package com.spring;

public class EqualsExample1 {
public static void main(String[] args) {
	String s="javatpoint";
	String s1="javatpoint";
	String s2="Javatpoint";
	System.out.println(s.equals(s1));
	if (s.equals(s1)) {
		
		System.out.println("both string are equal");
	}
	else {
		System.out.println("both string are unequal");
	}
}
}
