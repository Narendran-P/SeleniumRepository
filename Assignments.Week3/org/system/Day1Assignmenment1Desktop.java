package week3.Assignments.org.system;

public class Day1Assignmenment1Desktop extends Day1Assignment1Computer {
	
	private void desktopSize() {
		
		System.out.println("The desktop size");

	}
	
	//Week3 day 1 Assignment 1
	//Create 2 class Computer, Desktop and call all your class methods 
	//into Desktop using Single Inheritance
	
	public static void main(String[] args) {
		
		Day1Assignmenment1Desktop des = new Day1Assignmenment1Desktop();
		
		des.desktopSize();
		des.computerMethod();
		
	}

}
