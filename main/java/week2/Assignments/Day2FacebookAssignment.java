package week2.Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day2FacebookAssignment {
	
	public static void main(String[] args) {
		
		
		// Step 1: Download and set the path 
		// Step 2: Launch the chromebrowser
		// Step 3: Load the URL https://en-gb.facebook.com/
		// Step 4: Maximise the window
	
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		
		// Step 5: Add implicit wait
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		//Step 6: Click on Create New Account button
		driver.findElement(By.linkText("Create new account")).click();
		
		// Step 7: Enter the first name
		driver.findElement(By.xpath("//input[contains(@name,'firstname')]")).sendKeys("Naren");
		
		// Step 8: Enter the last name
		driver.findElement(By.xpath("//input[contains(@name,'lastname')]")).sendKeys("LastName");
		
		// Step 9: Enter the mobile number
		driver.findElement(By.xpath("//input[contains(@name,'reg_email__')]")).sendKeys("898989898989");
		
		// Step 10: Enterthe password
		driver.findElement(By.xpath("//input[contains(@id,'password')]")).sendKeys("Password");
		
		// Step 11: Handle all the three drop downs
		WebElement element = driver.findElement(By.xpath("//select[contains(@name,'birthday')]"));
		Select sec = new Select(element);
		sec.selectByVisibleText("18");
		
		WebElement element1 = driver.findElement(By.xpath("//select[contains(@name,'month')]"));
		Select sec1 = new Select(element1);
		sec1.selectByValue("4");
		
		WebElement element2 = driver.findElement(By.xpath("//select[contains(@name,'year')]"));
		Select sec2 = new Select(element2);
		sec2.selectByIndex(19);
		
		
		// Step 12: Select the radio button "Female" 
		    //        ( A normal click will do for this step) 
		
		driver.findElement(By.xpath("(//input[@name='sex'])[2]")).click();

	}

}
