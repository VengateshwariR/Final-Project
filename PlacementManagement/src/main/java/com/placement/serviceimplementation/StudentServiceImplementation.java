package com.placement.serviceimplementation;

import org.hibernate.service.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.placement.entity.StudentEntity;
import com.placement.repository.StudentRepository;
import com.placement.service.StudentService;

@org.springframework.stereotype.Service
public class StudentServiceImplementation implements StudentService
{
	     @Autowired
	     private StudentRepository studentRepository;
	     
	     @Override
         public void addStudent(StudentEntity student) 
	     {
	    	 studentRepository.save(student);
         
         }
}
