package com.becoder.refs;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/becoder/refs/config.xml");
		Address a1 = context.getBean("ad",com.becoder.refs.Address.class);
		Student s1 = context.getBean("st1",com.becoder.refs.Student.class);
		System.out.println(s1.getAddress().getCity());
		Address a2 = context.getBean("ad2",com.becoder.refs.Address.class);
		Student s2 = context.getBean("st2",com.becoder.refs.Student.class);
		System.out.println(s2.getAddress().getCity());
	}

}
