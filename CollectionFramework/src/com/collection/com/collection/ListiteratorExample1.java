package com.collection;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Set;

public class ListiteratorExample1 {

	public static void main(String[] args) 
	{
		ArrayList<String> l=new ArrayList<String>();
		l.add("Mujtaba");
		l.add("Khan");
		l.add("Faisal");
		l.add("Murtaza");
		l.add("Sohail");
		System.out.println(l);
		ListIterator<String> itr=l.listIterator();
		System.out.println("Before");
		while(itr.hasNext())
		{
			
			System.out.println(itr.next());
			
		}
		System.out.println("After");

		while(itr.hasPrevious()) 
		{
			String S=(String)itr.previous();
			if(S.equals("Sohail"))
			{
				itr.set("Sahil");
				System.out.println(itr.previous());
			}
		}
		System.out.println(l);
		
	
	}

}
