package com.becoder.SpringAutowire.xml;

public class Address {
	
	private String city;
	private String state;
	
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		System.out.println("city setter injection");
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		System.out.println("state setter injection");
		this.state = state;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + "]";
	}
	
	

}
