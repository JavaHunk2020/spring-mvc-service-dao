package com.rab3tech.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

//@Configuration says , create bean using bean annotation
@Configuration
public class DataConfig {
	
	
	//This is representing connection
	@Bean("pkdataSource")
	public DataSource create09213u834978Data(){
		DriverManagerDataSource dataSource=new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/rab3tech_db");
		dataSource.setUsername("root");
		dataSource.setPassword("mysql@1234");
		return dataSource;
	}

}
