package com.becoder.FirstSpringApp;

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
//        Action r = new Shyam();
//        r.Eat();
//        r.Sleep();
        
        ApplicationContext context = new ClassPathXmlApplicationContext("com/becoder/FirstSpringApp/config.xml");
        System.out.println(context);
        
//        Ram r =context.getBean("ram", Ram.class);
//        r.Eat();
//        r.Sleep();
        
        Shyam r =context.getBean("shyam", Shyam.class);
        r.Eat();
        r.Sleep();
    }
}
