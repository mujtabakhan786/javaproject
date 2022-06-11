package com.HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample1 {
	public static void main(String[] args) {
		HashMap m = new HashMap();
		m.put(1, "Mango");
		m.put(2, "Apple");
		m.put(3, "Banana");
		m.put(4, "Grapes");
		System.out.println(m);
		Set s = m.entrySet();
		Iterator itr = s.iterator();
		while (itr.hasNext()) {
			Map.Entry m1 = (Map.Entry) itr.next();
			System.out.println(m1.getKey() + " " + m1.getValue());
		}
		System.out.println(m);
	}
}
