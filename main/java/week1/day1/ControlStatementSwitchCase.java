package week1.day1;

public class ControlStatementSwitchCase {

	 public static void main(String[] args) {
		String browser = "Chrome";
		switch(browser) {
		case "Chrome":System.out.println("Open Chrome Browser");break;
		case "Edge":System.out.println("Open Edge Browser");break;
		case "Firefox":System.out.println("Open Firefox Browser");break;
		case "IE":System.out.println("Open Internet Explorer Browser");break;
		default:System.out.println("Open Opera Browser");break;

		}
	}
}
