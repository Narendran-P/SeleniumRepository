package week1.Assignments0819;

public class TwoWheeler {
	
	//Declaring the required variables
	 
	public int noOfWheels(int wheels) {
		return wheels;
	}
	public short noOfMirrors (short mirror) {
		return mirror;
	}
	public long chassisNumber (long chasisnum) {
		return chasisnum;
	}
	public boolean isPunctured (boolean puncture) {
		return puncture;
	}
	public String bikeName (String bike) {
		return bike;
	}
	public double runningKM (double runkm) {
		return runkm;
	}
	
	public static void main(String[] args) {
		//object of class
		TwoWheeler a = new TwoWheeler();
		
		System.out.println(a.noOfWheels(2));
		
		short mirror = 2;
		System.out.println(a.noOfMirrors(mirror));
		
		System.out.println(a.chassisNumber(1234556712983123l));
		
		System.out.println(a.isPunctured(true));
		
		System.out.println(a.bikeName("Honda CBR250 R"));
		
		System.out.println(a.runningKM(1700120.12222));
	}
	
}
