package com.spring;

public class ChartAtExample2 {
public static void main(String[] args) {
	String s="Welcome to javatpoint portal";
	int count=0;
	for(int i=0;i<=s.length()-1;i++)
	{
		if(s.charAt(i)=='t')
		{
			count++;
		}
	}
	System.out.println("Frequency of t is: "+count);
}
}
