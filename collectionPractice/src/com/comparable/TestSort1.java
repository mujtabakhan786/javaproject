package com.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class TestSort1 {
	public static void main(String[] args) {
		Student student = new Student(789, "Bantai", 25);
		Student student1 = new Student(787, "Aiba", 28);
		Student student2 = new Student(788, "Bommai", 26);
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(student);
		list.add(student1);
		list.add(student2);
		Collections.sort(list);
//		System.out.println(student.toString());
		for (Student s : list) {
			System.out.println(s.rollno + " " + s.name + " " + s.age);
		}
	}
}
