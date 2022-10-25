package com.comparater;

/*
Program :- Age Comapare class using comparator
@Author :- Abhishek Sharma
Date :-25/10/2022
*/
import java.util.Comparator;

//implementing comparator
public class AgeComparator implements Comparator<Person> {

	@Override
	public int compare(Person p1, Person p2) {

		if (p1.getAge() == p2.getAge())
			return 0;
		else if (p1.getAge() > p2.getAge())
			return 1;
		else
			return -1;

	}

}
