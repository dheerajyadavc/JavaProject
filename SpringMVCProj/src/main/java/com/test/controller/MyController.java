package com.test.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.test.beans.Student;

@Controller
public class MyController {

	Map<String, Student> stdmap = new HashMap<String, Student>();

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<Student> getStudent(@PathVariable("id") String stdID) {
		System.out.println("getStudent called...");
		Student std = stdmap.get(stdID);
		if (std != null) {
			return new ResponseEntity<Student>(std, HttpStatus.OK);
		} else {
			return new ResponseEntity<Student>(HttpStatus.NOT_FOUND);
		}
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Student> delete(@PathVariable("id") String stdID) {
		System.out.println("delete called...");
		try {
			Student std = stdmap.get(stdID);
			if (std != null) {
				stdmap.remove(stdID);
				return new ResponseEntity<Student>(HttpStatus.OK);
			} else {
				return new ResponseEntity<Student>(HttpStatus.NOT_FOUND);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new ResponseEntity<Student>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@RequestMapping (method = RequestMethod.GET)
	public ResponseEntity<List<Student>> getStudents() {
		System.out.println("getStudents called...");
		List<Student> al = new ArrayList<Student>();
	   Set<Map.Entry<String,Student>>	entryset = stdmap.entrySet();
	   for(Map.Entry<String, Student> entry : entryset)
	   {
		   Student value = entry.getValue();
		   al.add(value);
	   }
		return new ResponseEntity<List<Student>>(al, HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Student> save(@RequestBody Student std) {
		System.out.println("save called...");
		System.out.println(std);
		stdmap.put(std.getId(), std);
		return new ResponseEntity<Student>(std, HttpStatus.CREATED);
	}

	@RequestMapping(value = "/{id}/{name}/{city}", method = RequestMethod.POST)
	public ResponseEntity<Student> saveStd(@PathVariable("id") String stdID, @PathVariable("name") String stdName,
			@PathVariable("city") String stdCity) {
		System.out.println("savestd called...");
		Student s = new Student(stdID, stdName, stdCity);
		stdmap.put(stdID, s);
		return new ResponseEntity<Student>(s, HttpStatus.CREATED);
	}
	
	
	
	@RequestMapping(value = "/dummy", method = RequestMethod.GET)
	public ResponseEntity<Student> dummy() {
		System.out.println("dummy called...");
		Student s = new Student("100", "abc", "alph");
		return new ResponseEntity<Student>(s, HttpStatus.OK);
	}

}
