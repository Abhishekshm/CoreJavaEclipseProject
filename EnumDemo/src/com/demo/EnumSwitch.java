package com.demo;

/*
Program: Enum Examples Switch case
@author: Abhishek Sharma
@date: 26th sept 2022
*/
//declare EnumSwitch
public class EnumSwitch {
	// creating an Enum
	enum Direction {
		NORTH, SOUTH, WEST, EAST
	}

//Declaring main method
	public static void main(String[] args) {
		Direction dir = Direction.EAST; // craeting enum object
		// declare Switch
		switch (dir) {

		case NORTH -> System.out.println("North direction");
		case SOUTH -> System.out.println("South direction");
		case WEST -> System.out.println("West direction");
		case EAST -> System.out.println("East direction");
		default -> System.out.println("ALL DIRACTION");
		} // end Switch
	}// end of main
} // end of class
