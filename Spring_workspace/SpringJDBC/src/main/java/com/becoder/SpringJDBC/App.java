package com.becoder.SpringJDBC;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws SQLException
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("com/becoder/SpringJDBC/config.xml");
    	JdbcTemplate jb = context.getBean("jdbcTemplate",JdbcTemplate.class);
    	System.out.println(jb.getDataSource().getConnection());
    	
    	String sql = "insert into student(id,name,address) values(?,?,?)";
    	int i = jb.update(sql,1,"Tejas","Santacruz");
    	System.out.println("success fully inserted "+i);
    }
}
