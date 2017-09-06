package com.test.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.bean.Student;
import com.test.repostiory.StudentRepository;

@Service
public class StudentServices {
	
	 private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	StudentRepository studentRepository;

	public Student saveRec(Student student) {
		logger.info("save method called for StudentService ");
		return studentRepository.save(student);

	}

	public Student findRec(int id) {
		return studentRepository.findOne(id);
	}

	public void deleteRec(int id) {
		studentRepository.delete(id);
	}

	public Student findByName(String name) {
		Student student = new Student();
		if (student.getFirstName().equalsIgnoreCase(name)) {
			return student;
		} else
			return null;
	}

	public boolean isUserExist(Student student) {
		return findByName(student.getFirstName()) != null;
	}
}
