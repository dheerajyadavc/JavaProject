package com.test.repostiory;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.test.bean.Student;

@Repository
public interface StudentRepository extends MongoRepository<Student, Integer> {

}
