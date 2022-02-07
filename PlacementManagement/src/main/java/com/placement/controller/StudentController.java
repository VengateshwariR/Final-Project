package com.placement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.placement.entity.StudentEntity;
import com.placement.service.StudentService;

@Controller
public class StudentController 
{
	@Autowired
	private StudentService studentService;
	//@RequestMapping(value="/home",method=RequestMethod.GET)
	
	@GetMapping("/home")//handler
	public String index()
	{
		StudentEntity student = new  StudentEntity();
		student.setName("Kavi");
		
		
		studentService.addStudent(student);
		
		return "index";
	}
	
	@GetMapping("/home1")//handler
	public String home1()
	{
		return "home";
	}
	@GetMapping("/student")//handler
	public String student()
	{
		return "student";
	}
	


}
