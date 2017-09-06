package com.test.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.dao.Autowiring;
import com.test.dao.Student;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext con = new ClassPathXmlApplicationContext("Bean10.xml");
		Autowiring auto = (Autowiring)con.getBean("autowiring");
//		Student stu= (Student)con.getBean("student");
		Student stu = auto.getStudent();
		stu.setFname("Pranav");
		stu.setAge("12");
		stu.setYear("1673");
		
		
		System.out.println(auto.getStudent());
		
	}

}
