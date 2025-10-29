package com.techmasters.springbootfirstproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techmasters.springbootfirstproject.model.Student;
import com.techmasters.springbootfirstproject.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	public StudentRepository repository;
	
	
	//MEthods to converse the actual logic -- CRUD
	//For all the student informations
	public List<Student> getAllStudents() {
		return repository.findAll();
		
	}
	//only selected information
	public Student getStudentById(Long id){	
		return repository.findById(id).orElse(null);
	}
	
	//Save all the details of the student
	public Student saveStudent(Student student) {
		return repository.save(student);
	}
	//delete
	public void deleteStudent(Long id) {
		repository.deleteById(id);
	}

}
