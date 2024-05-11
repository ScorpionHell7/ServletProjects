package com.becoder.SpringJDBC.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.swing.tree.RowMapper;
import javax.swing.tree.TreePath;

import org.springframework.jdbc.core.*;
import org.springframework.jdbc.core.JdbcTemplate;

public class StudentImpl implements StudentInterface {
	private JdbcTemplate jdbctemplate;
	
	
	
	public JdbcTemplate getJdbctemplate() {
		return jdbctemplate;
	}

	public void setJdbctemplate(JdbcTemplate jdbctemplate) {
		this.jdbctemplate = jdbctemplate;
	}

	@Override
	public int insertStudent(Student s) {
		// TODO Auto-generated method stub
		String sql = "insert into Student(id,name,address) values(?,?,?)";
		
		
		int i = jdbctemplate.update(sql,s.getId(),s.getName(),s.getAddress());
		return i;
	}

	@Override
	public Student getStudentById(int id) {
		// TODO Auto-generated method stub
		String sql = "select * from Student where id = ?";
		
		org.springframework.jdbc.core.RowMapper rm = new org.springframework.jdbc.core.RowMapper() {

			@Override
			public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
				Student st = new Student();
				st.setId(rs.getInt(1));
				st.setName(rs.getString(2));
				st.setAddress(rs.getString(3));
				return st;
			}
		};
		
		Student student = (Student) jdbctemplate.queryForObject(sql,rm,id);
		return student;
	}

	@Override
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		String sql = "select * from Student";
		
		org.springframework.jdbc.core.RowMapper rm = new org.springframework.jdbc.core.RowMapper() {

			@Override
			public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
				Student st = new Student();
				st.setId(rs.getInt(1));
				st.setName(rs.getString(2));
				st.setAddress(rs.getString(3));
				return st;
			}
		};
		
		List<Student> list = (List<Student>) jdbctemplate.query(sql,rm);
		return list;
	}

	@Override
	public int updateStudent(Student s) {
		String sql = "update Student set name = ?,address=?  where id=?";
		int i = jdbctemplate.update(sql,s.getName(),s.getAddress(),s.getId());
		return i;
	}

	@Override
	public int deleteStudent(int id) {
		String sql = "delete from Student where id = ?";
		int i = jdbctemplate.update(sql,id);
		return i;
	}
	
}
