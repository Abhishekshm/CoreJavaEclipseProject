package com.superr;
/*
Program: using super 
@author: Abhishek Sharma
@date: 27th sept 2022
*/

//declare class Dog and Inherit Animal class
public class Dog extends Animal {
	// Instance variable
	private String color;
	private String breed;

	// default constructor
	public Dog() {
		super();

	}

	// paramaterized constructor
	public Dog(String color, String breed) {
		super(color);
		this.breed = breed;
	}

	// 1st getter and setter
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	// 2nd getter and setter
	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	@Override
	public String toString() {
		return "Dog [color=" + color + ", breed=" + breed + "]";
	}

}
