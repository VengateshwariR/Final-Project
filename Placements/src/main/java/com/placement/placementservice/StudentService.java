package com.placement.placementservice;

import com.placement.entity.StudentEntity;

public interface StudentService 
{
	public void addStudentDetails(StudentEntity place);
	public StudentEntity findByStudentEmailAndStudentPassword(String studentEmail,String studentPassword );
}
