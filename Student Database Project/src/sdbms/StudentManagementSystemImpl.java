package sdbms;
//Implementation class

import java.util.*;
import customSorting.*;
import customexception.InvalidChoiceException;

public class StudentManagementSystemImpl  implements StudentManagementSystem{


	Scanner ip = new Scanner(System.in);

	// key --> Student id       values --> Student object

	Map<String,Student> db = new LinkedHashMap<String,Student>();

	public void addStudent()
	{
		//Accepting age
		System.out.println("Enter Age:");
		int age=ip.nextInt();

		//Accepting name
		System.out.println("Enter Name:");
		String name= ip.next();

		//Accepting marks
		System.out.println("Enter Marks:");
		int marks=ip.nextInt();

		// Creating a Student instance
		Student std =new Student(age, name, marks);
		db.put(std.getId(),std);
		System.out.println("Student Record inserted Sucessfully");
		System.out.println("Student ID is:"+std.getId());
	}




	public void  displayStudent()
	{
		System.out.println("Enter Student ID:");
		String id = ip.next();// or String id = ip.next().toUpperCase
		id=id.toUpperCase();//uppercase

		//			
		if (db.containsKey(id)) {
			System.out.println("Student details found");
			System.out.println("Student details are as follows:-");
			System.out.println("-------------------------------------");
			Student std=db.get(id);
			System.out.println("Id:"+std.getId());
			System.out.println("Age:"+std.getAge());
			System.out.println("Name:"+std.getName());
			System.out.println("Marks:"+std.getMarks());
			//printing reference variable as toString() is overridden
			//System.out.println(std);
		}
		else {
			try {
				String message="Student with Id:"+id+" is not found";
				throw new StudentNotFoundException(message);
			} catch (StudentNotFoundException e) {
				System.out.println(e.getMessage());
			}

		}
	}



	public void displayAllStudents()
	{
		if(!db.isEmpty())
		{	
			System.out.println("Students Record Are As Follows");
			System.out.println("-------------------------------------");

			Set<String>	keys = db.keySet();// JSP101 JSP102
			for(String key:keys)
			{
				Student s = db.get(key);
				System.out.println(s);//toString is overridden
			}
		}
		else {
			try {
				String message = "No Student Records to display!!";
				throw new StudentNotFoundException(message);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

	}

	public void removeStudent()
	{
		System.out.println("Enter Id:");
		String id=ip.next().toUpperCase();
		if(db.containsKey(id))
		{
			System.out.println("Student Record Found");
			System.out.println(db.get(id));
			db.remove(id);
			System.out.println("Student Record Deleted Sucessfully!!");
		}
		else {
			try {
				String message="Student with Id:"+id+" is not found";
				throw new StudentNotFoundException(message);
			} catch (StudentNotFoundException e) {
				System.out.println(e.getMessage());
			}

		}

	}

	public void removeAllStudents()
	{
		if (!db.isEmpty()) {
			System.out.println("No f records :"+db.size());
			db.clear();
			System.out.println("All Records are Deleted Sucessfully!!");

		}
		else {
			try {
				String message = "No Student Records to delete!!";
				throw new StudentNotFoundException(message);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

	}

	public void updateStudent()
	{
		System.out.println("Enter student Id:");
		String id = ip.next().toUpperCase();

		if(db.containsKey(id))
		{
			System.out.println("Student record found");
			Student std= db.get(id);//getting value (student obj)

			System.out.println("1.Update Age\n2.Update Name\n3.Update Marks\nEnter Choice");
			int choice=ip.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Enter Age :");
				int age=ip.nextInt();
				std.setAge(age);
				System.out.println( "Is updated");
				break;

			case 2:
				System.out.println("Enter Name :");
				std.setName(ip.next());
				System.out.println( "Is updated");
				break;

			case 3:
				System.out.println("Enter Marks :");
				std.setMarks(ip.nextInt());
				System.out.println(" Is updated");
				break;

			default:
				try {
					// String message= "Invalid Choice,Enter Valid Choice";
					throw new InvalidChoiceException("Invalid Choice,Enter Valid Choice");//message
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}

		}
		else {
			try {
				String message="Student with Id:"+id+" is not found";
				throw new StudentNotFoundException(message);
			}
			catch (StudentNotFoundException e) {
				System.out.println(e.getMessage());
			}

		}

	}


	public void countStudent()
	{
		System.out.println("No of Student Records:"+db.size());
	}




	public void sortStudent()
	{
		/** Documentation Comment
		 * we cannot sort map based on values, therefore we are getting the values
		 * from map & storing it inside list so that we can sort
		 *  list using --> collection.sort(list,sorting logic object)
		 * */

		//Reference of list & Object of ArrayList storing Student objects
		List<Student> list = new ArrayList<Student>();

		//converting map into set
		Set<String> Keys = db.keySet();

		//Traversing keys (ID)
		for(String key:Keys)
		{
			//getting values (student obj) and adding it into list
			list.add(db.get(key));
		}

		System.out.println("1.Sort Student By Id\n2.Sort Student By Name\n3.Sort Student By Age\n4"
				+ "Sort Student By Marks\n Enter Choice");

		int choice=ip.nextInt();

		switch (choice) {
		case 1:
			Collections.sort(list,new SortStudentById());
			for (Student s : list) {
				System.out.println(s);
			}
			break;

		case 2:
			Collections.sort(list,new SortStudentByName());
			for (Student s : list) {
				System.out.println(s);
			}
			break;

		case 3: 
			Collections.sort(list,new SortStudentByAge());
			for (Student s : list) {
				System.out.println(s);
			}
			break;

		case 4:
			Collections.sort(list,new SortStudentByMarks());
			for (Student s : list) {
				System.out.println(s);
			}
			break;

		default:
			try {
				// String message= "Invalid Choice,Enter Valid Choice";
				throw new InvalidChoiceException("Invalid Choice,Enter Valid Choice");//message
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

	}


	public void findStudentwithHighestMarks()
	{
		List<Student> list=new ArrayList<>();
		Set<String > keys=db.keySet();
		for (String key : keys) {
			list.add(db.get(key));
		}
		
		Collections.sort(list,new SortStudentByMarks());
		System.out.println("Student with higjest marks");
		System.out.println(list.get(list.size()-1));

	}

	public void findStudentwithLowestMarks()
	{
		List<Student> list=new ArrayList<>();
		Set<String > keys=db.keySet();
		for (String key : keys) {
			list.add(db.get(key));
		}

		Collections.sort(list,new SortStudentByMarks());
		System.out.println("Student with lowest marks");
		System.out.println(list.get(0));

		
		
	}


}
