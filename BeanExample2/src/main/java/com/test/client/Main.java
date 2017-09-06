package com.test.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.controller.Calling;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("Bean2.xml");
		Calling cobj = (Calling) context.getBean("Hit");
		cobj.telephone();
	}

}
