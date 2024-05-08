package com.becoder.primitive;

public class Student {
	int id;
	String name;
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", Address=" + Address + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		System.out.println("setid called");
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("setname called");
		this.name = name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		System.out.println("setaddress called");
		Address = address;
	}
	String Address;
}
