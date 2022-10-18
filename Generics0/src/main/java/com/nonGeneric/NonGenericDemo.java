package com.nonGeneric;

public class NonGenericDemo {

	public static void main(String[] args) {

		NonGeneric iObj = new NonGeneric(55);
		iObj.typeOfObject();

		int v = (Integer) iObj.getObj();
		System.out.println(v);

		NonGeneric strObj = new NonGeneric("Java");
		strObj.typeOfObject();

		String str = (String) strObj.getObj();
		System.out.println(str);

		iObj = strObj; // it is allowed in non generic because there is no type safty between String
						// and Integer
	}
}
