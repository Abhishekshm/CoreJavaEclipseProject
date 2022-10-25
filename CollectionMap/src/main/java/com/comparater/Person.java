package com.comparater;

/*
Program :- Pojo Class of Person
@Author :- Abhishek Sharma
Date :-25/10/2022
*/
public class Person {

	// --Instance Variable--//
	private String name;
	private int id;
	private int age;

	// Defalut Constructor
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	// Paramaterized Constructor
	public Person(String name, int id, int age) {
		super();
		this.name = name;
		this.id = id;
		this.age = age;
	}

	// Getter and Setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// To String method
	@Override
	public String toString() {
		return "Person [name=" + name + ", id=" + id + ", age=" + age + "]";
	}

}
