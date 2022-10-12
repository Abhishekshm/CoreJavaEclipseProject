package com.example;

import java.util.Scanner;

public class TryCatch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[3];
		System.out.println("enter elements");
		try {
			for (int i = 0; i < 4; i++) {
				a[i] = sc.nextInt();

				System.out.print(a[i] + " ");
			}
		} catch (Exception e) {
			System.out.println("Entered many input " + e);
		}
		int c = 20;
		int b = c / 0;
		System.out.println(b);
		sc.close();

	}
}
