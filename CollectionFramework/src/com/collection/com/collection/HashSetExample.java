package com.collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample 
{
	public static void main(String[] args) {
		HashSet h=new HashSet();
		h.add("Mujtaba");
		h.add(1);
		h.add(2);
		h.add(3);
		h.add(2);
		System.out.println(h);
		Iterator itr=h.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}
}
