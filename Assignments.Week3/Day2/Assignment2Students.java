package week3.Assignments.Day2;

public class Assignment2Students {
	
	 public void getStudentInfo(int id) {
		 
		 System.out.println("The Student ID is: "+id);
		 
	}
	 public void getStudentInfo(int id, String name) {
		 
		 System.out.println("The Student ID is: "+id);
		 System.out.println("The Student Name is: "+name);

	}
	 public void getStudentInfo(int id, String name, String email) {
		 
		 System.out.println("The Student ID is: "+id);
		 System.out.println("The Student Name is: "+name);
		 System.out.println("The email of Student is: "+email);

	} 
	 public void getStudentInfo(int id, String name, String email, long  phnum) {
		 
		 System.out.println("The Student ID is: "+id);
		 System.out.println("The Student Name is: "+name);
		 System.out.println("The email of Student is: "+email);
		 System.out.println("The Phone Number of Student is: "+phnum);

	}
	 
	 public static void main(String[] args) {
		
		 Assignment2Students a1 = new Assignment2Students();
		 a1.getStudentInfo(123);
		 a1.getStudentInfo(121, "Naren");
		 a1.getStudentInfo(1235, "Vinoth", "Vinoth123@gmail.com");
		 a1.getStudentInfo(1414, "Paul", "Paul1212@gmail.com", 456465465565l );
	}
}
