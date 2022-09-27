package com.demo;

/*
Program: Aggregration Examples
@author: Abhishek Sharma
@date: 27th sept 2022
*/

public class StudentDetails {

	static void display(Student s) {
		System.out.println("Student name : " + s.getName());
		System.out.println("Student Id : " + s.getId());
		System.out.println("Student Address : " + s.getAddr());
	}

	public static void main(String[] args) {
		Student s1 = new Student(101, "Abhishek", new Address("Deb 68", "Kolkata", 700121, "WB"));
		display(s1);
	}
}
