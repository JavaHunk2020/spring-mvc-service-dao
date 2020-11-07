package com.rab3tech.service;

import java.util.List;

import com.rab3tech.controller.SignUp;

public interface SignupService {

	void delete(String sid);

	List<SignUp> findAll();

	void save(SignUp signUp);

	List<SignUp> authUser(String username, String password);
	
}
