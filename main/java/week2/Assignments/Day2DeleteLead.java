package week2.Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2DeleteLead {
	
	public static void main(String[] args) throws InterruptedException {
		

//		http://leaftaps.com/opentaps/control/main
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
//		Delete Lead:
//		1	Launch the browser
		driver.get("http://leaftaps.com/opentaps/control/login");

//		2	Enter the username
//		3	Enter the password
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
//		4	Click Login
		driver.findElement(By.className("decorativeSubmit")).click();
		
//		5	Click crm/sfa link
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		
//		6	Click Leads link
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		
//		7	Click Find leads
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		
//		8	Click on Phone
		driver.findElement(By.linkText("Phone")).click();
		
//		9	Enter phone number
		//driver.findElement(By.xpath("//input[@name='phoneCountryCode']")).sendKeys("1");
		driver.findElement(By.xpath("//input[@name='phoneAreaCode']")).sendKeys("1");
		//driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("1");

//		10	Click find leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
//		11	Capture lead ID of First Resulting lead
		Thread.sleep(4000);
		String leadselected = driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).getText();
		System.out.println("The lead ID of first resulting Lead is: "+leadselected);
		
//		12	Click First Resulting lead
		driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).click();
		
//		13	Click Delete
		driver.findElement(By.xpath("//a[text()='Delete']")).click();
		
//		14	Click Find leads
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		
//		15	Enter captured lead ID
		driver.findElement(By.name("id")).sendKeys(leadselected);
		
//		16	Click find leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
//		17	Verify message "No records to display" in the Lead List. This message confirms the successful deletion
		String deletemsg = driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
		if (deletemsg.contains("No"))
		{
			System.out.println("The delete of the lead is successful.");
		}
		else
		{
			System.out.println("The delete is unsuccessful.");
		}
//		18	Close the browser (Do not log out)
		driver.close();
	}


}
