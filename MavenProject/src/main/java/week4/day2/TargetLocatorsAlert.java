package week4.day2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TargetLocatorsAlert {
	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
		//switch to Alert
		Alert promptAlert = driver.switchTo().alert();
		//sending texts and accepting the Alert
		promptAlert.getText();
		promptAlert.sendKeys("TestLeaf Selenium");
		promptAlert.accept();
		String confirmMsg = driver.findElement(By.xpath("//span[@id='confirm_result']")).getText();
		System.out.println("The confirmation message is: "+confirmMsg);
		
		if (confirmMsg.contains("User entered name")) {
			System.out.println("Alert, entered text verified");
		}
		else
		{
			System.out.println("Alert not verified");
		}
	}

}
