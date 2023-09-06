package week1.Assignments0819;

public class IsPrime {
	
	public static void main(String[] args) {
		int n = 97;
		int a = 0;
		int b = 0;
	
		//finding a given number is Prime or Non Prime 
		if(n == 0) {
			System.out.println(n+" - The number is neither prime nor composite");
		}
	    else {
		for (int i = 1; i <= n ; i++) {
			
		if(n%i == 0) {
			b = a+1;
			a = b;
		}
	
		}
		
		if (b == 2) {
				System.out.println(n+" - The number is Prime");
		}
		else {
				System.out.println(n+" - The number is Non - Prime");
			}
			}
		}
		}



