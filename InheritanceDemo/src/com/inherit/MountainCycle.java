package com.inherit;
/*
Program: Inheritance Examples Single level
@author: Abhishek Sharma
@date: 27th sept 2022
*/

//declare class MountainCycle and Inherit cycle class
public class MountainCycle extends Cycle {

	// Instance variable
	private int noOfGear;
	private double speed;

	// Default Constructor
	public MountainCycle() {
		super();

	}

	// paramaterized Constuctor
	public MountainCycle(String wheel, int seatLevel, String brake, int noOfGear, double speed) {
		super(wheel, seatLevel, brake);
		this.noOfGear = noOfGear;
		this.speed = speed;
	}

	// 1st getter and setter
	public int getNoOfGear() {
		return noOfGear;
	}

	public void setNoOfGear(int noOfGear) {
		this.noOfGear = noOfGear;
	}

	// 2nd getter and setter
	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	@Override
	public String toString() {
		return "  Number of gears  " + noOfGear + ", speed=  " + speed + "   Other details  of" + super.toString();
	}

}
