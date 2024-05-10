package com.becoder.SpringAutowire.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.becoder.SpringAutowire.spel.Employee;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new AnnotationConfigApplicationContext(config.class);
		Emplyee e1 = context.getBean("getEmp",com.becoder.SpringAutowire.javaconfig.Emplyee.class);
		System.out.println(e1);
//		Address a1 = context.getBean("getAdd",com.becoder.SpringAutowire.javaconfig.Address.class);
//		System.out.println(a1);
	}

}
