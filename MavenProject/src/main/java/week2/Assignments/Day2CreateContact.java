package week2.Assignments;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day2CreateContact {
	
public static void main(String[] args) {
		
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
 
//		 * 1. Launch URL "http://leaftaps.com/opentaps/control/login"
	driver.get("http://leaftaps.com/opentaps/control/main");

//		 * 2. Enter UserName and Password Using Id Locator
	driver.findElement(By.id("username")).sendKeys("demoSalesManager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	
//		 * 3. Click on Login Button using Class Locator
	driver.findElement(By.className("decorativeSubmit")).click();

//		 * 4. Click on CRM/SFA Link
	driver.findElement(By.partialLinkText("CRM/SFA")).click();

//		 * 5. Click on contacts Button
	driver.findElement(By.xpath("//a[text()='Contacts']")).click();

//		 * 6. Click on Create Contact
	driver.findElement(By.xpath("//a[text()='Create Contact']")).click();

//		 * 7. Enter FirstName Field Using id Locator
	driver.findElement(By.id("firstNameField")).sendKeys("Narendran");

//		 * 8. Enter LastName Field Using id Locator
	driver.findElement(By.id("lastNameField")).sendKeys("P");

//		 * 9. Enter FirstName(Local) Field Using id Locator
	driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Naren");

//		 * 10. Enter LastName(Local) Field Using id Locator
	driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("NP");

//		 * 11. Enter Department Field Using any Locator of Your Choice
	driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Selenium");

//		 * 12. Enter Description Field Using any Locator of your choice 
	driver.findElement(By.id("createContactForm_description")).sendKeys("Description of the COntact");

//		 * 13. Enter your email in the E-mail address Field using the locator of your choice
	driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("narenderp94@yahoo.in");

//		 * 14. Select State/Province as NewYork Using Visible Text
	WebElement element = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
	Select sec = new Select(element);
	sec.selectByIndex(8);

//		 * 15. Click on Create Contact
	driver.findElement(By.xpath("//input[@name='submitButton']")).click();

//		 * 16. Click on edit button 
	driver.findElement(By.xpath("//a[text()='Edit']")).click();

//		 * 17. Clear the Description Field using .clear
	driver.findElement(By.id("updateContactForm_description")).clear();
	
//		 * 18. Fill ImportantNote Field with Any text
	driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Important note");

//		 * 19. Click on update button using Xpath locator
	driver.findElement(By.xpath("//input[@name='submitButton']")).click();

//		 * 20. Get the Title of Resulting Page.
	System.out.println("The title of resulting page is: "+driver.getTitle());

		driver.close();
	}

}
