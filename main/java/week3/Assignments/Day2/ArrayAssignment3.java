package week3.Assignments.Day2;

import java.util.Arrays;

public class ArrayAssignment3 {

	//misingelement in Array
	
	public static void main(String[] args) {
		// Here is the input
		int[] arr = {1,2,3,4,7,6,8};

		// Sort the array	
		Arrays.sort(arr);
		//for (int element :arr ) {
		//	System.out.println(element);
		//}

		// loop through the array (start i from arr[0] till the length of the array)
		// check if the iterator variable is not equal to the array values respectively
		// print the number
		// once printed break the iteration
		
		for (int i = 0; i < arr.length; i++) {
						
			if (  arr[i] != i+1) {
				System.out.println("The missing element in Array is: "+(i+1));
				break;
			}	
		}
						
	}
}
