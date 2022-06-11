package com.collections;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsExample2 {

	public static void main(String[] args) {
		ArrayList l=new ArrayList();
		l.add("B");
		l.add("C");
		l.add("D");
		l.add("E");
		l.add("Z");
		System.out.println(l);
		Collections.sort(l);
		System.out.println(l);
		System.out.println(Collections.binarySearch(l, "D"));
		System.out.println(Collections.binarySearch(l, "A"));
	}

}
