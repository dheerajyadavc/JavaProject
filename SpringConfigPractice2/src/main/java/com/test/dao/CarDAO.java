package com.test.dao;

import java.util.List;

import com.test.beans.Car;

public interface CarDAO {

	public void insert(Car car);
	public void delete(String carNumber);
	public List<Car> getAll();
	public Car getCar(String carNumber);
}
