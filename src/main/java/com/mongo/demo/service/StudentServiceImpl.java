package com.mongo.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mongo.demo.model.Student;
import com.mongo.demo.repo.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentRepository repository;
	
	@Override
	public Student addStudent(Student student) {
		// TODO Auto-generated method stub
		
		Student savestudent = repository.save(student);
		return savestudent;
	}

	@Override
	public List<Student> getStudents() {
		// TODO Auto-generated method stub
		
		return repository.findAll();
	}

	@Override
	public long deleteStudent(long id) {
		// TODO Auto-generated method stub
		 repository.deleteById(id);
		 return id;
	}

	
	
}
