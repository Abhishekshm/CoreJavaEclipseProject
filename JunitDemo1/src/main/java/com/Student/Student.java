package com.Student;

/*
 program:--Pojo class of Student
 
 @Author: Abhishek Sharma
 date:28/10/22
 */
public class Student {

	// Instance Varibale
	private int id;
	private int age;
	private String name;
	private String Course;

//	constrctors
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int id, int age, String name, String course) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
		Course = course;
	}

	// Setter And GEtter
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourse() {
		return Course;
	}

	public void setCourse(String course) {
		Course = course;
	}

	// To String method
	@Override
	public String toString() {
		return "Student [id=" + id + ", age=" + age + ", name=" + name + ", Course=" + Course + "]";
	}

}
