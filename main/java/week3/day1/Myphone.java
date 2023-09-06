package week3.day1;

public class Myphone extends Iphone {
	
	public static void main(String[] args) {
		
		Myphone my = new Myphone();
		
		my.startApp();
		my.increaseVolume();
		my.shutdown();
		my.makeCalls();
		my.sendSMS();
		
		//not able to access Ipad
	
	}

}
