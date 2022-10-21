package com.ArrayListCrudeOperation.daoImpl;

//importing classes 
import java.util.ArrayList;
import java.util.Scanner;

//importing packages
import com.ArrayListCrudeOperation.dao.StudentDao;
import com.ArrayListCrudeOperation.model.Student;

//decalring class for for the implementation of interface StudentDao
public class StudentDaoImpl implements StudentDao {

	// Creating a List of Student
	ArrayList<Student> studentList = new ArrayList<Student>();
	// creating Scanner class object
	Scanner sc = new Scanner(System.in);

	// method for adding Student in the List
	public void addStudent() {

		// creating student class object
		Student s1 = new Student();
		// Taking user inputs from the user
		System.out.println("Enter the id: ");
		s1.setId(sc.nextInt());
		System.out.println("Enter the name: ");
		s1.setName(sc.next());
		System.out.println("Enter the marks: ");
		s1.setMarks(sc.nextFloat());

		// Adding student in the list
		studentList.add(s1);
		System.out.println("Student Details are :----------------"); // priniting some statement
		System.out.println(); // new Line
		System.out.println(studentList); // Printing List of student
	} // end of method

	// Method for removing Student
	public boolean removeStudent(int id) {

		// Local variable
		boolean status = false;
		// Student refence
		Student sdel = null;
		// finding the student in the List
		for (Student s : studentList) {
			if (s.getId() == id)
				sdel = s;
		} // end of for

		// checking record
		if (sdel == null)
			status = false;
		else {
			studentList.remove(sdel);
			status = true;
		} // end of if-else

		return status;
	}// end of method

	// Method for updating Student
	public boolean updateStudent(int id) {
		// Local variable
		boolean status = false;
		// Student refence
		Student sfind = null;
		// finding the student in the List
		for (Student s : studentList) {
			if (s.getId() == id)
				sfind = s;
		} // end of for

		if (sfind != null) {
			System.out.println("Enter the name: ");
			sfind.setName(sc.next());
			System.out.println("Enter the marks: ");
			sfind.setMarks(sc.nextFloat());
			status = true;
		} else {
			status = false;
		}
		return status;
	}

	// method for finding Student details in the list
	public Student findStudent(int id) {
		// Student reference
		Student sfind = null;
		// finding the student in the Array List
		for (Student s : studentList) {
			if (s.getId() == id)
				sfind = s;
		} // end of for
		return sfind;
	}// end of method

	public void displayAll() {
		for (Student s : studentList) {
			System.out.println(s);
		}

	}

}// end of class
