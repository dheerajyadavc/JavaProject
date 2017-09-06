package com.test.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.test.bean.Student;
import com.test.services.StudentServices;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/student")
@Api(value = "Student" , description="Student Records")
public class MyController {

	@Autowired
	StudentServices studentServices;

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@RequestMapping(value = "/saveStudent", method = RequestMethod.POST)
	@ApiOperation(value = "Save Student", response = Student.class)
	public Student saveStudent(@RequestBody Student student, UriComponentsBuilder ucBuilder) {

		logger.debug("/saveStudent");
		return studentServices.saveRec(student);

	}

	@RequestMapping(value = "/deleteStudent/{id}", method = RequestMethod.DELETE)
	@ApiOperation(value = "Delete Student")
	public ResponseEntity<Student> deleteStudent(@PathVariable("id") int id) {
		Student student = studentServices.findRec(id);
		if (student == null) {
			return new ResponseEntity<Student>(HttpStatus.NOT_FOUND);
		}else 

		 studentServices.deleteRec(id);
		return new ResponseEntity<Student>(HttpStatus.OK);
	}

	@RequestMapping(value = "/findStudent/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ApiOperation(value = "Find Student by ID")
	public ResponseEntity<Student> findStudent(@PathVariable("id") int id) {
		Student student = studentServices.findRec(id);
		if (student == null) {
			return new ResponseEntity<Student>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Student>(student, HttpStatus.OK);
	}
}
