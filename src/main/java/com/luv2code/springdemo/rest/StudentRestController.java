package com.luv2code.springdemo.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luv2code.springdemo.entity.Student;

@RestController
@RequestMapping("/api")
public class StudentRestController {

	//define endpoint for "/students" - return list of students
	
	@GetMapping("students")
	public List<Student> getStudents(){
		
		
		List<Student> theStuddents = new ArrayList<>();
		theStuddents.add(new Student ("Poornima","Patel"));
		theStuddents.add(new Student ("Alex","Lilos"));
		theStuddents.add(new Student ("Nina","Rikos"));
		
		
		return theStuddents;
	}
}
