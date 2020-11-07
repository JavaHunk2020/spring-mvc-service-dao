package com.rab3tech.dao.entity;

import java.sql.Timestamp;

public class SignupEntity {
	
	private int sid;
	private String username;
	private String password;
	private String email;
	private String role;
	private String gender;
	private String photo;
	private Timestamp doe;
	

	public Timestamp getDoe() {
		return doe;
	}

	public void setDoe(Timestamp doe) {
		this.doe = doe;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	@Override
	public String toString() {
		return "SignUp [sid=" + sid + ", username=" + username + ", password=" + password + ", email=" + email
				+ ", role=" + role + ", gender=" + gender + ", photo=" + photo + "]";
	}


}
