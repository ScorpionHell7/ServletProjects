package com.becoder.SpringAutowire.Sterotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/becoder/SpringAutowire/Sterotype/config.xml");
		Employee e1 = (Employee) context.getBean("emp");
		System.out.println(e1.hashCode());
		Employee e2 = (Employee) context.getBean("emp");
		System.out.println(e2.hashCode());
	}

}
