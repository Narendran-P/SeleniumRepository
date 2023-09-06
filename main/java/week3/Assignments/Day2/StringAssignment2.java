package week3.Assignments.Day2;

public class StringAssignment2 {
	
	//palindrome
	
	public static void main(String[] args) {
		
		//Build a logic to find the given string is palindrome or not
		/*
		 * Pseudo Code
		 * a) Declare A String value as"madam"
		 * b) Declare another String rev value as ""
		 * c) Iterate over the String in reverse order
		 * d) Add the char into rev
		 * e) Compare the original String with the reversed String, if it is same then print palinDrome 
		 *Hint: Use .equals or .equalsIgnoreCase when you compare a String 
		 */

		String st = "madam";
		String rev = "";
		
		System.out.println("The given work is: "+st);
		char[] ch = st.toCharArray();
		
		for (int i = ch.length - 1; i >= 0 ; i--) {
			rev = rev + ch[i];
		}
		
		System.out.println("The reverse of the given word is: "+rev);
		
		if (st.equalsIgnoreCase(rev))
		{
			System.out.println("The word is palindrome: "+st);
		}
		else {
			System.out.println("The word is not palindrome: "+st);
		}
	}

}
