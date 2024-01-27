package com.atdev.studentcrud.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.atdev.studentcrud.Repositary.StudentRepositary;
import com.atdev.studentcrud.model.Student;

@RestController
public class StudentController {
	
	@Autowired
	StudentRepositary studentRepositary;
	
	@PostMapping("/student")
	public  void insertStudent(@RequestBody Student student) {
		
		studentRepositary.save(student);
		
	
	}
	
	@DeleteMapping("/student")
	public  void deleteByID(@RequestParam int id) {
		
		studentRepositary.deleteById(id);
	}
	
	@GetMapping("/student")
	public  Student selectStudentByID(@RequestParam int id) {
		
		Optional<Student> student = studentRepositary.findById(id);
		
		if(student.isPresent()) {
			return student.get();
		}
		else {
			return null;
		}
	}
	
	@PutMapping("/student")
	public  void updateStudent(@RequestBody Student student) {
		
		studentRepositary.save(student);
	}
	
	@GetMapping("/students")
	public List<Student> allStudent(){
		
		List<Student> students = studentRepositary.findAll();
		
		return students;
		
	}

}
