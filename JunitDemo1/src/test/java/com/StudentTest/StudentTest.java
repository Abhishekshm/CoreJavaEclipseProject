package com.StudentTest;

/*
program:--Testing Class OF Student

@Author: Abhishek Sharma
date:28/10/22
*/

//Importing libraries
import static org.assertj.core.api.Assertions.assertThat;

//importing libraries
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

//importing Packages
import com.Student.Student;
import com.Student.StudentDao;
import com.Student.StudentDaoImpl;

public class StudentTest {

	// Static student reference
	static Student s;

	// Only Excutes once at a time
	@BeforeAll
	public static void beforefirst() {
		s = new Student(); // creating object

		// Setting input
		s.setId(06);
		s.setCourse("BCA");
		s.setAge(23);
		s.setName("Abhishek");

	}

	@BeforeEach
	public void runBeforeTest() {

	}

//	--------Possitive Test--------------//

	@Test
	public void Agetest() {
		StudentDao sChech = new StudentDaoImpl(); // creating object of Studentdaoimpl

		assertThat(sChech.checkAge(s.getAge())).isTrue();

	}

	@Test
	public void idtest() {
		StudentDao sChech = new StudentDaoImpl(); // creating object of Studentdaoimpl

		assertThat(sChech.checkId(s.getId())).isTrue();

	}

	@Test
	public void coursetest() {
		StudentDao sChech = new StudentDaoImpl(); // creating object of Studentdaoimpl

		assertThat(sChech.checkCourse(s.getCourse())).isTrue();

	}

	// ------------Negative-----------------//
	@Test
	public void Agetest1() {
		StudentDao sChech = new StudentDaoImpl(); // creating object of Studentdaoimpl

		// setting age less than 18
		s.setAge(14);
		assertThat(sChech.checkAge(s.getAge())).isTrue();

	}

	@Test
	public void idtest1() {
		StudentDao sChech = new StudentDaoImpl(); // creating object of Studentdaoimpl

		// setting id less tan 10
		s.setId(12);
		assertThat(sChech.checkId(s.getId())).isTrue();
	}

	@Test
	public void coursetest1() {
		StudentDao sChech = new StudentDaoImpl(); // creating object of Studentdaoimpl
		// setting course other than BCA
		s.setCourse("B.tech");
		assertThat(sChech.checkCourse(s.getCourse())).isTrue();

	}

	@AfterEach
	public void runAfterTest() {

	}

	// Excutes only once
	@AfterAll
	public static void afterFirst() {

		System.out.println("Test Completed");
	}
}
