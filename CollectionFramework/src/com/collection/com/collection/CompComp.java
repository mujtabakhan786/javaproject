package com.collection;

import java.util.Comparator;
import java.util.TreeSet;

class Employee implements Comparable<Employee> {
	String name;
	int id;

	@Override
	public String toString() {
		return "Employee [name=" +  ", id=" + id + "]";
	}

	public Employee(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public int compareTo(Employee obj) {
		int id2 = obj.id;
		if (this.id < id2) {
			return -1;
		} else if (this.id > id2) {
			return 1;
		} else {
			return 0;
		}
	}
}

public class CompComp {

	public static void main(String[] args) {
		Employee e1 = new Employee("Mujtaba", 100);
		Employee e2 = new Employee("Murtaza", 500);
		Employee e3 = new Employee("Faisal", 700);
		Employee e4 = new Employee("Sohail", 200);
		Employee e5 = new Employee("Aman", 300);
		TreeSet t = new TreeSet();
		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(e4);
		t.add(e5);
		System.out.println(t);
		TreeSet t1=new TreeSet(new MyComparator5());
		t1.add(e1);
		t1.add(e2);
		t1.add(e3);
		t1.add(e4);
		t1.add(e5);
		System.out.println(t1);
	}

}
class MyComparator5 implements Comparator
{
	@Override
	public int compare(Object obj1, Object obj2) {
	Employee e1=(Employee)obj1;	
	Employee e2=(Employee)obj2;
	String s1=e1.name;
	String s2=e2.name;
	return s1.compareTo(s2);
	}
}

