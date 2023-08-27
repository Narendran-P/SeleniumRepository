package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathRelativeBasic {
	
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		//open the web page
		driver.get("http://leaftaps.com/opentaps");
		//seleting inpput field
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demoSalesManager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		System.out.println("Title is "+driver.getTitle());
		driver.close();
	}

}
