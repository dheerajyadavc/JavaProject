package com.test.service;

import java.util.List;

import com.test.beans.Person;

public interface PersonService {
	public Person getPerson(String id);

	public List<Person> getAllPersions();

	public void deletePerson(String id);

	public void savePerson(Person person);
}
