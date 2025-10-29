package com.techmasters.springbootfirstproject.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

abstract class anyname{
	abstract void dispay(); // override
	
}


@Entity
public class Student extends anyname{
	
	public int somrthonf(){
		return 0;
	}
	
	public static void main(String[] args) {
		anyname ob=new 
	}
	
	//data members
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;// no input should be given via postman
	private String name;// input needed
	private String email; // input needed
	private int age; // input needed
	
	
	//default constructor
	public Student() {
		super();
	}
	
	//Constructor
	public Student(Long id, String name, String email, int age) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.age = age;
	}

	//encapsulation -- getters and setters method

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	void dispay() {
		System.out.println("This is Abstraction.!");
		
	}
	
	
	


}
