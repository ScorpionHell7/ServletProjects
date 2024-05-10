package com.becoder.SpringAutowire.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = "com.becoder.SpringAutowire.javaconfig")
public class config {
	@Bean
	public Emplyee getEmp() {
		return new Emplyee();
	}
	@Bean
	@Primary
	public Address getAdd() {
//		System.out.println("1");
		return new Address("Mumbai");
	}
	@Bean
//	@Primary
	public Address getAdd1() {
//		System.out.println("2");
		return new Address("Pune");
	}
	
}
