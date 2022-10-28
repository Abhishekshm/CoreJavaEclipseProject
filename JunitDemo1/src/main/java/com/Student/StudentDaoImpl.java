package com.Student;

/*
program:--Implemention of StudentDao

@Author: Abhishek Sharma
date:28/10/22
*/
public class StudentDaoImpl implements StudentDao {

	// overrideing Checking Age less than 18
	@Override
	public boolean checkAge(int age) {
		if (age > 18)
			return true;
		else
			return false;
	}

	// overrideing Checking Course equals to BCA
	@Override
	public boolean checkCourse(String course) {
		if (course == "BCA")
			return true;
		else
			return false;
	}

	// overrideing Checking id less than 10
	@Override
	public boolean checkId(int id) {
		if (id > 10)
			return false;
		else
			return true;
	}

}
