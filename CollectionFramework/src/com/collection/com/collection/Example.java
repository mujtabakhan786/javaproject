package com.collection;

import java.util.TreeSet;

public class Example {
public static void main(String[] args) {
	TreeSet t=new TreeSet();
	t.add(101);
	t.add(102);
	t.add(103);
	t.add(104);
	t.add(105);
	System.out.println(t);
	System.out.println(t.first());
	System.out.println(t.last());
	System.out.println(t.headSet(104));
	System.out.println(t.tailSet(102));
	System.out.println(t.subSet(101,105));
	System.out.println(t.comparator());
}
}
