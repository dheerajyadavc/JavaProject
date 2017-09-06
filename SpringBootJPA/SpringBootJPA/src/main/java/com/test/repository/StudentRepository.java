package com.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.bean.Student;


//public interface StudentRepository extends MongoRepository<Student, Integer> {
public interface StudentRepository extends JpaRepository<Student, Integer> {

	Student findByName(String name);
	Student findByNameAndMajors(String name, String majors);
}