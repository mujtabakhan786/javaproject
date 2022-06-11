package com.springcore.javaconfig;



public class Student {
	
	private Cricket cricket;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Student(Cricket cricket) {
		super();
		this.cricket = cricket;
	}

	public Cricket getCricket() {
		return cricket;
	}

	public void setCricket(Cricket cricket) {
		this.cricket = cricket;
	}


	public void study() {
		this.cricket.display();
		System.out.println("student is reading book");
	}
}
