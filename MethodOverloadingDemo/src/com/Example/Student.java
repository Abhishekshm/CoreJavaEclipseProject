package com.Example;

//creating class Student
public class Student {
	// Instance variable
	private String name;
	private int id;
	private int age;
	private double marks;
	private String course;

	// default Constructor
	public Student() {
		super();

	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", age=" + age + ", marks=" + marks + ", course=" + course
				+ "]";
	}

	// paramaterized Constructor
	public Student(String name, int id, int age, double marks) {
		super();
		this.name = name;
		this.id = id;
		this.age = age;
		this.marks = marks;
		this.course = "Cse";
	}

	// paramaterized Constructor
	public Student(String name, int id, int age, double marks, String course) {
		super();
		this.name = name;
		this.id = id;
		this.age = age;
		this.marks = marks;
		this.course = course;
	}

	// 1st Setter getter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// 2nd Setter getter
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	// 3rd Setter getter
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// 4th Setter getter
	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	// 5th Setter getter
	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

} // end of class Student
