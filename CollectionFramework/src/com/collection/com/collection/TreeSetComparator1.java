package com.collection;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetComparator1 
{
	public static void main(String[] args) 
	{
		TreeSet t=new TreeSet(new MyComparator2());
		t.add("A");
		t.add("E");
		t.add("D");
		t.add("C");
		t.add("B");
		System.out.println(t);
	}
}
class MyComparator2 implements Comparator
{
		public int compare(Object obj1, Object obj2)
		{
			String s1=(String)obj1;
			String s2=(String)obj2;
			return s2.compareTo(s1);
		}
}
