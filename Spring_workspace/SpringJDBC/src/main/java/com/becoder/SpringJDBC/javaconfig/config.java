package com.becoder.SpringJDBC.javaconfig;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.becoder.SpringJDBC.dao.StudentImpl;

@Configuration
@ComponentScan(basePackages = "com.becoder.SpringJDBC.dao")
public class config {
	@Bean
	public DataSource getDatasource() {
		DriverManagerDataSource datasource = new DriverManagerDataSource();
		datasource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		datasource.setUrl("jdbc:mysql://localhost:3306/spring_jdbc");
		datasource.setUsername("root");
		datasource.setPassword("password");
		return datasource;
	}
	@Bean("jdbc")
	public JdbcTemplate getJDBCTemplate() {
		JdbcTemplate jd = new JdbcTemplate();
		jd.setDataSource(getDatasource());
		return jd;
	}
//	@Bean("stDao")
//	public StudentImpl getStudentImpl() {
//		StudentImpl dao = new StudentImpl();
//		dao.setJdbctemplate(getJDBCTemplate());
//		return dao;
//	}
	
}
