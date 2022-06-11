package com.collection;

import java.util.ArrayList;

public class ArrayListExample2 
{
	public static void main(String[] args)
	{
		ArrayList al=new ArrayList();
		al.add("M");
		al.add("U");
		al.add("J");
		al.add(3);
		al.add("T");
		System.out.println(al);
		al.remove(2);
		System.out.println(al);
		al.add(2,"S");
		System.out.println(al);
	}

}
