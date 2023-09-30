package week5.day1;

public class Programmingques {
	
		//palindrome
		
		public static void main(String[] args) {

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
