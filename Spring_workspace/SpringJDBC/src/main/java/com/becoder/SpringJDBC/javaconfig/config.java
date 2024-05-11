package com.becoder.SpringJDBC.javaconfig;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
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
	
}
