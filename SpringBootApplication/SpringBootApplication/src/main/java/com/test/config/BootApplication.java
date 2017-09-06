package com.test.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.test")
public class BootApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(BootApplication.class, args);
	}

}
