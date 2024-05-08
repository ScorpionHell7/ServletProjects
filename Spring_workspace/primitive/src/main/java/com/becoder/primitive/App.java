package com.becoder.primitive;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("com/becoder/primitive/config.xml");
    	Student s1 = context.getBean("st1", Student.class);
    	System.out.println(s1);
    	Student s2 = context.getBean("st2", Student.class);
    	System.out.println(s2);
    	Student s3 = context.getBean("st3", Student.class);
    	System.out.println(s3);
    }
}
