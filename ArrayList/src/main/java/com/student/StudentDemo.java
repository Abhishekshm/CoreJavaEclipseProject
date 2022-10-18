package com.student;

/*
Program :- Creating Array List of Student
@Author :- Abhishek Sharma
Date :-18/10/2022
*/
//declaring class
import java.util.ArrayList; //Importing ArrayList class from list Interface

//Declare class 
public class StudentDemo {

	// declare main class
	public static void main(String[] args) {

		ArrayList<Student> myclass = new ArrayList<>(); // creating list myclass of Arraylist class

		// ------Adding Students Details in the myclass List-----//
		myclass.add(new Student(101, "Rahul", 56.55f));
		myclass.add(new Student(102, "Abhishek", 77.25f));
		myclass.add(new Student(103, "Krishna", 66.14f));
		myclass.add(new Student(104, "Shekhar", 94.10f));
		myclass.add(new Student(105, "Subodh", 49.36f));

		// Enhanced for loop
		for (Student i : myclass) {
//			System.out.println(i.getId() + " " + i.getName() + " " + i.getMarks());
			System.out.println(i);
			// if you do not write or overwrite too String
			// it will print hash code of newly created objects
		} // end of enhanced for loop
	}// end of main method
}// end of class
