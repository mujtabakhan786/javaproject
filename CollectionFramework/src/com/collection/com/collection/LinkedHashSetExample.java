package com.collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetExample 
{
	public static void main(String[] args) 
	{
		LinkedHashSet lh=new LinkedHashSet();
		lh.add(1);
		lh.add(2);
		lh.add(3);
		lh.add(4);
		lh.add(5);
		System.out.println(lh);
		Iterator itr=lh.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
