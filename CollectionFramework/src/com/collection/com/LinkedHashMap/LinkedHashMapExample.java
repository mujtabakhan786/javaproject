package com.LinkedHashMap;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapExample {

	public static void main(String[] args) {
	LinkedHashMap<String,Integer> m=new LinkedHashMap<String,Integer>();
	m.put("Mujtaba", 100);
	m.put("Khan", 101);
	m.put("Murtaza", 102);
	m.put("Khan", 103);
	m.put("Faisal", 104);
	
	System.out.println(m);
	Set s=m.keySet();
	System.out.println(s);
	Collection c=m.values();
	System.out.println(c);
	//Set s1=m.entrySet();
	//System.out.println(s1);
	for(Map.Entry e:m.entrySet()) 
	{
	System.out.println(e.getKey()+" "+e.getValue());	
	}
	}

}
