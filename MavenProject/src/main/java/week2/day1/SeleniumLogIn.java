package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumLogIn {
	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		//open the url
		driver.get("https://login.salesforce.com/");
		//maximize
		driver.manage().window().maximize();
		//locate and Send username
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		//locate and send password
		driver.findElement(By.id("password")).sendKeys("Leaf$1234");
		//click on Log in
		driver.findElement(By.id("Login")).click();
		//get title
		String title = driver.getTitle();
		System.out.println(title);
		//get the forgot link
		//Close browser
			//	driver.close();
		
				
				//Forgot user name
			//	ChromeDriver driver = new ChromeDriver();
				driver.get("https://login.salesforce.com/");
				//maximize
				//driver.manage().window().maximize();
				//locate and click orgot user name
				driver.findElement(By.linkText("Forgot Your Password?")).click();
				String title2 = driver.getTitle();
				System.out.println(title2);
				//Close browser
				driver.close();
	}

}
