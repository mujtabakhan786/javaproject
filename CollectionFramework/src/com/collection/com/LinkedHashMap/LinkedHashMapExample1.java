package com.LinkedHashMap;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapExample1 {

	public static void main(String[] args) {
		LinkedHashMap m = new LinkedHashMap();
		m.put(101, "Mujtaba");
		m.put(102, "Khan");
		m.put(103, "Murtaza");
		m.put(104, "Faisal");
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
