package com.conversion;

import java.util.ArrayList;

public class ConvertingArrayList {
	// declare main method
	public static void main(String[] args) {

		ArrayList<String> myStore = new ArrayList<>();
		myStore.add("Mouse");
		myStore.add("Keyboard");
		myStore.add("Monitor");
		myStore.add("RAM");

		String[] store = myStore.toArray(new String[myStore.size()]);
		for (String s : store) {
			System.out.println(s);
		}
	}
}
