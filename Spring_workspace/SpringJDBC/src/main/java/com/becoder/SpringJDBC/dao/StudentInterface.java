package com.becoder.SpringJDBC.dao;

import java.util.List;

public interface StudentInterface {
	
	public int insertStudent(Student s);
	public Student getStudentById(int id);
	public List<Student> getAllStudent();
	public int updateStudent(Student s);
	public int deleteStudent(int id);

}
