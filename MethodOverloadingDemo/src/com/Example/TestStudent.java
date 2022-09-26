package com.Example;

/*
Program: Method Over Loading Examples
@author: Abhishek Sharma
@date: 26th sept 2022
*/

//importing Scanner Class
import java.util.Scanner;

//declaring main class Test Student
public class TestStudent {
	// method for display all Student Details
	public static void displayStudent(Student[] s1) {
		// loop for traversing
		for (Student obj : s1) {
			System.out.println("Name :" + obj.getName() + " Marks :" + obj.getMarks() + " Course :" + obj.getCourse());
		} // end of for
	} // end of method displayStudent

	// overloaded method for display marks grater than 90
	public static void displayStudent(Student[] s1, double marks) {
		// loop for traversing
		for (Student obj : s1) {
			// if for comapring marks
			if (obj.getMarks() >= marks)
				System.out.println(
						"Name :" + obj.getName() + " Marks :" + obj.getMarks() + " Course :" + obj.getCourse());
		} // end of for loop
	} // end of OverLoaded method displayStudent

	// declaring main method
	public static void main(String[] args) {
		// creating Scanner class object
		Scanner sc = new Scanner(System.in);
		// creating Student class Object
		Student s[] = new Student[5];

		// craeting new Students and Passing values
		s[0] = new Student("Abhishek", 1, 23, 62);
		s[1] = new Student("Rohan", 2, 25, 92, "BCA");
		s[2] = new Student("Kiran", 3, 26, 78, "MCA");
		s[3] = new Student("Paul", 4, 21, 88);
		s[4] = new Student("Rickky", 5, 29, 96);

		System.out.println("Enter 1 For print All Student Details"); // Asking for input
		System.out.println("Enter 2 For print who scores more than 90"); // Asking for input
		System.out.println("Enter you Choice"); // Asking input
		int choice = sc.nextInt(); // Taking Input
		sc.close(); // clossing scanner class
		// declaring switch
		switch (choice) {
		case 1:
			displayStudent(s); // calling displayStudent
			break;
		case 2:
			displayStudent(s, 90); // calling overloaded method displayStudent
			break;
		default:
			System.out.println("Wrong Input"); // if user gives wrong input
		}// end of Switch
	} // end of main method
} // end of class
