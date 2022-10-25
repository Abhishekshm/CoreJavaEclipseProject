package com.comparater;

/*
Program :- Sorting Class using Multiple Sorting using Compare to Method
@Author :- Abhishek Sharma
Date :-25/10/2022
*/
import java.util.ArrayList;
import java.util.Collections;

public class PersonList {

	public static void main(String[] args) {

		// Creating a list
		ArrayList<Person> per1 = new ArrayList<>();
		per1.add(new Person("Abhishek", 101, 12));
		per1.add(new Person("Shekhar", 102, 15));
		per1.add(new Person("Subodh", 103, 19));
		per1.add(new Person("Shreya", 104, 22));
		per1.add(new Person("Kiran", 105, 44));

		System.out.println("--------Age Sorting------------");
		Collections.sort(per1, new AgeComparator());

		for (Person p : per1) {
			System.out.println(p);
		}

		System.out.println("--------Name Sorting---------");
		Collections.sort(per1, new NameComparator());

		for (Person p : per1) {
			System.out.println(p);
		}
	}
}
