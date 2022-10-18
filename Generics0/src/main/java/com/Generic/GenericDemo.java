package com.Generic;

//Decalring class
public class GenericDemo {

	// Declaring main method
	public static void main(String[] args) {

		// Creating Generic class object and Decaring object as Integer Type
		Generic<Integer> iObj = new Generic<>(55, 77);
		iObj.typeOfObject(); // calling method

		System.out.println(iObj.getNum1() + iObj.getNum2()); // Printing and Adding values

		// Creating Generic class object and Decaring object as String Type
		Generic<String> strObj = new Generic<>("Java ", "Programming");
		strObj.typeOfObject(); // calling method

		System.out.println(strObj.getNum1() + strObj.getNum2()); // Printing and Adding values

		// **** iObj = strObj ****//;------- // it is allowed in generic
		// Because of type safty of an object
		// this programm handle Integer and String separatly
		// They cant be equal

	}// end of main
}// end of class
