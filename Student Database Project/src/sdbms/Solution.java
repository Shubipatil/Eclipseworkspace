package sdbms;

import java.util.Scanner;

import customexception.InvalidChoiceException;

//MainClass
public class Solution {
	public static void main(String[] args) {

		System.out.println("Welcome To Student Database Project");
		System.out.println("=====================================");

		Scanner ip = new Scanner(System.in); 
		// upCasting for achieving abstractions
		StudentManagementSystem sms = new StudentManagementSystemImpl();

		while (true) {
			// Menu driven Program
			System.out.println("1.Add Student\n2.Display Student"
					+ "\n3.Display All Student\n4.Remove Student"
					+ "\n5.Remove All Student\n6.Update Student"
					+ "\n7.Count Student\n8.Sort Student"
					+ "\n9.Find Student With Highest marks\n10.Find Student With Lowest marks\n11.Exit");

			System.out.println("============================================");

			System.out.println("Enter the choice");

			int choice = ip.nextInt();

			switch (choice) {
			case 1:
				sms.addStudent();		
				break;
			case 2: 
				sms.displayStudent();
				break;
			case 3:
				sms.displayAllStudents();
				break;
			case 4:
				sms.removeStudent();
				break;
			case 5:
				sms.removeAllStudents();
				break;
			case 6:
				sms.updateStudent();
				break;
			case 7:
				sms.countStudent();
				break;
			case 8:
				sms.sortStudent();
				break;
			case 9:
				sms.findStudentwithHighestMarks();
				break;
			case 10:
				sms.findStudentwithLowestMarks();
				break;
			case 11:
				System.out.println("----------Thank You!!----------");
				System.exit(0);
				break;
			default:
				try {
					// String message= "Invalid Choice,Enter Valid Choice";
					throw new InvalidChoiceException("Invalid Choice,Enter Valid Choice");//message
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}


			}//end of switch
			System.out.println("************************************************");

		}//End of while loop


	}//end of main()
}

