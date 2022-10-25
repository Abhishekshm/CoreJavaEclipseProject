package com.CollectionMap.Country;

import java.util.HashMap;
import java.util.Scanner;

public class CountryCode {

	public static void main(String[] args) {

		// deacalring a local String variable
		String country;

		// Creating A Scanner class Object
		Scanner sc = new Scanner(System.in);

		CountryInformation cin = new CountryInformation();

		// Creating HAsh Map Object
		HashMap<String, CountryInformation> nCountry = new HashMap<String, CountryInformation>();

		// Adding

		nCountry.put("India", new CountryInformation("IN", 91, "New Delhi"));
		nCountry.put("United States", new CountryInformation("US", 1, "Washington D.C."));
		nCountry.put("Afghanistan", new CountryInformation("AF", 93, "Kabul"));
		nCountry.put("Argentina", new CountryInformation("AR", 54, "Buenos Aires"));
		nCountry.put("Australia", new CountryInformation("AU", 61, "Canberra"));
		nCountry.put("Canada", new CountryInformation("CA", 1, "Ottawa"));
		nCountry.put("Germany", new CountryInformation("GE", 49, "Berlin"));
		nCountry.put("Greenland", new CountryInformation("GL", 299, "Not Known"));
		nCountry.put("Russia", new CountryInformation("RU", 7, "Moscow"));
		nCountry.put("Singapore", new CountryInformation("SG", 65, "Singapore"));

		System.out.println("Enter the Country for information....");
		country = sc.nextLine();

		// Chechking Country present in the list or not
		boolean status = nCountry.containsKey(country);
		if (status) {
			System.out.println("--------------Information--------------");
			cin = nCountry.get(country);
			System.out.println(cin);
		} else {
			System.out.println("Country Not Found");
		}

		sc.close();
	}
}
