package com.test.dao;

import org.springframework.stereotype.Repository;

@Repository
public class Student {

	String Fname;
	String age;
	String year;

	@Override
	public String toString() {
		return "Student [Fname=" + Fname + ", age=" + age + ", year=" + year + "]";
	}

	public String getFname() {
		return Fname;
	}

	public void setFname(String fname) {
		Fname = fname;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}


}
