package com.conversion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertingArray {

	public static void main(String[] args) {

		String[] mobileStore = { "Samsung ", "Nokia ", "Oppo ", "Vivo ", "Xioami " };
		List<String> mobileList = new ArrayList<>();
		mobileList = Arrays.asList(mobileStore);
		System.out.println(mobileList);

		mobileList.add("Apple");
		System.out.println(mobileList);

	}
}
