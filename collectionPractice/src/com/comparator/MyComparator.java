package com.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee {
	int id;
	String name;
	String city;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", city=" + city + "]";
	}

	public Employee(int id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
}

public class MyComparator {
	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(11, "abc", "a"));
		employees.add(new Employee(1, "def", "x"));
		employees.add(new Employee(41, "wes", "k"));
		employees.add(new Employee(151, "azs", "d"));
		employees.add(new Employee(7, "lya", "l"));
		System.out.println("Sorting by id");
		Collections.sort(employees, new Mujtaba());
		for (Employee s2 : employees) {
			System.out.println(s2);
		}
	}
}

class Mujtaba implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		String o1Name = o1.getName();
		String o2Name = o2.getName();
		return o2Name.compareTo(o1Name);
	}
}
