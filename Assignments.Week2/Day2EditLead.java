package week2.Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2EditLead {
	
	public static void main(String[] args) throws InterruptedException {
		
//		    http://leaftaps.com/opentaps/control/main
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
//			* 1	Launch the browser
		driver.get("http://leaftaps.com/opentaps/control/main");
		
//			* 2	Enter the username
//			* 3	Enter the password
//			* 4	Click Login
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
//			* 5	Click crm/sfa link
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		
//			* 6	Click Leads link
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		
//			* 7	Click Find leads
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		
//			* 8	Enter first name
		driver.findElement(By.name("firstName")).sendKeys("A");
		
//			* 9	Click Find leads button
		driver.findElement(By.linkText("Find Leads")).click();
		
//			* 10 Click on first resulting lead
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).click();
		
//			* 11 Verify title of the page
		String title1 = driver.getTitle();
		if (title1.contains("View"))
		{
			System.out.println("The tile is as expected: "+title1);
		}
		else {
			System.out.println("The is not as expected - Fail");
		}
		
//			* 12 Click Edit
		driver.findElement(By.linkText("Edit")).click();
		
//			* 13 Change the company name
		String updateName = "TestLeaf Company";
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(updateName);
		
//			* 14 Click Update
		driver.findElement(By.name("submitButton")).click();
		
//			* 15 Confirm the changed name appears
		String name = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if (name.contains("TestLeaf"))
		{
			System.out.println("The Name Change is success");
		}
		else {
			System.out.println("Name Change Failed!!!");
		}
		
//			* 16 Close the browser (Do not log out)
		driver.close();

	}

}
