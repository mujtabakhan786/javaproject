package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionsExample1 {

	public static void main(String[] args) {
		ArrayList l=new ArrayList();
		l.add("A");
		l.add("B");
		l.add("C");
		l.add("D");
		l.add("E");
		System.out.println("Before Sorting: "+l);
		Collections.sort(l,new Faisal());
		System.out.println("After Sorting: "+l);
	}
}
class Faisal implements Comparator
{

	@Override
	public int compare(Object obj1, Object obj2) {
		String s=obj1.toString();
		String s1=obj2.toString();
		return s1.compareTo(s);
	}
	
}
