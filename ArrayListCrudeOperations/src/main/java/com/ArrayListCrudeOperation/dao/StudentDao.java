package com.ArrayListCrudeOperation.dao;

//Importing packages

import com.ArrayListCrudeOperation.model.Student;

//declaring an Interface
public interface StudentDao {

	// Absrract method for Add,remove,update Student
	public void addStudent();

	public boolean removeStudent(int id);

	public boolean updateStudent(int id);

	Student findStudent(int id);

	public void displayAll();
}// end of class
