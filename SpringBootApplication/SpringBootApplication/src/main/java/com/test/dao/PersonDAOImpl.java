package com.test.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.test.beans.Person;

@Repository
public class PersonDAOImpl implements PersonDAO {

	Map<String, Person> personMap = new HashMap<String, Person>();

	public Person getPerson(String id) {
		return personMap.get(id);
	}

	public List<Person> getAllPersions() {

		List<Person> al = new ArrayList<Person>();

		for (Map.Entry<String, Person> entry : personMap.entrySet()) {
			Person p = entry.getValue();
			al.add(p);
		}

		return al;
	}

	public void deletePerson(String id) {
		personMap.remove(id);

	}

	public void savePerson(Person person) {
		personMap.put(person.getPersonID(), person);

	}

}
