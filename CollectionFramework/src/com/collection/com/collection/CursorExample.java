package com.collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class CursorExample
{
	public static void main(String[] args) 
	{
		Vector v=new Vector();
		Enumeration e=v.elements();
		Iterator itr=v.iterator();
		ListIterator l=v.listIterator();
		System.out.println(e.getClass().getName());
		System.out.println(itr.getClass().getName());
		System.out.println(l.getClass().getName());
	}
}
