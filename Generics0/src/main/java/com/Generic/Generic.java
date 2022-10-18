package com.Generic;

/*
 Program :- Creating Generic Class and Adding Integer value Together and Strings Value Together
 @Author :- Abhishek Sharma
 Date :-18/10/2022
 */
public class Generic<T> { // passing type of object

	T num1, num2; // creating references of T

	// Default constructor
	public Generic() {
		super();
		// TODO Auto-generated constructor stub
	}

	// paramaterized Constructor
	public Generic(T num1, T num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}

	// -------Getter and setter---------//
	public T getNum1() {
		return num1;
	}

	public void setNum1(T num1) {
		this.num1 = num1;
	}

	public T getNum2() {
		return num2;
	}

	public void setNum2(T num2) {
		this.num2 = num2;
	}

	// method for finding type Of Object
	void typeOfObject() {
		System.out.println("Type: " + num1.getClass().getName());
//		System.out.println("Type: " + num2.getClass().getName());
	}// end of method
}// end of class
