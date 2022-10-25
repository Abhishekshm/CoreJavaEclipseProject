package com.comparable;

import java.util.ArrayList;

public class StudentCompare {

	public static void main(String[] args) {

		Student s = new Student();
		ArrayList<Student> s1 = new ArrayList<>();

		s1.add(new Student("Abhishek", 101, 12));
		s1.add(new Student("Shekhar", 102, 15));
		s1.add(new Student("Subodh", 103, 19));
		s1.add(new Student("Shreya", 104, 22));
		s1.add(new Student("Kiran", 105, 44));

		for (Student i : s1) {

			System.out.println(i);
		}
		System.out.println();
		System.out.println("-------------------------");
//		Collections.reverse(s1);
//		Collections.swap(s1, 0, 1);
//		Collections.sort(s1);

		for (Student i : s1) {

			System.out.println(i);
		}
	}

}
