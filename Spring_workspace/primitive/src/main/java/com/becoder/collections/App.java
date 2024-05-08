package com.becoder.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/becoder/collections/config.xml");
		Student s1 = context.getBean("st1",com.becoder.collections.Student.class);
		System.out.println(s1);
	}

}
