package com.collections;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsReverseExample {

	public static void main(String[] args) {
		ArrayList l = new ArrayList();
		l.add(10);
		l.add(9);
		l.add(8);
		l.add(7);
		System.out.println(l);
		Collections.reverse(l);
		System.out.println(l);
	}
}
