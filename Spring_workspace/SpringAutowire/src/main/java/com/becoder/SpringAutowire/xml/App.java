package com.becoder.SpringAutowire.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.becoder.SpringAutowire.xml.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("com/becoder/SpringAutowire/xml/config.xml");
//    	context.registerShutdownHook();
    	Student s1 = context.getBean("st1",com.becoder.SpringAutowire.xml.Student.class);
//    	System.out.println(s1.getAddress().getCity());
    	System.out.println(s1);
    }
}
