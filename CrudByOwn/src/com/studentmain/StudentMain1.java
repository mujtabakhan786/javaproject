package com.studentmain;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

import com.pojo.Student1;

public class StudentMain1 {
	public static void main(String[] args) {
		Student1 s=new Student1();
		s.setId(1);
		s.setName("Khan");
		s.setPhone("8850258731");
		s.setAddress("Mumbai");
		
		List<Student1> list=new ArrayList<Student1>();
		list.add(s);
//		System.out.println(list);
//		ListIterator itr=list.listIterator();
//		while(itr.hasNext())
//		{
//			System.out.println(itr.next());
//		}
		for(Student1 s1: list)
		{
			System.out.println(s1);
		}
	}
}
