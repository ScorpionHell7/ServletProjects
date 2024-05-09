package com.becoder.SpringAutowire.annot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {
//	@Autowired
//	@Qualifier("add1")
	private Address address;
//	@Autowired
//	public Student(Address address) {
//		super();
//		this.address = address;
////		System.out.println("Constructor injector");
//	}

	public Address getAddress() {
		return address;
	}
	@Autowired
	@Qualifier("add1")
	public void setAddress(Address address) {
//		System.out.println("Address setter injection");
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [address=" + address + "]";
	}

	
	
	

}
