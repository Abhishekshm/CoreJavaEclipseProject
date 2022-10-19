package com.comparison;

import java.util.ArrayList;

public class CompareArrayList {

	// declare main method
	public static void main(String[] args) {

		ArrayList<String> myStore = new ArrayList<>();
		myStore.add("Mouse");
		myStore.add("Keyboard");
		myStore.add("Monitor");
		myStore.add("RAM");

		System.out.println(myStore);

		ArrayList<String> myStore1 = new ArrayList<>();
		myStore1.add("Mouse");
		myStore1.add("Keyboard");
		myStore1.add("Monitor");
		myStore1.add("RAM");

		System.out.println(myStore1);

		// comapring two Array List
		boolean status = myStore.equals(myStore1);
		System.out.println(status);

		// adding one item to the 2nd List
		myStore1.add("OS");
		status = myStore.equals(myStore1);
		System.out.println(status);

		myStore1.removeAll(myStore);
		System.out.println(myStore1);

		// reatin\
		myStore1.retainAll(myStore);
		System.out.println(myStore1);
	}
}
