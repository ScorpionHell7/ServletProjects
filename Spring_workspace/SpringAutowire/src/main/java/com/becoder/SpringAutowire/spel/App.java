package com.becoder.SpringAutowire.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/becoder/SpringAutowire/spel/config.xml");
		Employee e1 = context.getBean("employee",com.becoder.SpringAutowire.spel.Employee.class);
		System.out.println(e1.val9);
		
	}

}
