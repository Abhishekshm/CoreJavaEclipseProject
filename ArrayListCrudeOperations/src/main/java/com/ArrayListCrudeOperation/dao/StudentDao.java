package com.ArrayListCrudeOperation.dao;

//Importing packages

import com.ArrayListCrudeOperation.model.Student;

//declaring an Interface
public interface StudentDao {

	// Absrract method for Add,remove,update Student
	public void addStudent();

	public boolean removeStudent(int id);

	public boolean updateStudent(int id, Student s);

	Student findStudent(int id);
}// end of class
