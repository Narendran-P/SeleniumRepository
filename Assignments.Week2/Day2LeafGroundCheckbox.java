package week2.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2LeafGroundCheckbox {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/checkbox.xhtml");
		//Basic Checkbox
		driver.findElement(By.xpath("//span[text()='Basic']/parent::div")).click();
		
		//Notification
		driver.findElement(By.xpath("(//span[text()='Ajax']/preceding-sibling::div)[2]")).click();
		
		//Choose your favorite language(s)
		driver.findElement(By.xpath("//label[text()='Java']/preceding::div[1]")).click();
		driver.findElement(By.xpath("//label[text()='Python']/preceding::div[1]")).click();
		driver.findElement(By.xpath("//label[text()='Javascript']/preceding::div[1]")).click();

		//Tri State Checkbox
		driver.findElement(By.xpath("(//div[@class='ui-chkbox ui-widget'])[6]/div[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='ui-chkbox ui-widget'])[6]/div[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='ui-chkbox ui-widget'])[6]/div[2]")).click();

		//toggle switch
		driver.findElement(By.className("ui-toggleswitch-slider")).click();
		
		//Verify if check box is disabled
		System.out.println("The checkbox is disabled: "+ driver.findElement(By.xpath("(//div[@class='ui-selectbooleancheckbox ui-chkbox ui-widget'])[3]/div[2]")).isEnabled());

		//Select Multiple
		driver.findElement(By.xpath("(//div[@class='card'])[7]//ul")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//label[text()='Miami'])[2]/preceding::div[1]")).click();
		driver.findElement(By.xpath("(//label[text()='London'])[2]/preceding::div[1]")).click();
		driver.findElement(By.xpath("(//label[text()='Paris'])[2]/preceding::div[1]")).click();
		driver.findElement(By.xpath("(//label[text()='Istanbul'])[2]/preceding::div[1]")).click();

	}

}
