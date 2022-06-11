package com.collections;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsExample {

	public static void main(String[] args) {
		ArrayList l=new ArrayList();
		l.add("D");
		l.add("C");
		l.add("B");
		l.add("A");
		System.out.println("Before Sorting: "+l);
		Collections.sort(l);
		System.out.println("After Sorting: "+l);
	}

}
