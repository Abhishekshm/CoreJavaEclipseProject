package com.Hashmap;

/*
Program :- Creation of Hash Map and its Method
@Author :- Abhishek Sharma
Date :-21/10/2022
*/
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {

		// Creating hash map //
		// this includes key and value

		HashMap<Integer, String> map = new HashMap<Integer, String>();

		// Adding Elements
		// here id is key and name is value
		map.put(101, "Abhishek");
		map.put(102, "Kalyan");
		map.put(103, "Subodh");
		map.put(104, "Priya");
		System.out.println(map);
		System.out.println("-----------------------------------------------------");
		// for iterate---------- convert it to Set

		Set<Entry<Integer, String>> set1 = map.entrySet();
		Iterator<Entry<Integer, String>> itr = set1.iterator();
		while (itr.hasNext()) {

			// printing Separateley both keys and vlaues
			Map.Entry<Integer, String> pair = itr.next();
			System.out.println("Key:----" + pair.getKey() + " , " + " Value:------" + pair.getValue());
		}

		// --------Another way of itreate------------//
		// printing Separateley both keys and vlaues
		// Enhanced for loop
		System.out.println("-----------------------------------------------------");
		for (Map.Entry<Integer, String> fitr : map.entrySet()) {
			System.out.println("Key:----" + fitr.getKey() + " , " + " Value:------" + fitr.getValue());
		}

	}
}
