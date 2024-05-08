package com.becoder.FirstSpringApp;

public class Ram implements Action{
	
	public Ram() {
		System.out.println("Ram's constructor");
	}

	@Override
	public void Eat() {
		// TODO Auto-generated method stub
		System.out.println("Ram is eating");
	}

	@Override
	public void Sleep() {
		// TODO Auto-generated method stub
		System.out.println("Ram is sleeping");
	}

}
