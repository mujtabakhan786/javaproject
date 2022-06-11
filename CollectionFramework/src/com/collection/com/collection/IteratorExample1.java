package com.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample1 {

	public static void main(String[] args) 
	{
		ArrayList list=new ArrayList();
		list.add(1);
		list.add("abc");
		list.add("Mango");
		System.out.println(list);
		Iterator itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
