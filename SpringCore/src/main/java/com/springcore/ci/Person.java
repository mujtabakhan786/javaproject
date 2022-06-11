package com.springcore.ci;

import java.util.List;

public class Person {
	private String name;
	private String personId;
	private Certi certi;
	private List<String> list;
	public Person(String name, String personId, Certi certi, List<String> list) {
		this.name = name;
		this.personId = personId;
		this.certi=certi;
		this.list=list;
	}
	@Override
	public String toString() {
		return this.name + " : " + this.personId + "{" + this.certi.name +"}" + this.list; 
	}
	
}
