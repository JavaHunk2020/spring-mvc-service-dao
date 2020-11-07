package com.rab3tech.dao;

import java.util.List;

import com.rab3tech.dao.entity.SignupEntity;

public interface SignupDao {

	void delete(String sid);

	List<SignupEntity> findAll();

	void save(SignupEntity signUp);

	List<SignupEntity> authUser(String username, String password);

}
