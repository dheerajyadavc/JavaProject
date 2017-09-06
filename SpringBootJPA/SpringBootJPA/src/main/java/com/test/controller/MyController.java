package com.test.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.test.bean.Student;
import com.test.repository.StudentServicesImpl;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value="/v1/tek")
@Api(value="TekGroupStudents", description="This service is for crud operation for Tekgroup")
public class MyController {

	@Autowired
	StudentServicesImpl studentServices;
	
	 private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@RequestMapping(value = "/saveRec", method = RequestMethod.POST)
	public void save(@RequestBody Student student) {
		logger.info("/saveRec end point called...");
		logger.debug("payload provided with /saveRec end point : " + student);
		try {
			studentServices.save(student);
		} catch (Exception e) {
			logger.error(" Exception occured while calling /saveRec endpoint : "+e.getMessage());
		}

	}

	@RequestMapping(value = "/getAll", method = RequestMethod.GET)
	@ApiOperation(value = "get all students inforamtion", response = List.class)
	public List<Student> findAll() {
		return studentServices.findAll();
	}

	@RequestMapping(value = "/find/{name}", method = RequestMethod.GET)
	public Student findByName(@PathVariable("name") String name) {
		return studentServices.findByName(name);
	}

	@RequestMapping(value = "/findBy/{name}/{majors}", method = RequestMethod.GET)
	public Student findByNameAngMajors(@PathVariable("name") String name, @PathVariable("majors") String majors) {
		return studentServices.findByNameAngMajors(name, majors);
	}

}
