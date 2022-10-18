package com.set.ArrayList;

//Importing packages
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

//declaring class
public class Example {

	// main method
	public static void main(String[] args) {

		// creating list of fruits of ArrayList class
		ArrayList<String> fruits = new ArrayList<String>();

		// ------Adding Fruits in the list-----------//
		fruits.add("Apple");
		fruits.add("Mango");
		fruits.add("pineApple");
		fruits.add("Lemon");

		// Printing values using many other forms
		System.out.println("---------Printing Normally-----------");
		System.out.println(fruits);

		System.out.println("---------------------------------------");
		System.out.println("---------Printing through Enhanced For Loop-----------");
		for (String i : fruits) {
			System.out.println(i);
		}

		// Itrate Through Iterator
		System.out.println("---------------------------------------");
		Iterator<String> itr = fruits.iterator();
		System.out.println("---------Printing through Itretor------------");
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		// updating an Element in Array list
		System.out.println("---------------------------------------");
		System.out.println(fruits.get(3) + "Changing to Bananan");
		System.out.println("-----------Updating Values in the list------------");
		fruits.set(3, "Bananan");
		System.out.println(fruits);

		// Sorting elemnets in ArrayList
		System.out.println("---------------------------------------");
		System.out.println("-------------After sorting fruits List------------");
		Collections.sort(fruits);
		System.out.println(fruits);

		System.out.println("---------------------------------------");
		System.out.println("------------Printing reverse order------------");
		ListIterator<String> itr1 = fruits.listIterator(fruits.size());
		while (itr1.hasPrevious()) {
			System.out.println(itr1.previous());
		}

		// Lamda Function

		System.out.println("---------------------------------------");
		System.out.println("------------Printing Through Lamda function ------------");
		fruits.forEach(a -> {
			System.out.println(a);
		});

	}// end of main
}// end of class
