package com.placement.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class StudentController 
{
	@RequestMapping(value="/display",method=RequestMethod.GET)
	@GetMapping("/display")
	public String display()
	{
		return"index";
	}
	
	@GetMapping("/dashboard")
	public String dashboard()
	{
		return"dashboard";
	}


	
}
