package com.nonGeneric;

//declaring class
public class NonGenericDemo {

	// declaring main method
	public static void main(String[] args) {

		// creating Nongeneric object and passing integer value
		NonGeneric iObj = new NonGeneric(55);
		iObj.typeOfObject(); // calling method

		int v = (Integer) iObj.getObj(); // Converting type of object which is passed
		System.out.println(v); // printing value

		// creating Nongeneric object and passing String value
		NonGeneric strObj = new NonGeneric("Java");
		strObj.typeOfObject(); // calling method

		String str = (String) strObj.getObj(); // Converting type of object which is passed
		System.out.println(str); // printing value

		iObj = strObj; // it is allowed in non generic
		// Because there is no type safty
		// In this class Integer and String vlaues are treted in same way
		// you can also equals two value

	} // end of main
}// end of class
