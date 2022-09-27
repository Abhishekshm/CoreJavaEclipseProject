package com.demo;

/*
Program: Aggregration Examples
@author: Abhishek Sharma
@date: 27th sept 2022
*/
public class MobileDetails {
	static void display(Mobile m) {
		System.out.println("Mobile name : " + m.getName());
		System.out.println("Mobile Model No : " + m.getModel());
		System.out.println("Charger Details : " + m.getChr());
	}

	public static void main(String[] args) {

		Mobile m1 = new Mobile("Samsung", 5214, new Charger("Samsung Chager", "5-Volt"));

		display(m1);
	}
}
