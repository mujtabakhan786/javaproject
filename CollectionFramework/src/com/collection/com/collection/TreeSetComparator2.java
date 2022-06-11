package com.collection;
import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetComparator2 {

	public static void main(String[] args) 
	{
		TreeSet t=new TreeSet(new MyComparator3());
		t.add(new StringBuffer("A"));
		t.add(new StringBuffer("C"));
		t.add(new StringBuffer("G"));
		t.add(new StringBuffer("J"));
		t.add(new StringBuffer("K"));
		t.add(new StringBuffer("Z"));
		System.out.println(t);
	}
}
class MyComparator3 implements Comparator
{
	public int compare(Object obj1, Object obj2)
	{	
		String s1=obj1.toString();
		String s2=obj2.toString();
		return s2.compareTo(s1);
	}
}
