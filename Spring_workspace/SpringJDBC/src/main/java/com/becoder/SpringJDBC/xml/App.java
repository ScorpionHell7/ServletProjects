package com.becoder.SpringJDBC.xml;

import java.sql.SQLException;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.becoder.SpringJDBC.dao.Student;
import com.becoder.SpringJDBC.dao.StudentImpl;
import com.becoder.SpringJDBC.dao.StudentInterface;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws SQLException
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("com/becoder/SpringJDBC/xml/config.xml");
    	JdbcTemplate jb = context.getBean("jdbcTemplate",JdbcTemplate.class);
    	System.out.println(jb.getDataSource().getConnection());
    	
//    	String sql = "insert into student(id,name,address) values(?,?,?)";
//    	int i = jb.update(sql,1,"Tejas","Santacruz");
//    	System.out.println("success fully inserted "+i);
    	
    	StudentInterface dao = context.getBean("stDao",StudentInterface.class);
//    	Student st = new Student();
//    	st.setId(103);
//    	st.setName("Madara");
//    	st.setAddress("Konoha");
//    	int i = dao.insertStudent(st);
//    	System.out.println("Inserted "+i);
    	
//    	Student student = dao.getStudentById(101);
//    	System.out.println(student.getName());
    	
    	
//    	List<Student> stlist = dao.getAllStudent();
//    	for(Student st1:stlist) {
//    		System.out.println(st1.getName());
//    	}
    	
//    	int del =  dao.deleteStudent(1);
//    	System.out.println("Deleted "+del);
    	
    	Student st = new Student();
    	st.setId(103);
    	st.setName("Madara Uchiha");
    	st.setAddress("Akatsuki");

    	int up = dao.updateStudent(st);
    	System.out.println("Upadted "+up);
    }
}
