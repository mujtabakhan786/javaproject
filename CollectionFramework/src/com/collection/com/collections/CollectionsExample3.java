package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionsExample3 {

	public static void main(String[] args) {
		ArrayList l=new ArrayList();
		l.add("A");
		l.add("C");
		l.add("D");
		l.add("E");
		l.add("F");
		System.out.println(l);
		Collections.sort(l);
		System.out.println(l);
		System.out.println(Collections.binarySearch(l, "F",new Khan()));
		System.out.println(Collections.binarySearch(l, "A",new Khan()));
		System.out.println(Collections.binarySearch(l, "B",new Khan()));
	}
}
class Khan implements Comparator
{

	@Override
	public int compare(Object obj1, Object obj2) {
		String s=(String)obj1;
		String s1=(String)obj2;
		
		return s1.compareTo(s);
	}
	
}