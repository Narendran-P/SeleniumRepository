package week3.Assignments.Day2;

public class StringAssignment1 {
	public static void main(String[] args) {
		
		
//		 Pseudo Code
//		 Declare String Input as Follow		  
//		 String test = "changeme";		 
//		 a) Convert the String to character array		 
//		 b) Traverse through each character (using loop)	 
//		 c)find the odd index within the loop (use mod operator)	 
//		 d)within the loop, change the character to uppercase, if the index is odd else don't change
		  
		String test = "changename";
		
		char [] ch = test.toCharArray();
		
		for (int i = 0; i < test.length(); i++) {
			
			if(i%2 !=0) {
		    ch[i] =  Character.toUpperCase(ch[i]);
			 System.out.println(ch[i]);
			}
			else {
				System.out.println(ch[i]);
			}
		}
		
		
		 
	}

}
