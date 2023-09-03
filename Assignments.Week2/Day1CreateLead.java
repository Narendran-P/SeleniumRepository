package week2.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day1CreateLead {
	
	public static void main(String[] args) {
		//instantiate driver & load the url
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		
		//Entering Username and password ; click on login button using class
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//click on CRM/SFA link; click on Leads button; click on Create lead
		driver.findElement(By.partialLinkText("SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.partialLinkText("Create")).click();
		
//		Enter CompanyName Field Using id Locator
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeafNaren");
		
//		Enter FirstName Field Using id Locator
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Narendran");
		
//		Enter LastName Field Using id Locator
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("P");
		
//		Enter FirstName(Local) Field Using id Locator
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Naren");
		
//		Enter Department Field Using any Locator of Your Choice
		driver.findElement(By.name("departmentName")).sendKeys("Selenium");
		
//		Enter Description Field Using any Locator of your choice 
		driver.findElement(By.name("description")).sendKeys("Description of the user ID");
		
//		Enter your email in the E-mail address Field using the locator of your choice
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("narenderp94@yahoo.in");
		
//		Select State/Province as NewYork Using Visible Text
		WebElement dropdown = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select sec = new Select(dropdown);
		sec.selectByVisibleText("Delaware");
		
//		Click on Create Button
		driver.findElement(By.name("submitButton")).click();
		
//      Get the Title of Resulting Page. refer the video  using driver.getTitle()
		System.out.println("Tile of resulting page is: "+driver.getTitle());

		//close the driver
		driver.close();
		
	}

}
