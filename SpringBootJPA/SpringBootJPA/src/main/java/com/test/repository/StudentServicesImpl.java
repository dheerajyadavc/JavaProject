package com.test.repository;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.test.bean.Student;

@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
@Service
public class StudentServicesImpl {
	
	 private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	StudentRepository studentRepository;

	@Transactional(propagation = Propagation.REQUIRED, readOnly = true, rollbackFor = RuntimeException.class)
	public Student save(Student student) throws RuntimeException{
		logger.info("save method called for StudentService ");
		Student s = studentRepository.save(student);
		logger.debug("data received from repo : "+s);
		if (student.getName().equals("tek")) {
			logger.info("error is going to be thrown. your transaction will be rolled backed... ");
			throw new RuntimeException("roll me back");
		}
		return s;
	}

	public List<Student> findAll() {
		return studentRepository.findAll();
	}

	public Student findByName(String name) {
		return studentRepository.findByName(name);
	}

	public Student findByNameAngMajors(String name, String majors) {
		return studentRepository.findByNameAndMajors(name, majors);
	}

}
