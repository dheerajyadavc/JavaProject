package com.test.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class Autowiring {

	@Autowired
	Student student;
	

	public Student getStudent() {
		return student;
	}


	public void setStudent(Student student) {
		this.student = student;
	}


	@Override
	public String toString() {
		return "Autowiring [student=" + student + "]";
		
	
		
		
	}
	
}
