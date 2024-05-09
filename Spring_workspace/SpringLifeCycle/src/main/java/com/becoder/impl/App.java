package com.becoder.impl;

import com.becoder.impl.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.becoder.xml.Student;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/becoder/impl/config.xml");
    	context.registerShutdownHook();
    	com.becoder.impl.Student s1 = context.getBean("st1",com.becoder.impl.Student.class);
    	System.out.println(s1);
	}

}
