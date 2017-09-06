package com.test.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.controller.Staff;
import com.test.controller.Student;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("Bean11.xml");
		Student s = (Student) context.getBean("student");
		Staff st = s.getStaff();
		st.setName("Manoj");
		st.setAge("33");
		System.out.println(s.getStaff());
	}

}
