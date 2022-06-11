package com.comparable;

public class Student implements Comparable<Student> {
	int rollno;
	String name;
	int age;

	public Student(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}

	public int compareTo(Student st) {
		if (rollno == st.rollno)
			return 0;
		else if (rollno < st.rollno) {
			return 1;
		} else {
			return -1;
		}
//	return	name.compareTo(st.name);
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", age=" + age + "]";
	}

}
