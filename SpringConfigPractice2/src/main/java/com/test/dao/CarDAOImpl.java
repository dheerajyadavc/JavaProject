package com.test.dao;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.test.beans.Car;

@Repository
public class CarDAOImpl implements CarDAO {

	private JdbcTemplate jdbcTemplate;

	@Autowired
	DataSource dataSource;

	public CarDAOImpl() {
		super();

	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public void insert(Car car) {

		String sql = "insert into mydb.Car(carName,carNumber,carModel,carYear) values(?,?,?,?)";
		jdbcTemplate = new JdbcTemplate(dataSource);
		jdbcTemplate.update(sql, car.getCarName(), car.getCarNumber(), car.getCarModel(), car.getCarYear());

	}

	public void delete(String carNumber) {
		String sql="delete from mydb.Car where carNumber=?";
		jdbcTemplate = new JdbcTemplate(dataSource);
		jdbcTemplate.update(sql, carNumber);
	}

	public List<Car> getAll() {
//		List<Car> list = new ArrayList<Car>();
//		String sql="";
//		jdbcTemplate.ge
		return null;
	}

	public Car getCar(String carNumber) {
		return null;
	}

}
