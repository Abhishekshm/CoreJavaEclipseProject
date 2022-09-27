package com.demo;

/*
Program: Aggregration Examples
@author: Abhishek Sharma
@date: 27th sept 2022
*/
public class Student {

	// Instance variable
	private int id;
	private String name;
	private Address addr; // Agrregration

	// default Constructor
	public Student() {
		super();

	}

	// paramaterized Constructor
	public Student(int id, String name, Address addr) {
		super();
		this.id = id;
		this.name = name;
		this.addr = addr;
	}

	// 1st Setter and getter
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	// 2nd Setter and getter
	public void setName(String name) {
		this.name = name;
	}

	public Address getAddr() {
		return addr;
	}

	// 3rd setter and getter
	public void setAddr(Address addr) {
		this.addr = addr;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", addr=" + addr + "]";
	}

}
