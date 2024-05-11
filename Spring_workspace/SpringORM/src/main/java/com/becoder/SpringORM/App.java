package com.becoder.SpringORM;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate5.HibernateTemplate;

import com.becoder.SpringORM.dao.Studentdao;
import com.becoder.SpringORM.dao.StudentdaoImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("com/becoder/SpringORM/config.xml");
    	HibernateTemplate temp  = (HibernateTemplate) context.getBean("Template",org.springframework.orm.hibernate5.HibernateTemplate.class);
    	System.out.println(temp);
    	
    	Studentdao st = context.getBean("daost",com.becoder.SpringORM.dao.Studentdao.class);
    	Student stud = new Student();
    	stud.setId(2);
    	stud.setName("Amruta");
    	stud.setAddress("Santacruz");
//    	st.saveStudent(stud);
    	
//    	st.updateStudent(stud);
    	
    	st.deleteStudent(2);
    	
    	List<Student> list = st.getAllStudent();
    	for(Student sts : list) {
    		System.out.println(sts);
    	}
//    	Student student = st.getStudentById(2);
//    	System.out.println(student);
    	
    }
}
