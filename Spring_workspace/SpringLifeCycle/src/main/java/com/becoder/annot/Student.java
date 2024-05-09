package com.becoder.annot;

import javax.annotation.*;

public class Student {
	private int id;
	private String name;
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
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
	@PostConstruct
	public void init() {
		System.out.println("Initialization");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Destruction");
	}
	
	

}
