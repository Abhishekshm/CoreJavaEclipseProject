package com.ArrayListCrudeOperations;

//Importing class
import java.util.Scanner;

//importing packages
import com.ArrayListCrudeOperation.dao.StudentDao;
import com.ArrayListCrudeOperation.daoImpl.StudentDaoImpl;
import com.ArrayListCrudeOperation.model.Student;

//declaring class 
public class App {

	// method for Printing menu
	public static void menu() {

		// priting all operations to be done//
		System.out.println("-----------MENU-----------");
		System.out.println("1. Add Student ");
		System.out.println("2. Delete Student ");
		System.out.println("3. Update Student ");
		System.out.println("4. Search Student ");
		System.out.println("5. Display all the Students ");
		System.out.println("6. Exit ");
	} // end of method

	// main method
	public static void main(String[] args) {

		// creating Scanner class object
		Scanner sc = new Scanner(System.in);

		// Creating refence of Student dao
		StudentDao school = new StudentDaoImpl();

		// Local variable
		int choice;

		// do-while Loop
		do {

			menu();
			choice = sc.nextInt(); // Taking input
			// declare Switch case
			switch (choice) {

			case 1:
				school.addStudent(); // calling method to add Student
				System.out.println("Student Added Sucessfully"); // printing statement
				break; // out from the case

			case 2:
				System.out.println("Enter the Id which you  want to be deleted:"); // asking user to enter value
				int id = sc.nextInt(); // Taking input
				boolean flag = school.removeStudent(id); // Storing boolean value to flag
				if (flag) // if - else
					System.out.println("Student records are Delete"); // True-----
				else
					System.out.println("Student record is not found");// false----
				break; // out from the case

			case 4:
				Student ss = null; // declaring Student Reference
				System.out.println("Enter the Id to be searched"); // asking user to enter value
				id = sc.nextInt(); // Taking Input
				ss = school.findStudent(id); // Storing student id into the ss
				if (ss == null) // if-else
					System.out.println("Student not found......."); // ---True
				else
					System.out.println(
							"Student Id :" + ss.getId() + "  Name:" + ss.getName() + "   Marks:" + ss.getMarks()); // ----False
				break; // out from the case

			case 6:
				System.exit(0); // System Exit
				break; // out from the case
			default: // Default case
				System.out.println("Wrong Chice is Entered "); // if user gives wrong vlaue

			}
		} while (choice != 6); // if condition matches loop continue to iterate //----End of do While---//
		sc.close(); // closing scanner

	} // end of main
}// end of class
