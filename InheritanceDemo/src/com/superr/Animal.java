package com.superr;

/*
Program: Super Examples
@author: Abhishek Sharma
@date: 27th sept 2022
*/

//declare class Animal
public class Animal {
	// Instance variable
	private String name;
	private String color;

	// default Constructor
	public Animal() {
		super();
	}

	// paramaterized Constructor
	public Animal(String name, String color) {
		super();
		this.name = name;
		this.color = color;
	}

//	paramaterized contructor for color
	public Animal(String color) {
		super();
		this.color = color;
	}

//	1st getter and setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

//	2nd getter and setter
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

} // end of class
