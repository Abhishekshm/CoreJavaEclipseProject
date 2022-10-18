package com.nonGeneric;

public class NonGeneric {

	Object obj;

	public NonGeneric() {
		super();
		// TODO Auto-generated constructor stub
	}

	public NonGeneric(Object obj) {
		super();
		this.obj = obj;
	}

	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}

	void typeOfObject() {
		System.out.println("Type: " + obj.getClass().getName());
	}
}
