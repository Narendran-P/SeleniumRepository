package week1.Assignments0819;

public class PrintDFibbinocciSeries {
	
	public static void main(String[] args) {
		int firstnum = 0;
		int secnum = 1;
		int sum = 0;
		
		System.out.println("Fibbinocci Series");
		
		System.out.println(firstnum);
		System.out.println(secnum);
		
		//1st, 2nd numbers are above. now, iterating 11 times
		for (int i = 0; i <= 10; i++) {
			
			sum = firstnum+secnum;
			System.out.println(sum);
			firstnum = secnum;
			secnum = sum;
			
		}
	}

}
