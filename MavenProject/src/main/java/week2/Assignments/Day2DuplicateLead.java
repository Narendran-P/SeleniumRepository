package week2.Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2DuplicateLead {
	
	public static void main(String[] args) throws InterruptedException {
		
//			http://leaftaps.com/opentaps/control/main
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

//			1	Launch the browser
		driver.get("http://leaftaps.com/opentaps/control/main");

//			2	Enter the username
//			3	Enter the password
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
//			4	Click Login
		driver.findElement(By.className("decorativeSubmit")).click();
		
//			5	Click crm/sfa link
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		
//			6	Click Leads link
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		
//			7	Click Find leads
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		
//			8	Click on Email
		driver.findElement(By.linkText("Email")).click();
		
//			9	Enter Email
		driver.findElement(By.name("emailAddress")).sendKeys("@");
		
//			10	Click find leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
//			11	Capture name of First Resulting lead
		Thread.sleep(4000);
		String leadFirstName= driver.findElement(By.xpath("(//a[@class='linktext'])[6]")).getText();
		System.out.println("The first name of the 1st resulting Lead is: "+leadFirstName);
		String leadLasttame = driver.findElement(By.xpath("(//a[@class='linktext'])[7]")).getText();
		System.out.println("The last name of the 1st resulting Lead is: "+leadLasttame);

//			12	Click First Resulting lead
		driver.findElement(By.xpath("(//a[@class='linktext'])[6]")).click();
		
//			13	Click Duplicate Lead
		driver.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();
		
//			14	Verify the title as 'Duplicate Lead'
		String pageTitle = driver.getTitle();
		if (pageTitle.contains("Duplicate"))
		{
			System.out.println("The page title is as expected: "+pageTitle);
		}
		
//			15	Click Create Lead
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		
//			16	Confirm the duplicated lead name is same as captured name
		String leadFirstName1 = driver.findElement(By.xpath("(//span[@class='tabletext'])[4]")).getText();
		System.out.println("The first name of the Duplicated Lead is: "+leadFirstName1);

		String leadLasttame1 = driver.findElement(By.xpath("(//span[@class='tabletext'])[5]")).getText();
		System.out.println("The first name of the DuplicatedLead is: "+leadLasttame1);

		if ((leadFirstName.equals(leadFirstName1)) && (leadLasttame.equals(leadLasttame1)))
				{
			System.out.println("The duplicated name is same as Captured Name");
				}
		else {
			System.out.println("Incorrect Duplicated record");

		}

//			17	Close the browser (Do not log out)
		driver.close();
	}

}
