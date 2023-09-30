package week4.Assignments.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MissingNumber {
	
	public static void main(String[] args) {
		
		/*
		 * Problem 
		 * 
		 * There will be running number between 1 to 10
		 * One of the unique number will be missing
		 * Find the missing number
		 * 
		 * 
		 */
		
		/*
		 * Psuedocode
		 * 
		 * a) Remove the duplicates using Set
		 * b) Make sure the set is in the ascending order
		 * c) Iterate from the starting number and verify the next number is + 1
		 * d) If did not match, that is the number
		 * 
		 */
		
		int[] data = {1,3,2,10,8,9,4,6,7,2,3,3,6,7};
		
		Set<Integer> numbers1 = new TreeSet<>(); 
		
		for (int i = 0; i < data.length; i++) {
			numbers1.add(data[i]);
		}
		
		List<Integer> number2 = new ArrayList<>(numbers1);
		System.out.println(number2);
		
		//to get the missing number
		for (int j = 1; j <= number2.size() ; j++) {
			
			if(j+1 == number2.get(j)) {
				continue;
			}
			else {
				System.out.println("The missing number is: "+(j+1));
				break;
			}
			
		}
		
		
	}	
		
	}
