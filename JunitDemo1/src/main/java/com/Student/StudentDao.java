package com.Student;

/*
program:--Interface of StudentDao

@Author: Abhishek Sharma
date:28/10/22
*/
public interface StudentDao {

	// Abstract MEthod
	public boolean checkAge(int age);

	public boolean checkCourse(String course);

	public boolean checkId(int id);
}
