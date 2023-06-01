package sdbms;
//Interface
public interface StudentManagementSystem {

	void addStudent();
	void displayStudent();
	void displayAllStudents();
	void removeStudent();
	void removeAllStudents();
	void updateStudent();
	void countStudent();
	void sortStudent();
	void findStudentwithHighestMarks();
	void findStudentwithLowestMarks();

}
// all the methods inside interface are automatically
//public and abstract