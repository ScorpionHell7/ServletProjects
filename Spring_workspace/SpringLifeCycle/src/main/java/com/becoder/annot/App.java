package com.becoder.annot;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/becoder/annot/config.xml");
    	context.registerShutdownHook();
    	Student s1 = context.getBean("st1",com.becoder.annot.Student.class);
    	System.out.println(s1);
	}

}
