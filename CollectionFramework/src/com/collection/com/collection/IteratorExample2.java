package com.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample2 {

	public static void main(String[] args) 
	{
		ArrayList list=new ArrayList();
		list.add("Mango");
		list.add("Apple");
		list.add("Banana");
		list.add("Grapes");
		System.out.println(list);
		Iterator itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
