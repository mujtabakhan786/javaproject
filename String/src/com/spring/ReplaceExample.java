package com.spring;

public class ReplaceExample {
public static void main(String[] args) {
	String s="This is Demo";
	System.out.println(s.replace("is","war"));
	System.out.println(s.replaceFirst("is","war"));
	System.out.println(s.replaceAll("is","war"));
	System.out.println(s.replaceAll("is(.)","war"));//is remove space
	System.out.println(s.replaceAll("is(.*)","war"));//first it replace is into war after it can't print  
}
}
