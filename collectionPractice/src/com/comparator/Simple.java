package com.comparator;

import java.util.ArrayList;
import java.util.Collections;

public class Simple {
	public static void main(String[] args) {
		Student student = new Student(10, "Bantai", 25);
		Student student1 = new Student(12, "Aiba", 28);
		Student student2 = new Student(11, "Bommai", 26);
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(student);
		al.add(student1);
		al.add(student2);
		System.out.println("Sorting by rollno");
		Collections.sort(al, new RollNoComparator());
		for (Student s2 : al) {
			System.out.println(s2.rollno + " " + s2.name + " " + s2.age);
		}
		System.out.println("Sorting by Name");
		Collections.sort(al, new NameComparator());
		for (Student s : al) {
			System.out.println(s.rollno + " " + s.name + " " + s.age);
		}

		System.out.println("Sorting by age");
		Collections.sort(al, new AgeComparator());
		for (Student s1 : al) {
			System.out.println(s1.rollno + " " + s1.name + " " + s1.age);
		}
	}
}
