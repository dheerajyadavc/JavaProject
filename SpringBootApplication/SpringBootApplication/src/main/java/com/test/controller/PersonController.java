package com.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.test.beans.Person;
import com.test.service.PersonService;

@Controller
public class PersonController {

	@Autowired
	PersonService personService;

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<Person> get(@PathVariable("id") String personId) {
		Person p = personService.getPerson(personId);
		return new ResponseEntity<Person>(p, HttpStatus.OK);

	}

	@RequestMapping(value = "/name/{name}", method = RequestMethod.GET)
	public ResponseEntity<Person> getByName(@PathVariable("name") String personName) {
		return new ResponseEntity<Person>(HttpStatus.NO_CONTENT);
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public @ResponseBody List<Person> getAll() {
		return personService.getAllPersions();
	}

	@RequestMapping(value = "/", method = RequestMethod.POST)
	public ResponseEntity<Person> save(@RequestBody Person person) {
		personService.savePerson(person);
		return new ResponseEntity<Person>(HttpStatus.CREATED);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Person> delete(@PathVariable("id") String personId) {

		Person p = personService.getPerson(personId);
		if (p != null) {
			personService.deletePerson(personId);
			return new ResponseEntity<Person>(HttpStatus.OK);
		} else {
			return new ResponseEntity<Person>(HttpStatus.NOT_FOUND);
		}

	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public @ResponseBody Person update(@RequestBody Person person) {
		return null;
	}

	@RequestMapping(value = "/dummy", method = RequestMethod.GET)
	public ResponseEntity<Person> getDummy() {
		System.out.println("dummy called..");
		Person p = new Person();
		p.setPersonID("100");
		p.setPersonName("tek");
		p.setPersonCity("duluth");
		return new ResponseEntity<Person>(p, HttpStatus.OK);
	}

}
