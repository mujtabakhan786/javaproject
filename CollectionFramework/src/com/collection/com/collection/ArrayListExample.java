package com.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("Abdullah");
		arrayList.add("Asif");
		arrayList.add("Asif");
		arrayList.add("Adil");
		arrayList.add("Baitullah");
		arrayList.add("Mushahid");
//		Iterator<String> iterator = arrayList.iterator();
//		while (iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}
		for (String s : arrayList) {
			System.out.println(s);
		}
		
		
	}

}
