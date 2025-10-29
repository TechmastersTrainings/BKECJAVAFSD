package com.techmasters.springbootfirstproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.techmasters.springbootfirstproject.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{
	
	//methods -- Save() findAll() FindAllId() DeleteById() updatebyId()
	// CRUD -- CREATE, READ, UPDATE and DELETE
	//RestAPI --> GET: READ, PUT:UPDATE, POST: CREATE and DELETE:DELETE
	
}
