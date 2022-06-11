package com.ArrayExample;

import java.util.Arrays;
import java.util.Comparator;

public class ArraySortExample1 {

	public static void main(String[] args) {
		int[] a = { 10, 5, 20, 11, 6 };
		Arrays.sort(a);
		System.out.println(Arrays.binarySearch(a, 5));
		System.out.println(Arrays.binarySearch(a, 21));
		
		String[] s= {"C","D","I"};
		Arrays.sort(s);
		System.out.println(Arrays.binarySearch(s, "I"));
		System.out.println(Arrays.binarySearch(s, "A"));
		
		Arrays.sort(s);
		System.out.println(Arrays.binarySearch(s, "D", new Mujtaba1()));
		System.out.println(Arrays.binarySearch(s, "J", new Mujtaba1()));
	}

}
class Mujtaba1 implements Comparator
{	
	public int compare(Object o1, Object o2) {
		String s=o1.toString();
		String s1=o2.toString();
		return s1.compareTo(s);
	}
}	
