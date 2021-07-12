package com.example.springSecurity.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springSecurity.Entity.Student;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {
	
	@GetMapping("/{studentId}")
	public Student getStudent(@PathVariable("studentId") Long studentId) {
		return null;
	}
	
}
