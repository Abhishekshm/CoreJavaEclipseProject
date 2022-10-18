package com.student;

/*
Program :- Creating Student class 
@Author :- Abhishek Sharma
Date :-18/10/2022
*/
//declaring class
public class Student {

	// Instance Variable//
	int id;
	String name;
	float marks;

	// Default Constructor
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	// paramaterized Constructor
	public Student(int id, String name, float marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

	// -----------Getter and Setter-----------//
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	// -----------Getter and Setter-----------//
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// -----------Getter and Setter-----------//
	public float getMarks() {
		return marks;
	}

	public void setMarks(float marks) {
		this.marks = marks;
	}

	// Too String method
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	} // end of method

}// end of class
