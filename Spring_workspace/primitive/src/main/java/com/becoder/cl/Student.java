package com.becoder.cl;

import java.util.List;

public class Student {
	private int id;
	private String name;
	private String place;
	private List<String> courses;
	private Address address;
	
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", courses=" + courses + ", address=" + address + "]";
	}
	
	
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		System.out.println("Integer, String constructor called");
	}
	
	
	public Student(String name, int id) {
		super();
		this.id = id;
		this.name = name;
		System.out.println("String, Integer constructor called");
	}
	
	public Student(String name, String place) {
		super();
		this.place = place;
		this.name = name;
		System.out.println("String, String constructor called");
	}


	public Student(int id, String name,String place, List<String> courses, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.place = place;
		this.courses = courses;
		this.address = address;
	}
	
	

}
