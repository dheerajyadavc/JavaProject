package com.test.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class Manager {

	@Autowired
	@Qualifier("carName")
	CarName carName;

//	public Manager(CarName carName) {
//
//		super();
//
//		this.carName = carName;
//		System.out.println("i am constructor");
//	}

	public CarName getCarName() {
		return carName;
	}

	public void setCarName(CarName carName) {
		System.out.println("i am setter");
		this.carName = carName;
	}

	@Override
	public String toString() {
		return "Manager [carName=" + carName + "]";
	}

}
