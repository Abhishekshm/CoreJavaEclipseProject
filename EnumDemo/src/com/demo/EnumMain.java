package com.demo;

/*
Program: Enum Examples
@author: Abhishek Sharma
@date: 26th sept 2022
*/
//declare Enum Main class 
public class EnumMain {
	// creating Colours Enum
	enum Colors {
		RED(6), WHITE(7), BLACK(9), YELLOW(8);

		private int value; // not creating Instance value

		// constructor class
		private Colors(int value) {
			this.value = value;
		}
	}// end of Colurs

	// declare main method
	public static void main(String[] args) {

		// for loop to traversing Colours
		for (Colors c : Colors.values()) {
			System.out.println(c + " " + c.value);
		} // end of for
	} // end of main
} // end of EnuMain
