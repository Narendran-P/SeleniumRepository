package week3.Assignments.Day2;

public class Assignment1Axisbank extends Assignment1BankInfo {
	
	 @Override
	public void deposit(String dp1) {
		System.out.println("Required PANCARD: "+dp1);
		
	}
	
	public static void main(String[] args) {
		
		Assignment1Axisbank ab = new Assignment1Axisbank();
		ab.savings("NAREN");
		ab.fixed(60000.54f);
		ab.deposit("AYUYUY10125");
	}
		
	}
	
	

