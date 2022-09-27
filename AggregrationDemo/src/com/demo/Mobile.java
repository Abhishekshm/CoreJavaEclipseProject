package com.demo;

/*
Program: Aggregration Examples
@author: Abhishek Sharma
@date: 27th sept 2022
*/
public class Mobile {
	private String name;
	private int model;
	private Charger chr;

	public Mobile() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Mobile(String name, int model, Charger chr) {
		super();
		this.name = name;
		this.model = model;
		this.chr = chr;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getModel() {
		return model;
	}

	public void setModel(int model) {
		this.model = model;
	}

	public Charger getChr() {
		return chr;
	}

	public void setChr(Charger chr) {
		this.chr = chr;
	}

	@Override
	public String toString() {
		return "Mobile [name=" + name + ", model=" + model + ", chr=" + chr + "]";
	}

}
