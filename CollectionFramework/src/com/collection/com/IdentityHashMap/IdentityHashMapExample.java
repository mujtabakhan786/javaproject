package com.IdentityHashMap;

import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class IdentityHashMapExample {

	public static void main(String[] args) {
		Integer I1=new Integer(10);
		Integer I2=new Integer(10);
		IdentityHashMap i=new IdentityHashMap();
		i.put(I1, "Mujtaba");
		i.put(I2, "Khan");
		System.out.println(i);
		Set s=i.entrySet();
		Iterator itr=s.iterator();
		while (itr.hasNext()) {
			Map.Entry m = (Map.Entry)itr.next();
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}

}
