package com.spring;

public class ChartAtExample1 {
public static void main(String[] args) {
	String s="Welcome to javatpoint portal";
	for(int i=0;i<=s.length()-1;i++)
	{
		if(i%2==0)
		{
			System.out.println("Char at"+" "+i+" "+"place"+" "+s.charAt(i));
		}
	}
}
}
