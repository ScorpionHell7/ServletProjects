package com.becoder.FirstSpringApp;

public class Shyam implements Action{
	
	public Shyam() {
		System.out.println("Shyam's constructor");
	}
	@Override
	public void Eat() {
		// TODO Auto-generated method stub
		System.out.println("shyam is eating");
	}

	@Override
	public void Sleep() {
		// TODO Auto-generated method stub
		System.out.println("shyam is sleeping");
	}

}
