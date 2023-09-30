package week4.Assignments.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {
	
	public static void main(String[] args) {
		// Here is the input
		int[] data = {3,2,11,4,6,7,2,3,3,6,7};
				
				//       output= 7;
				/*
				 * Pseudo Code: 
				 * a) Create a empty Set Using TreeSet
				 * b) Declare for loop iterator from 0 to data.length and add into Set 
				 * c) converted Set into List
				 * d) Print the second last element from List
				 * 
				 * 
				 */
		//Creating a tree set to remove duplicate values & get ordered items
		Set<Integer> unique = new TreeSet<>();
		
		for (int i=0; i< data.length; i++) {
			unique.add(data[i]);
		}
		System.out.println(unique);
		
		//Set to Integer
		List<Integer> newdata = new ArrayList<>(unique);
		System.out.println(newdata);
		
		//getting second larger number
		int len = newdata.size();
		int num = newdata.get(len-2);
		System.out.println("The second largest number is:"+num);
		
		

	}

}
