package com.becoder.SpringORM.dao;

import java.util.List;

import com.becoder.SpringORM.Student;

public interface Studentdao {
	public int saveStudent(Student st);
	public void deleteStudent(int id);
	public void updateStudent(Student st);
	public Student getStudentById(int id);
	public List<Student> getAllStudent();
}
