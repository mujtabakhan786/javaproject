package com.Hashtable;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashtableExample {

	public static void main(String[] args) {
		Hashtable t = new Hashtable();
		t.put(new Temp(5), "A");
		t.put(new Temp(2), "B");
		t.put(new Temp(6), "C");
		t.put(new Temp(15), "D");
		t.put(new Temp(23), "E");
		t.put(new Temp(16), "F");
		System.out.println(t);
		Set s = t.entrySet();
		Iterator itr = s.iterator();
		while (itr.hasNext()) {
			Map.Entry m = (Map.Entry) itr.next();
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}
}

class Temp {
	int i;

	public Temp(int i) {
		super();
		this.i = i;
	}

	@Override
	public int hashCode() {
		return i;
	}

	@Override
	public String toString() {
		return i + "";
	}
}