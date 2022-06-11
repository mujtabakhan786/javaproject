package com.collection;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetComparator 
{
	public static void main(String[] args) 
	{
		TreeSet t=new TreeSet(new MyComparator());
		t.add(8);
		t.add(10);
		t.add(7);
		t.add(9);
		t.add(6);
		System.out.println(t);
	}
}
class MyComparator implements Comparator
{
	public int compare(Object obj1,Object obj2)
	{
		Integer I1=(Integer)obj1;
		Integer I2=(Integer)obj2;
		return I2.compareTo(I1);
	}
}
