package week4.Assignments.day1;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.apache.logging.log4j.util.Chars;

public class DuplicateWords {
	/*
	 * Pseudo code 

	 * a) Use the declared String text as input
		String text = "We learn java basics as part of java sessions in java week1";
	 *
	 *Output= We learn java basics as part of sessions in week1
	 *
	 * Psuedocode
	 *
	 * b) Split the String based on white spaces and save as String Array ,Then iterate the Array	  
	 * c) Create a empty Set 
	 * d) Iterate the String array
                 d.1) add each word into Set
	 * e) Print the Set values which is having unique words
	 */

	public static void main(String[] args) {
		
		String text = "We learn java basics as part of java sessions in java week1";
	   String [] strWords = text.split(" ");
	   
	   //Printing	   
	   for (String each : strWords) {
		   System.out.println(each);
	}
	   //Linked Hashset to remove the duplciates and maintin the insertion order
	   Set <String> unique = new LinkedHashSet<>();
	   for (int i = 0; i < strWords.length; i++) {
		   unique.add(strWords[i]);
	}
	   //Printing the Set
	   for (String each1 : unique) {
		   System.out.print(each1+" ");
		}

	}	
}
