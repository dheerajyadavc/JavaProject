package com.test.beans;

public class Person {

	String personID;
	String personName;
	String personCity;

	public String getPersonID() {
		return personID;
	}

	public void setPersonID(String personID) {
		this.personID = personID;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public String getPersonCity() {
		return personCity;
	}

	public void setPersonCity(String personCity) {
		this.personCity = personCity;
	}

	public Person(String personID, String personName, String personCity) {
		super();
		this.personID = personID;
		this.personName = personName;
		this.personCity = personCity;
	}

	public Person() {

	}

	@Override
	public String toString() {
		return "Person [personID=" + personID + ", personName=" + personName + ", personCity=" + personCity + "]";
	}

}
