package com.test.util;

import org.springframework.stereotype.Component;

@Component
public class CarName {

	String car;
	String model;
	String year;
	public String getCar() {
		return car;
	}
	public void setCar(String car) {
		this.car = car;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return "CarName [car=" + car + ", model=" + model + ", year=" + year + "]";
	}

	
}
