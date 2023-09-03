package week3.day2;

import java.util.Iterator;

public class StringLearn {
	
	public static void main(String[] args) {
//		Reverse the String
//		==================
		String  input= "TestLeaf";
//		Goal: To understand the String,loop
//		a)Convert the String to character array (use toCharArray)
		char ch[] = input.toCharArray();
		System.out.println(ch);
//		b)Use for loop to iterate through each character (from end to go to the first)
//		c)Print the Characters continuously
//		*Hint  Use  system.out.print()
		for (int i = ch.length - 1 ; i >= 0; i--) {
			//System.out.println(ch[i]);
			System.out.print(ch[i]);
			
		}
	}

}
