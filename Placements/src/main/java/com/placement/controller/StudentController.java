package com.placement.controller;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.placement.entity.StudentEntity;
import com.placement.placementservice.StudentService;
@Controller
public class StudentController 
{

	@Autowired
	StudentService studentServiceObj;
	
	@GetMapping("/s_login")
	public String login()
	{
		return"StudentLogin";
	}
	
	@GetMapping("/signup")
	public String signUp()
	{
		return "StudentSignin";
	}
	
	@GetMapping("/dashboard")
	public String dashboard()
	{
		return "StudentDashboard";
	}
	
	@GetMapping("/dash_activity")
	public String dashActivity()
	{
		return "StudDashActivity";
	}
	
	
	@PostMapping("/saveStudentDetails")
	public String studentDetails(@ModelAttribute StudentEntity studentEntityObj)
	{
		studentServiceObj.addStudentDetails(studentEntityObj);
		return "StudentLogin";
	}
	
	@PostMapping("/verifylogin")
	public String verifyLogin(@ModelAttribute StudentEntity studentEntityObj)
	{
		
		StudentEntity entity = studentServiceObj.findByStudentEmailAndStudentPassword(studentEntityObj.getStudentEmail(), studentEntityObj.getStudentPassword());
		if(Objects.isNull(entity))
		{
			return "redirect:/s_login";
		}
		else
		{
			return "redirect:/dashboard";
		}
	}
}
