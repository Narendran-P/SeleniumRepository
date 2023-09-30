package week4.Assignments.day1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class PrintUniqueCharacter {
	public static void main(String[] args) {
		//PrintUniqueCharacter
		/*
		 * * Problem
		 * a) Take your name as input
		 * b) Print all unique characters only (any order)
		 * 
		 * Input:  babu
		 * Output: a u 
		 * 
		 */

		/*
		 * Psuedocode
		 * 
		 * a) Convert String to Character array
		 * b) Create a new Set -> HashSet
		 * c) Add each character to the Set and if it is already there, remove it
		 * d) Finally, print the set
		 * 
		 */
		
		String Name = "NarendranP";
		String myName = Name.toLowerCase();
		char[] cName = myName.toCharArray();
		Set<Character> sName = new LinkedHashSet<>();
		
		for (Character each : cName) {
			sName.add(each);
		}
		System.out.println(sName);
		
		}
	}
