package com.Junit5;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Test cases for AssertJ")
public class DemoTest1 {

	@BeforeAll

	static void beforeAllMethod() {

	}

	@BeforeEach
	void beforTestCase() {

	}

	@DisplayName("String Test")
	@Test
	void testStringNull() {
		int actual = 10;
		int expected = 10;
		assertThat(actual).isEqualByComparingTo(expected);
	}

	@DisplayName("Comparison Test")
	@Test
	void compareValues() {
		String s = null;
		assertThat(s).isNull();

		String s1 = "JUNIT";
		assertThat(s1).isNotNull();
	}

	@DisplayName("checking Array same vlaues")
	@Test
	void arraySameValues() {
		int arr[] = { 1, 2, 3 };
		int arr1[] = { 1, 2, 3 };
		assertThat(arr).isEqualTo(arr1); // object comparing because array is an object
//		assertThat(arr).isNotEqualTo(arr1);
	}

	@AfterEach
	void afterTestCase() {

	}

	@AfterAll
	static void afterAllMethod() {

	}

}
