package com.spring;

public class ExceptionExample {
public static void main(String[] args) {
	try {
	int a=100;
	int b=0;
	int c=a/b;
	}
	catch(ArithmeticException e) {
	System.out.println("Hello");}
	System.out.println("you cannot divide by zero");
}
}
