package week3.Assignments.Day2;

import java.util.Arrays;

public class ArrayAssignmant4 {
	
	public static void main(String[] args) {
		//FindSecondLargest 
		// Here is the input
				int[] data = {3,2,11,4,6,7};
				
				/*
				 Pseudo Code:
				 1) Arrange the array in ascending order
				 2) Pick the 2nd element from the last and print it
				 */
				Arrays.sort(data);
				
				int len = data.length;
				System.out.println("The length of the Arrays is:" +len);
				
				System.out.println("The sednod last element in attay is: "+data[len-2]);
	}

}
