package com.test.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Customer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("Bean12.xml");
		Manager man = (Manager) context.getBean("manager");
//		CarName man=(CarName)context.getBean("carName");
	

		System.out.println(man.toString());

	}

}
