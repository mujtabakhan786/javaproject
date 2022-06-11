package com.collection;

import java.util.LinkedList;

public class LinkedListExample 
{
	public static void main(String[] args)
	{
		LinkedList l=new LinkedList();
		l.add("Mujtaba");
		l.add("Khan");
		l.add(30);
		l.add(null);
		l.set(0,"Faisal");
		l.add(0,"Sohail");
		l.addFirst("Murtaza");
		System.out.println(l);
	}
}
