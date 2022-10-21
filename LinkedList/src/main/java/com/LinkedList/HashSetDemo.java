package com.LinkedList;

/*
Program :- Hash set creation and passing link list
@Author :- Abhishek Sharma
Date :-21/10/2022
*/
import java.util.HashSet;
import java.util.LinkedList;

public class HashSetDemo {

	public static void main(String[] args) {

		// -------Creating Linked List ---------//
		LinkedList<String> linkList = new LinkedList<String>();

		// --Adding ---//
		linkList.add("Dairy milk");
		linkList.add("kitkat");
		linkList.add("Cadebury");
		linkList.add("Bournvile");
		linkList.add("Dairy milk");

		// It will remove all the duplicates in the list
		HashSet<String> set = new HashSet<>(linkList);

		set.add(null); // Only one null value accepeted
		System.out.println(set);

	}
}
