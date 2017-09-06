package com.test.dao;

public class User {

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	String name;
	String education;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	public User(String name, String education) {
		super();
		this.name = name;
		this.education = education;
	}
}
