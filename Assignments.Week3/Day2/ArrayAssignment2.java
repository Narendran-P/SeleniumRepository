package week3.Assignments.Day2;

import java.lang.reflect.Array;

public class ArrayAssignment2 {
	
	public static void main(String[] args) {
		
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		
		// get the length of the array
		int len = Array.getLength(arr);
		System.out.println("The length of given Array is: "+len);
		
		// declare an int variable named count
		int count = 0;
		
		// iterate from 0 to the array length-1 (outer loop starts here)
		// assign 0 to count 
		// iterate from i to the length of the array by adding 1 to it (inner loop starts here)
		// compare both the loop variables & check they're equal
		// print the matching value
		
		for (int i = 0; i < arr.length -1; i++) {
			count = 0;
			for (int j = i+1 ; j < arr.length - 1; j++) {
				
				if(arr[i] == arr[j])
				{
					System.out.println("The Duplicate Value in the array is: "+arr[i] );
					break;
				}
				
			}
			
			
		}
			
	}

}
