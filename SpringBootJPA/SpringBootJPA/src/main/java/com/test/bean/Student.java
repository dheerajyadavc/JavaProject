package com.test.bean;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import io.swagger.annotations.ApiModelProperty;

//@Document
@Entity
public class Student{

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@ApiModelProperty(notes = "The database generated student ID")
	private int id;
	
	@ApiModelProperty(notes = "Tek group studnt name ", required = true)
	private String name;
	private String majors;
	private String college;

	public Student() {
		super();
	}

	public Student(int id, String name, String majors, String college) {
		super();
		this.id = id;
		this.name = name;
		this.majors = majors;
		this.college = college;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMajors() {
		return majors;
	}

	public void setMajors(String majors) {
		this.majors = majors;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

//	@Override
//	public String toString() {
//		return "Student [id=" + id + ", name=" + name + ", majors=" + majors + ", college=" + college + "]";
//	}

}
