package com.main;
/*
Program: Creating main class and creating object
@author: Abhishek Sharma
@date: 27th sept 2022
*/

//Importing packages
import com.inherit.ElectricCycle;
import com.inherit.MountainCycle;
import com.inherit.RacingCycle;

//declaring main Class
public class TestCycle {

	// declaring main method
	public static void main(String[] args) {
		MountainCycle cycle1 = new MountainCycle("Thin", 3, "Disc Barkes", 5, 45.8); // craeting object cycle2 of
																						// montainCycle and passing
																						// value
		// printing mounatin Cycle Details
		System.out.println("Mountain Cycle" + cycle1);
		System.out.println(); // Pritning new line

		RacingCycle cycle2 = new RacingCycle("Flat", 4, "Emergency Brakes", 6, 50.34, true, "LED", "Nitro"); // creating
																												// cycle2
																												// object
																												// of
																												// RAcingCycle
																												// and
																												// passing
																												// value

		// printing Details of Racing Cycle
		System.out.println(cycle2);
		System.out.println(); // printing new lines

		ElectricCycle cycle3 = new ElectricCycle("Thin", 2, "Emergency Brakes", "Lithium"); // creating cycle3 object of
																							// ElectricCycle and passing
																							// value

		// Printing Detalis of electric cycle
		System.out.println(cycle3);
		System.out.println(); // printng new lines
	} // end of main method
} // end of class
