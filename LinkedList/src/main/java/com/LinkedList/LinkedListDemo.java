package com.LinkedList;

/*
Program :- Linklist creation and its method
@Author :- Abhishek Sharma
Date :-21/10/2022
*/
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {

		// Creating Linked List Object
		LinkedList<String> linkList = new LinkedList<String>();

		// Adding Elements
		linkList.add("Dairy milk");
		linkList.add("kitkat");
		linkList.add("Cadebury");
		linkList.add("Bournvile");
		System.out.println(linkList);
		System.out.println("---------------------");
		// Adding Element at first Position
		linkList.add(1, "Amul");
		System.out.println(linkList);
		System.out.println("---------------------");

		// Another link list object is created
		LinkedList<String> linkList1 = new LinkedList<String>();
		// Addind elements to the link list
		linkList1.add("Ferrero Roscher");
		linkList.add("Lindt");

		// Adding all the elements of this list into first list
		linkList.addAll(linkList1);

		System.out.println(linkList);
		System.out.println("---------------------");

		// Again Adding one element to the list
		linkList.addFirst("Toblerone");
		System.out.println(linkList);
		System.out.println("---------------------");

		// Adding Duplicate element in the list and deleting the first occurnace
		linkList.add("Amul");
		System.out.println(linkList);
		System.out.println("---------------------");
		linkList.removeFirstOccurrence("Amul"); // deleting
		System.out.println(linkList);

		System.out.println("---------------------");
		// Printing list into revese order through Iterator
		Iterator<String> itr = linkList.descendingIterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}
}
