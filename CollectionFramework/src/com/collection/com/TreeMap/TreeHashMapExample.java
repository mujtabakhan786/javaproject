package com.TreeMap;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeHashMapExample {

	public static void main(String[] args) {
		TreeMap t=new TreeMap(new Mujtaba());
		t.put("XXX", 10);
		t.put("AAA", 20);
		t.put("ZZZ", 30);
		t.put("LLL", 40);
		System.out.println(t);
		Set s=t.entrySet();
		Iterator itr=s.iterator();
		while(itr.hasNext())
		{
			Map.Entry m=(Map.Entry)itr.next();
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}

}
class Mujtaba implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) {
		String s=o1.toString();
		String s1=o2.toString();
		return s1.compareTo(s);
	}
}	

