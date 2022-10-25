package com.comparater;

/*
Program :- Different Sorting Method Of using Lamda,anonymous Object Creation Collections
@Author :- Abhishek Sharma
Date :-25/10/2022
*/
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PersonListCpmaparatorLambda {

	public static void main(String[] args) {

		// Creating a List and adding
		ArrayList<Person> per1 = new ArrayList<>();
		per1.add(new Person("Abhishek", 101, 12));
		per1.add(new Person("Shekhar", 102, 15));
		per1.add(new Person("Subodh", 103, 19));
		per1.add(new Person("Shreya", 104, 22));
		per1.add(new Person("Kiran", 105, 44));

		System.out.println("-------------Annonymous object creation-----------");
		Comparator<Person> c1 = new Comparator<Person>() {

			@Override
			public int compare(Person p1, Person p2) {
				// TODO Auto-generated method stub
				return (p1.getName().compareTo(p2.getName()));
			}
		};
		Collections.sort(per1, c1);
		for (Person p : per1) {
			System.out.println(p);
		}

		System.out.println("-----Lamda------");

		// Creating another List and adding
		ArrayList<Person> per2 = new ArrayList<>();
		per2.add(new Person("Abhishek", 101, 12));
		per2.add(new Person("Shekhar", 102, 15));
		per2.add(new Person("Subodh", 103, 19));
		per2.add(new Person("Shreya", 104, 22));
		per2.add(new Person("Kiran", 105, 44));

		// Sorting Using Lamda Function
		Collections.sort(per2, (Person p1, Person p2) -> {
			return (p1.getName().compareTo(p2.getName()));
		});

		// For Each Method
		per2.forEach((Person) -> System.out.println(Person));
	}
}
