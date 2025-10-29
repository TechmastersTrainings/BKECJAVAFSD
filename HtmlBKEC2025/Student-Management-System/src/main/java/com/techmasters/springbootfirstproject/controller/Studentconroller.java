package com.techmasters.springbootfirstproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techmasters.springbootfirstproject.model.Student;
import com.techmasters.springbootfirstproject.service.StudentService;

//http://localhost:8080/students
@RestController
@RequestMapping("/students")
public class Studentconroller {
		
	@Autowired
	public StudentService service;
	
	@GetMapping
	public List <Student> getAllStudents() {
		return service.getAllStudents();
	}
	//http://localhost:8080/students/1
	@GetMapping("/{id}")
	public Student getStudentById(@PathVariable Long id){
		return service.getStudentById(id);
	}
	
	@PostMapping
	public Student addStudent(@RequestBody Student student) {
		return service.saveStudent(student);
	}
	
	@DeleteMapping("{id}")
	public String deleteStudent(@PathVariable Long id) {
		service.deleteStudent(id);
		return "Student data deleted successfully!";
	}
	
	public void display() {
		System.out.println("I am controller.");
	}
}


//https://localhost:8080/students/
//https://youtube.com/qwertyuiodfhjwertyuisdfghjdfghj