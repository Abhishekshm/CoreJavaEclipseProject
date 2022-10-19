package com.comparison;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListElementCheck {

	public static void main(String[] args) {

		ArrayList<String> cpu = new ArrayList<>(Arrays.asList("Ram", "Hard Disk", "HDMI", "Processor"));

		System.out.println(cpu);
		boolean present;
		present = cpu.contains("Ram");
		System.out.println(present);

		// searching item in the List
		present = cpu.contains("VGA");
		System.out.println(present);

		// Removing particular Item
		cpu.remove("Hard Disk");
		System.out.println(cpu);

		cpu.clear();
		System.out.println(cpu);
	}
}
