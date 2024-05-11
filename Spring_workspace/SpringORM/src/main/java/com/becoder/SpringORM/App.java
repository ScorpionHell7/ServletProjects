package com.becoder.SpringORM;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate5.HibernateTemplate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("com/becoder/SpringORM/config.xml");
    	HibernateTemplate temp  = (HibernateTemplate) context.getBean("Template",HibernateTemplate.class);
    	System.out.println(temp);
    }
}
