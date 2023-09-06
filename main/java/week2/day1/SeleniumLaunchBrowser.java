package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumLaunchBrowser {
	
	public static void main(String[] args) {
		//Launch the browser
		ChromeDriver driver = new ChromeDriver();
		//opening the URL
		driver.get("https://www.facebook.com/");
		//maximize window
		driver.manage().window().maximize();
		//to get the title
		String title = driver.getTitle();
		System.out.println(title);
		//close the browser
		driver.close();
	}

}
