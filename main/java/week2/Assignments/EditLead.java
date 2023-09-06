package week2.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) {
		//instantiate the driver and launch the url
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		
//		  2. Enter UserName and Password Using Id Locator
//		  3. Click on Login Button using Class Locator
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
//		  4. Click on CRM/SFA Link
		driver.findElement(By.partialLinkText("SFA")).click();
		
//		  5. Click on Leads Button
		driver.findElement(By.linkText("Leads")).click();
		
//		  6. Click on Create Lead 
		driver.findElement(By.partialLinkText("Create")).click();
		
//		  7. Enter CompanyName Field Using id Locator
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Test_Leaf");
		
//		  8. Enter FirstName Field Using id Locator
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Narendran");
		
//		  9. Enter LastName Field Using id Locator
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("P");
		
//		  10. Enter FirstName(Local) Field Using id Locator
		driver.findElement(By.name("firstNameLocal")).sendKeys("naren");
		
//		  11. Enter Department Field Using any Locator of Your Choice
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Selenium");
		
//		  12. Enter Description Field Using any Locator of your choice 
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Description of the lead");
		
//		  13. Enter your email in the E-mail address Field using the locator of your choice
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("narenderp94@yahoo.in");
		
//		  14. Select State/Province as NewYork Using Visible Text
		WebElement dropdown = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select sec = new Select(dropdown);
		sec.selectByIndex(4);
			
//		  15. Click on Create Button
		driver.findElement(By.name("submitButton")).click();
		
//        16. Click on edit button;
		driver.findElement(By.linkText("Edit")).click();
		
//        17. Clear the Description Field using .clear()
		driver.findElement(By.id("updateLeadForm_description")).clear();
		
//		  18. Fill ImportantNote Field with Any text
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Important note to be noted fot the lead Naren");
		
//		  19. Click on update button 
		driver.findElement(By.name("submitButton")).click();
		
//		  20. Get the Title of Resulting Page. refer the video  using driver.getTitle()
		System.out.println("Title of Resultimt Page is: "+driver.getTitle());
		
		//closing the driver
		driver.close();
		
	}
}
