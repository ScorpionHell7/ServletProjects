package com.becoder.SpringORM.dao;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.becoder.SpringORM.Student;



public class StudentdaoImpl implements Studentdao{
	HibernateTemplate hibernatetemplate;
	
	public HibernateTemplate getHibernatetemplate() {
		return hibernatetemplate;
	}

	public void setHibernatetemplate(HibernateTemplate hibernatetemplate) {
		this.hibernatetemplate = hibernatetemplate;
	}

	@Override
	@Transactional
	public int saveStudent(Student st) {
		int i = (int) hibernatetemplate.save(st);
		return i;
	}

	@Override
	@Transactional
	public void deleteStudent(int id) {
		Student st = hibernatetemplate.get(Student.class, id);
		hibernatetemplate.delete(st);
	}

	@Override
	@Transactional
	public void updateStudent(Student st) {
		hibernatetemplate.update(st);
	}

	@Override
	public Student getStudentById(int id) {
		Student st = hibernatetemplate.get(Student.class, id);
		return st;
	}

	@Override
	public List<Student> getAllStudent() {
		List<Student> list = hibernatetemplate.loadAll(Student.class);
		return list;
	}
	
}
