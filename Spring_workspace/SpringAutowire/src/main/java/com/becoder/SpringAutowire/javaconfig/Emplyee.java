package com.becoder.SpringAutowire.javaconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Emplyee {
	@Autowired
	private Address address;
	
	
	
//	@Autowired
//	public Emplyee(Address address) {
//		super();
//		this.address = address;
//		System.out.println("Constructor called");
//	}

	public Address getAddress() {
		return address;
	}
	
//	@Autowired
	public void setAddress(Address address) {
		this.address = address;
		System.out.println("Setter called");
	}

	@Override
	public String toString() {
		return "Emplyee [address=" + address + "]";
	}
	
	
}
