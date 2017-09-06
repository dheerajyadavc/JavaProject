package com.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.beans.Person;
import com.test.dao.PersonDAO;

@Service
public class PersonServiceImpl implements PersonService {

	@Autowired
	PersonDAO PersonDAO;

	public Person getPerson(String id) {
		return PersonDAO.getPerson(id);
	}

	public List<Person> getAllPersions() {
		// TODO Auto-generated method stub
		return PersonDAO.getAllPersions();
	}

	public void deletePerson(String id) {
		PersonDAO.deletePerson(id);

	}

	public void savePerson(Person person) {
		PersonDAO.savePerson(person);

	}

}
