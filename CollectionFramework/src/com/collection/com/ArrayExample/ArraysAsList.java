package com.ArrayExample;

import java.util.Arrays;
import java.util.List;

public class ArraysAsList {

	public static void main(String[] args) {
		String[] s= {"A","B","C"};
		List l=Arrays.asList(s);
		System.out.println(l);
		s[0]="K";
		System.out.println(l);
		l.set(1, "D");
		for(String s1:s)
		System.out.println(s1);	
		//l.add("M"); Exception because we can't add Element in Array.
		//l.set(1,new Integer(10));Exeception because Hetrogenous not allow.
	}

}
