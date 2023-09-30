package week4.Assignments.day1;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
	public static void main(String[] args) {
//		Declare a String as "PayPal India"
//		Convert it into a character array
//		Declare a Set as charSet for Character
//		Declare a Set as dupCharSet for duplicate Character
//		Iterate character array and add it into charSet
//		if the character is already in the charSet then, add it to the dupCharSet
//		Check the dupCharSet elements and remove those in the charSet
//		Iterate using charSet
//		Check the iterator variable isn't equals to an empty space
//		print it
		
		String str1 = "PayPal India";
		char[] char1 = str1.toCharArray();
		
		Set<Character> charSet = new LinkedHashSet<>();
		Set<Character> dupCharSet = new LinkedHashSet<>();
		
		for (Character each : char1) {
			if(!charSet.contains(each)) {
				charSet.add(each);
			}
			else {
				dupCharSet.add(each);
			}
		}
		System.out.println(charSet);
		System.out.println(dupCharSet);

		System.out.println("Unique Characters: ");
		for (Character each1 : charSet) {
			if (each1 != ' ') {
				System.out.println(each1);
			}
		}
		System.out.println("Duplicate Characters: "+dupCharSet);
			
		}
	}


