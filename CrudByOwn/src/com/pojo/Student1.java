package com.pojo;

public class Student1 {
	private int id;
	private String name;
	private String phone;
	private String address;
	public Student1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student1(int id, String name, String phone, String address) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.address = address;
	}
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
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student1 [id=" + id + ", name=" + name + ", phone=" + phone + ", address=" + address + "]";
	}
	
}
