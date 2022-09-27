package com.superr;
/*
Program: Creating main class and creating objects of dog class
@author: Abhishek Sharma
@date: 27th sept 2022
*/

//declare main class AnimalTest
public class AnimalTest {

	// declaring main classa
	public static void main(String[] args) {

		// creating d object of Dog and passing value
		Dog d = new Dog("Brown", "Bull Dog");
		System.out.println(d); // printing details of Dog

		d.setColor("Red"); // setting color to dog color
		System.out.println(d); // printing details of Dog
	} // end of main
}// end of main class AnimalTest
