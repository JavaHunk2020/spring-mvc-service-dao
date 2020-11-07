package com.rab3tech.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rab3tech.controller.SignUp;
import com.rab3tech.dao.SignupDao;
import com.rab3tech.dao.entity.SignupEntity;

/**
 * 
 * @author javahunk
 * 
 * Service layer is acting as mediator between controller
 * and dao layer so all the conversion of data take place here
 *
 */
@Service
public class SignupServiceImpl implements SignupService {

	@Autowired
	private SignupDao signupDao;

	@Override
	public void delete(String sid) {
		signupDao.delete(sid);
	}

	@Override
	public List<SignUp> findAll() {
		List<SignupEntity>  signUps=signupDao.findAll();
		/*//below code is converting List<SignupEntity> into List<SignUp>
		List<SignUp> list=new ArrayList<SignUp>();
		for(SignupEntity entity:signUps){
			SignUp signUp=new SignUp();
			BeanUtils.copyProperties(entity, signUp);
			list.add(signUp);
		}*/
		return convertList(signUps);
	}
	
	private List<SignUp> convertList(List<SignupEntity>  signUps){
		List<SignUp> list=new ArrayList<SignUp>();
		for(SignupEntity entity:signUps){
			SignUp signUp=new SignUp();
			BeanUtils.copyProperties(entity, signUp);
			list.add(signUp);
		}
		return list;
	}

	@Override
	public void save(SignUp signUp) {
		SignupEntity entity=new SignupEntity();
		BeanUtils.copyProperties(signUp, entity);
		signupDao.save(entity);
	}

	@Override
	public List<SignUp> authUser(String username, String password) {
		List<SignupEntity>  signUps=signupDao.authUser(username,password);
		return convertList(signUps);
		/*List<SignUp> list=new ArrayList<SignUp>();
		for(SignupEntity entity:signUps){
			SignUp signUp=new SignUp();
			BeanUtils.copyProperties(entity, signUp);
			list.add(signUp);
		}
		return list;*/
	}
	
	
	
}
