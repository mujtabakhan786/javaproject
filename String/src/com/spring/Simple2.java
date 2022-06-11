package com.spring;

import java.util.StringTokenizer;

public class Simple2 {
public static void main(String[] args) {
	   StringTokenizer st = new StringTokenizer("Demonstrating methods from StringTokenizer class"," ");
	   while(st.hasMoreTokens())
	   {
		   System.out.println(st.nextToken());
	   }
}
}
