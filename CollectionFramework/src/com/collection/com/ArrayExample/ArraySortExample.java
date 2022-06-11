package com.ArrayExample;

import java.util.Arrays;
import java.util.Comparator;

public class ArraySortExample {

	public static void main(String[] args) {
		int[] a = { 10, 20, 30, 50, 40 };
		System.out.println("Primitve Array before Sorting :");
		for (int a1 : a)
			System.out.println(a1);
		Arrays.sort(a);
		System.out.println("Primitve Array After Sorting :");
		for (int a1 : a)
			System.out.println(a1);
		String[] s = { "A", "C", "B", "D" };
		System.out.println("Object Array Before Sorting");
		for (String s1 : s)
			System.out.println(s1);
		Arrays.sort(s);
		System.out.println("Object Array After Sorting");
		for (String s2 : s)
			System.out.println(s2);
		Arrays.sort(s, new Khans());
		System.out.println("Object Array After Sorting");
		for (String s3 : s)
			System.out.println(s3);
	}

}

class Khans implements Comparator {

	@Override
	public int compare(Object obj1, Object obj2) {
		String s = obj1.toString();
		String s1 = obj2.toString();
		return s1.compareTo(s);
	}

}
