
package com.ArrayListCrudeOperations;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.ArrayListCrudeOperation.dao.StudentDao;
import com.ArrayListCrudeOperation.daoImpl.StudentDaoImpl;
import com.ArrayListCrudeOperation.model.Student;

public class StudentTest {

	private Student s;
	private StudentDao dao;
	private List<Student> sList;

	@BeforeEach
	void createStudent() {
		sList = new ArrayList<>();
		s = new Student();
		dao = new StudentDaoImpl();

	}

	@DisplayName("to add a student")
	@Test
	void addStudent() {
		dao.addStudent();

	}

	@DisplayName("to check name is null or not")
	@Test
	void nameNull() {
		dao.addStudent();
		assertThat(s.getName()).isNotNull();
	}

	@DisplayName("delete test case")
	@Test
	void deleteStudentTest() {
		dao.addStudent();
		assertThat(dao.removeStudent(101)).isTrue();
	}

	@DisplayName("To check Collection")
	@Test
	void checkCollection() {
		sList.add(s);
		assertThat(sList).contains(s);
	}

	@DisplayName("To check Update")
	@Test
	void checkUpdate() {
		dao.addStudent();
		assertThat(dao.updateStudent(102)).isTrue();
	}

	@AfterEach
	void afetrTest() {

	}

}
