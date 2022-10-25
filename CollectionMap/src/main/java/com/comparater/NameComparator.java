package com.comparater;

/*
Program :- Name Conpare using Comparator
@Author :- Abhishek Sharma
Date :-25/10/2022
*/
import java.util.Comparator;

//Implementing Comparator
public class NameComparator implements Comparator<Person> {

	@Override
	public int compare(Person p1, Person p2) {

		return (p1.getName().compareTo(p2.getName()));
	}

}
