package com.test.subject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.dao.TerminalDAO;
import com.test.util.Terminal;

public class MainClass {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("Interface.xml");

		TerminalDAO dao = (TerminalDAO) context.getBean("dao");
		Terminal terminal = new Terminal("Rajiv", 123);
		dao.insert(terminal);

		// Terminal terminal1= dao.findByCustomerNumber(123);
		// System.out.println(terminal1);

	}

}
