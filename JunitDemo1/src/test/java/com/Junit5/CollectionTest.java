package com.Junit5;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CollectionTest {

	private Object first;
	private Object second;

	private List<Object> list;

	@BeforeEach

	void creatColeection() {
		first = new Object();
		second = new Object();
		System.out.println("Object are Ready");

		Object ar[] = { first, second };
		list = Arrays.asList(ar);
	}

	@DisplayName("Size of the Collection")
	@Test
	void checkSize() {
		assertThat(list).hasSize(2);
	}

}
