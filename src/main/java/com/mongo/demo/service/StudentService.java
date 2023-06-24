package com.mongo.demo.service;

import java.util.List;

import com.mongo.demo.model.Student;

public interface StudentService {

	public Student addStudent(Student student);
	
	public List<Student> getStudents();
	
	public long deleteStudent(long id);
}
