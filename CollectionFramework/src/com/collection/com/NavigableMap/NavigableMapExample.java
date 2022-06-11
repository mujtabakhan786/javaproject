package com.NavigableMap;

import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapExample {

	public static void main(String[] args) {
		TreeMap t = new TreeMap();
		t.put("B", "Banana");
		t.put("C", "Cat");
		t.put("A", "Apple");
		t.put("D", "Dog");
		t.put("G", "Gun");
		System.out.println(t);
		System.out.println(t.ceilingKey("C"));
		System.out.println(t.higherKey("E"));
		System.out.println(t.floorKey("E"));
		System.out.println(t.lowerKey("E"));
		System.out.println(t.pollFirstEntry());
		System.out.println(t.pollLastEntry());
		System.out.println(t.descendingMap());
		System.out.println(t);
	}

}
