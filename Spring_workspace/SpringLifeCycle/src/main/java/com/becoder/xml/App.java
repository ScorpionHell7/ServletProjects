package com.becoder.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("com/becoder/SpringLifeCycle/config.xml");
    	((AbstractApplicationContext) context).registerShutdownHook();
    	Student s1 = context.getBean("st1",com.becoder.xml.Student.class);
    	System.out.println(s1);
    }
}
