package com.collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListiteratorExample2 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("Fan");
		list.add("Tubelight");
		list.add("Bulb");
		list.add("Television");
		ListIterator itr = list.listIterator();
		System.out.println("The list of electric appliance is given as :" + list);
		System.out.println("In the forward direction :");
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("In the backward direction :");
		while (itr.hasPrevious()) {
			System.out.println(itr.previous());
		}
	}

}
