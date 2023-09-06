package week3.Assignments.Day2;

import java.util.Arrays;

public class StringAssignment4 {
	
	//reverse the even position words (output: I ma a erawtfos tester)
	
	public static void main(String[] args) {
		/* Pseudo Code:
		 * Declare the input as Follow
	     String test = "I am a software tester"; 
		a) split the words and have it in an array
		b) Traverse through each word (using loop)
		c) find the odd index within the loop (use mod operator)
		d)split the words and have it in an array
		e)print the even position words in reverse order using another loop (nested loop)
		f) Convert words to character array if the position is even else 
		//print the word as it is(concatenate space at the end).
	*/
		
	     String test = "I am a software tester"; 
	     String[] words = test.split(" ");
	     String rev = "";
	     StringBuilder sb = new StringBuilder();
	    
		 System.out.println("The given line after convering to Array is:");

			for (String print1 : words) {
				System.out.println(print1);
			}
		 System.out.println("------------------------------------------------------------");

		 for (int i = 0; i < words.length; i++) {
			
			 if (i%2 != 0) {
				char[] oddWord = words[i].toCharArray();
				
				for (int j = oddWord.length - 1 ; j >= 0; j--) {
					rev = rev + oddWord[j];
					words[i] = rev;
				}
				System.out.println("The reversed even word is:" +rev);
				
			}
			else {
				System.out.println("The odd word is:" +words[i]);	
			}
			
		}
		 System.out.println("------------------------------------------------------------");
		 for (String print2 : words) {
				System.out.println(print2);
		 }
		 System.out.println("------------------------------------------------------------");
		 String str = Arrays.toString(words).replace(",", "");
		 System.out.println("Output after converting to String: "+str);
		 
		 
	}
}
