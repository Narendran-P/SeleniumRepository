package week3.Assignments.Day2;

import java.util.Iterator;

public class StringAssignment3 {
	
	public static void main(String[] args) {
		
		/*
		 * Pseudo code 
		 
		 * a) Use the declared String text as input
			String text = "We learn java basics as part of java sessions in java week1";		
		 * b) Initialize an integer variable as count	  
		 * c) Split the String into array and iterate over it 
		 * d) Initialize another loop to check whether the word is there in the array
		 * e) if it is available then increase and count by 1. 
		 * f) if the count > 1 then replace the word as "" 
		 
		 * g) Displaying the String without duplicate words	
		 */
	
		String text1 = "We learn java basics as part of java sessions in java week1";
		
		int count;
		
		String[] myArray = text1.split(" ");
		System.out.println("The given line is:");

		System.out.println("------------------------------------------------------------");
		for (String print1 : myArray) {
			System.out.println(print1);
		}
		System.out.println("------------------------------------------------------------");
		System.out.println("The given line with out duplicate values:");

	    for (int i = 0; i < myArray.length; i++) {
	    	String word1 = myArray[i];
	    	count = 0;
			for (int j = i+1 ; j < myArray.length; j++) {
				String word2 = myArray[j];
				if (word1.equals(word2)) {
					count++;
				}
				}
			 if (count > 0) {
			    	myArray[i] = "";
			    }
			}
	    
	    for (String print2 : myArray) {
			System.out.println(print2);
		}
		System.out.println("------------------------------------------------------------");
		System.out.println("The given line after removiong duplciate values and empty values:");

	    	    
	   for (String print2 : myArray) {
		   if (!print2.isEmpty()) {
			System.out.println(print2+"");
		   }
	   }
		
	}
}

		
		

