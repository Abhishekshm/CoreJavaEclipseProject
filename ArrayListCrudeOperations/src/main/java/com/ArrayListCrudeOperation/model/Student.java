package com.ArrayListCrudeOperation.model;

//declaring a class
public class Student {

	// Instance Variable
	private int id;
	private String name;
	private float marks;

	// Default constructor
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	// Paramaterized Constructor
	public Student(int id, String name, float marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

	// -----------Setter and Getters---------------//
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	// -----------Setter and Getters---------------//
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// -----------Setter and Getters---------------//
	public float getMarks() {
		return marks;
	}

	public void setMarks(float marks) {
		this.marks = marks;
	}

	// ToString method
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}// end of to String method

}// end of class
