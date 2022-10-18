package com.nonGeneric;

/*
Program :- Creating Non Generic Class and showing type of object
@Author :- Abhishek Sharma
Date :-18/10/2022
*/
//declaring class
public class NonGeneric {

	Object obj; // creating instance of object

	// Default constructor

	public NonGeneric() {
		super();
		// TODO Auto-generated constructor stub
	}

	// paramaetrized Constructor
	public NonGeneric(Object obj) {
		super();
		this.obj = obj;
	}

	// -----------Getter and Setter-----------///
	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}

	// Method for showing type of object
	void typeOfObject() {
		System.out.println("Type: " + obj.getClass().getName());
	} // end of method
}// end of class
