package com.becoder.SpringJDBC.javaconfig;

import java.sql.SQLException;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.becoder.SpringJDBC.dao.Student;
import com.becoder.SpringJDBC.dao.StudentImpl;

public class App {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		ApplicationContext context = new AnnotationConfigApplicationContext(config.class);
		JdbcTemplate jd = context.getBean("jdbc",JdbcTemplate.class);
		System.out.println(jd.getDataSource().getConnection());
		
//		String sql = "insert into student(id,name,address) values(?,?,?)";
//		int i = jd.update(sql,2,"Amruta","Mulund");
//		System.out.println("Successful entry "+i);
		
		StudentImpl dao = context.getBean("stDao",com.becoder.SpringJDBC.dao.StudentImpl.class);
//		Student st = new Student();
//    	st.setId(107);
//    	st.setName("Obito");
//    	st.setAddress("Konoha");
//    	int i = dao.insertStudent(st);
//    	System.out.println("Inserted "+i);
    	
//    	Student student = dao.getStudentById(107);
//    	System.out.println(student.getName());

    	List<Student> stlist = dao.getAllStudent();
    	for(Student st1:stlist) {
    		System.out.println(st1.getName());
    	}
//    	
//    	int del =  dao.deleteStudent(2);
//    	System.out.println("Deleted "+del);

    	Student st = new Student();
    	st.setId(107);
    	st.setName("Obito Uchiha (Next Hokage)");
    	st.setAddress("Akatsuki");

    	int up = dao.updateStudent(st);
    	System.out.println("Upadted "+up);

		
	}

}
