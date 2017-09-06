package com.test.beans;

public class Car {
String carName;
String carNumber;
String carModel;
String carYear;
public Car() {
	super();
	// TODO Auto-generated constructor stub
}
public String getCarName() {
	return carName;
}
public void setCarName(String carName) {
	this.carName = carName;
}
public String getCarNumber() {
	return carNumber;
}
public void setCarNumber(String carNumber) {
	this.carNumber = carNumber;
}
public String getCarModel() {
	return carModel;
}
public void setCarModel(String carModel) {
	this.carModel = carModel;
}
public String getCarYear() {
	return carYear;
}
public void setCarYear(String carYear) {
	this.carYear = carYear;
}
public Car(String carName, String carNumber, String carModel, String carYear) {
	super();
	this.carName = carName;
	this.carNumber = carNumber;
	this.carModel = carModel;
	this.carYear = carYear;
}
}
