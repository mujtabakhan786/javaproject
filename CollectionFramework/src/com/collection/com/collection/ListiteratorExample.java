package com.collection;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListiteratorExample {

	public static void main(String[] args) 
	{
		LinkedList l=new LinkedList();
		l.add("Mujtaba");
		l.add("khan");
		l.add("Murtaza");	
		l.add("Sohail");
		l.add("Ismail");
		System.out.println(l);
		ListIterator itr=l.listIterator();
		while(itr.hasNext())
		{
			String s=(String)itr.next();
			if(s.equals("Sohail"))
			{
				itr.remove();
			}
			else if(s.equals("Murtaza"))
			{
				itr.add("Khan");
			}
			else if(s.equals("Ismail"))
			{
				itr.set("Faisal");
			}
		}
		System.out.println(l);
	}

}
