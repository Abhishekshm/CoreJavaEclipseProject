package com.LinkedList;

/*
Program :- Creation of tree Set and its Method
@Author :- Abhishek Sharma
Date :-21/10/2022
*/
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {

		// ----Creating Tree Set Object--------//
		TreeSet<Integer> set = new TreeSet<Integer>();

		// ----Adding----//
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		// set.add(null); //Exception-------
		System.err.println(set);

		// Highest and Lowest Value
		// Retrieve and delete
		// it Extract its value and delete all the values from the list
		System.out.println("Lowest Value : " + set.pollFirst());
		System.out.println("Highest Value : " + set.pollLast());

		System.out.println(set);

		TreeSet<String> set1 = new TreeSet<String>();
		set1.add("Dairy milk");
		set1.add("kitkat");
		set1.add("Cadebury");
		set1.add("Bournvile");

		System.out.println("Reversing a Set");
		System.out.println("Original set : " + set1);
		System.out.println("Reverse set : " + set1.descendingSet());

		// elemnts smaller than this Strings
		System.out.println("---------------");
		System.out.println("Head set : " + set1.headSet("Cadebury", true));

		// Elements larger than this String
		System.out.println("---------------");
		System.out.println("Tail set : " + set1.tailSet("kitkat", true));

	}
}
