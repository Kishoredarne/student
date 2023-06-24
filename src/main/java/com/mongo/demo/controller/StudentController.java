package com.mongo.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.mongo.demo.model.Student;
import com.mongo.demo.service.StudentService;
import com.mongo.demo.service.StudentServiceImpl;

@RestController
@RequestMapping("/v1/api/student")

public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@PostMapping("/add")
	@ResponseStatus(HttpStatus.CREATED)
	public Student addStudent(@RequestBody Student student) {
		System.out.println(""+student.getAddress());
		return studentService.addStudent(student);
	}
	
	@GetMapping("/students")
	@ResponseStatus(HttpStatus.OK)
	public List<Student> getStudents() {
		
		return studentService.getStudents();
	}
	
	@DeleteMapping("/delete/{id}")
	@ResponseStatus(HttpStatus.OK)
	public long deleteStudent(@PathVariable long id ) {
		// TODO Auto-generated method stub
		
		return studentService.deleteStudent(id);
	}
}
