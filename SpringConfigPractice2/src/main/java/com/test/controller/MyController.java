package com.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.test.beans.Car;
import com.test.dao.CarDAOImpl;

@Controller
public class MyController {

	@Autowired
	CarDAOImpl carDAOImpl;

	@RequestMapping(value = "/", method = RequestMethod.POST)
	ResponseEntity<Car> insert(@RequestBody Car car) {

		carDAOImpl.insert(car);

		return new ResponseEntity<Car>(car, HttpStatus.OK);

	}

	@RequestMapping(value = "/{carNumber}", method = RequestMethod.POST)
	ResponseEntity<Car> delete(@PathVariable("carNumber") String carNumber) {
		Car c = carDAOImpl.getCar(carNumber);
		if (c != null) {
			carDAOImpl.delete(carNumber);
			return new ResponseEntity<Car>(HttpStatus.OK);
		} else {
			return new ResponseEntity<Car>(HttpStatus.NOT_FOUND);
		}
	}
}
