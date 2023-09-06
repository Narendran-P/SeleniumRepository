package week3.Assignments.org.student;

import week3.Assignments.org.department.Day1Assignemnt2Department;

public class Day1Assignment2Student extends Day1Assignemnt2Department {
	
	public void studentName(String studentName) {
		System.out.println("Student Name: "+studentName);
	}
	
	public void studentDept(String studentdept) {
		System.out.println("Student Department: "+studentdept);
	}
	
	public void studentID(int studentID) {
		System.out.println("Student ID: "+studentID);
	}

	public static void main(String[] args) {
		Day1Assignment2Student s1 = new Day1Assignment2Student();
		
		s1.collegeName("PSG Tech - Coimbatore");
		s1.collegeCode(12101);
		s1.collegeRank(10);
		
		s1.deptName("Computer Science");
		
		s1.studentName("Narendran P");
		s1.studentDept("Computer Science");
		s1.studentID(112233);
		
	}
}
