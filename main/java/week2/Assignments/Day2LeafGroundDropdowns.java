package week2.Assignments;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day2LeafGroundDropdowns {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://leafground.com/select.xhtml");
		driver.manage().window().maximize();
		
		//Which is your favorite UI Automation tool?
		WebElement element = driver.findElement(By.className("ui-selectonemenu"));
		Select sec = new Select(element);
		sec.selectByIndex(1);
		
		//Choose your preferred country.
		
		driver.findElement(By.xpath("//label[contains(@class,'ui-selectonemenu-label ui-inputfield')]")).click();
		//li[@data-label='India']
		driver.findElement(By.xpath("//li[@data-label='India']")).click();
		
		//Confirm Cities belongs to Country is loaded
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//label[contains(@class,'ui-selectonemenu-label ui-inputfield')])[2]")).click();
		Thread.sleep(2000);
		System.out.println("The first city loaded is: "+driver.findElement(By.xpath("//li[@data-label='Bengaluru']")).getText());
		System.out.println("The second city loaded is: "+driver.findElement(By.xpath("//li[@data-label='Chennai']")).getText());
		System.out.println("The third country loaded is: "+driver.findElement(By.xpath("//li[@id = 'j_idt87:city_3']")).getText());
	
		//Choose the Course
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='ui-autocomplete-dropdown ui-button ui-widget ui-state-default ui-corner-right ui-button-icon-only']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[contains(@data-item-label,'Selenium WebDriver')]")).click();
		
		//Choose language randomly
		Thread.sleep(2000);
		//WebElement element1 = driver.findElement(By.xpath("(//label[contains(@class,'ui-selectonemenu-label ui-inputfield')])[3]"));
		//Select sec1 = new Select(element1);
		//sec1.selectByIndex(2);
		driver.findElement(By.xpath("(//label[contains(@class,'ui-selectonemenu-label ui-inputfield')])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[text()='Tamil']")).click();
		
		//Select 'Two' irrespective of the language chosen
		Thread.sleep(2000);
		//WebElement element2 = driver.findElement(By.xpath("//select[@id='j_idt87:value_input']"));
		//Select sec2 = new Select(element2);
		//sec2.selectByIndex(1);
		driver.findElement(By.xpath("//label[@id='j_idt87:value_label']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//li[@class='ui-selectonemenu-item ui-selectonemenu-list-item ui-corner-all'])[12]")).click();
		
		//driver.close();
	
	}

	}
