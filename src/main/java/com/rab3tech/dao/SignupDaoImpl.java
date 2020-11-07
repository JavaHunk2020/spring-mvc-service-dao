package com.rab3tech.dao;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.rab3tech.dao.entity.SignupEntity;

@Repository
public class SignupDaoImpl implements SignupDao {
	
	@Autowired
	private DataSource dataSource;
	
	@Override
	public List<SignupEntity> authUser(String username,String password){
		JdbcTemplate jdbcTemplate=new JdbcTemplate(dataSource);
		String sql="select sid,username,password,email,gender,role,photo,doe from signup_tbl where username=? and password=?";
		List<SignupEntity> signUps=jdbcTemplate.query(sql,new Object[]{username,password},new BeanPropertyRowMapper(SignupEntity.class));
		return signUps;
			
	}
	
	@Override
	public void save(SignupEntity signUp) {
		// Date must come from java.util package
		Timestamp timestamp = new Timestamp(new Date().getTime());
		// Below is spring jdbc programming
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		String sql = "insert into signup_tbl(username,password,email,gender,role,photo,doe) values(?,?,?,?,?,?,?)";
		Object[] data = { signUp.getUsername(), signUp.getPassword(), signUp.getEmail(), signUp.getGender(), signUp.getRole(), signUp.getPhoto(), timestamp };
		jdbcTemplate.update(sql, data);
	}
	
	@Override
	public void delete(String sid){
		//Below code will delete the record as sid passed from html page
		//Below is spring jdbc programming
		JdbcTemplate jdbcTemplate=new JdbcTemplate(dataSource);
		String sql="delete from signup_tbl where sid="+sid;
		jdbcTemplate.update(sql);
	}
	
	@Override
	public List<SignupEntity> findAll(){
		//Below is spring jdbc programming
		JdbcTemplate jdbcTemplate=new JdbcTemplate(dataSource);
		String sql="select sid,username,password,email,gender,role,photo,doe from signup_tbl";
		List<SignupEntity> signUps=jdbcTemplate.query(sql,new BeanPropertyRowMapper(SignupEntity.class));
		return signUps;// 
	}

}
