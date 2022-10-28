package com.Junit5;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class DemoTest {

	@BeforeAll
	public static void callFirst() {
		System.out.println("Before all classes excuted excatly once ");
	}

	@BeforeEach
	public void beforeTestCase() {
		System.out.println("Before Test Case");
	}

	@Test
	public void test() {
		System.out.println("Inside Test 1");
	}

	@Test // Run Extra one more time
	@RepeatedTest(value = 3) // Run three Time
	public void repeatedMe() {
		System.out.println("Repeated Test Case:");
	}

	@AfterEach
	public void afterTestCase() {
		System.out.println("After Test Case");
	}

	@AfterAll
	public static void callLast() {
		System.out.println("After all classes excuted excatly once ");
	}

	@Disabled
	public void neverRun() {
		System.out.println("Never Run this: ");
	}

}
