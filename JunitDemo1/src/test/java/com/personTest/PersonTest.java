package com.personTest;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.person.PaymentDao;
import com.person.PaymentdaoImpl;
import com.person.Person;

public class PersonTest {

	static Person p;

	@BeforeAll
	public static void beforefirst() {
		p = new Person();
		p.setId(101);
		p.setName("Abhishek");
	}

	@BeforeEach
	public void runBeforeTest() {

	}

	// ----------Negative-----------//
	@Test
	public void test() {
//		assertThat(12 > 15).isTrue();
		PaymentDao pay = new PaymentdaoImpl();
		p.setName("aa");
		assertThat(pay.payToPerson(p.getName())).isTrue();
	}

	// -----------Posstive -------------//
	@Test
	public void test1() {
//		assertThat(12 > 15).isTrue();
		PaymentDao pay = new PaymentdaoImpl();
		p.setName("Rahul");
		assertThat(pay.payToPerson(p.getName())).isTrue();
	}

	@AfterEach
	public void runAfterTest() {

	}

	@AfterAll
	public static void afterFirst() {

	}
}
