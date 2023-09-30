package week6.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class makemytrip {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.switchTo().activeElement();
		WebElement closebtn = driver.findElement(By.xpath("//span[@class='commonModal__close']"));
		closebtn.click();
		
		driver.findElement(By.xpath("//img[@alt='Make My Trip']")).click();
		
		driver.findElement(By.xpath("//span[text()='Holiday Packages']")).click();
		driver.findElement(By.xpath("//p[text()='Cancel']")).click();
		

		driver.findElement(By.id("fromCity")).click();
		driver.findElement(By.xpath("//input[@class='citypicker_input']")).clear();
		driver.findElement(By.xpath("//input[@class='citypicker_input']")).sendKeys("chennai");
		driver.findElement(By.xpath("(//div[@class='searchedCity']//following::span)[1]")).click();
		
		driver.findElement(By.id("toCity")).click();
		driver.findElement(By.xpath("//input[@class='dest-search-input']")).sendKeys("Goa");
		driver.findElement(By.xpath("//div[@class='dest-city-container']//div[text()='Goa']")).click();
		
		driver.findElement(By.xpath("(//p[text()='3'])[2]")).click();
		
		driver.findElement(By.xpath("//div[@class='pointer plus-sign-wrapper']")).click();
		Actions a = new Actions(driver);
		//scroll down a page
		a.sendKeys(Keys.PAGE_DOWN).build().perform();
		driver.findElement(By.xpath("//button[text()='APPLY']")).click();
		
//		WebElement slider = driver.findElement(By.xpath("//div[@role='slider']"));
//		Actions action = new Actions(driver);
//		Thread.sleep(2000);
//		action.moveToElement(slider).dragAndDropBy(slider, 864, 106).release().build().perform();
//		slider.click();
	    Actions b = new Actions(driver);
		//scroll down a page
		b.sendKeys(Keys.PAGE_DOWN).build().perform();
	//	Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='APPLY']")).click(); 
		
		driver.findElement(By.xpath("//button[text()='Search']")).click();
		
		driver.findElement(By.xpath("//button[text()='SKIP']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='close closeIcon']")).click();
		
		System.out.println("The current Page title is :"+driver.getTitle());


		
	}

}
