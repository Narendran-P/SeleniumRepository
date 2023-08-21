package week1.Assignments0819;

public class IsPrime {
	
	public static void main(String[] args) {
		int n = 11;
	
		//finding a given number is Prime or Non Prime 
		
		for (int i = 2; i < (n-1) ; i++) {
			
		if(n%i == 0) {
			System.out.println(n+" - The number is non - Prime");
			break;
		}
		else {
			System.out.println(n+" - The number is Prime");
			break;
		}
		}
	}

}
