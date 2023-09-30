package week4.Assignments.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.jar.asm.Handle;

public class MergeContact {
	
	/*
	 * //Pseudo Code
	 * 1. Launch URL "http://leaftaps.com/opentaps/control/login"
	 * 2. Enter UserName and Password Using Id Locator
	 * 3. Click on Login Button using Class Locator
	 * 4. Click on CRM/SFA Link
	 * 5. Click on contacts Button
	 * 6. Click on Merge Contacts using Xpath Locator
	 * 7. Click on Widget of From Contact
	 * 8. Click on First Resulting Contact
	 * 9. Click on Widget of To Contact
	 * 10. Click on Second Resulting Contact
	 * 11. Click on Merge button using Xpath Locator
	 * 12. Accept the Alert
	 * 13. Verify the title of the page
	 */
	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
		
		Set<String> allWindows = driver.getWindowHandles();
		List<String> handles = new ArrayList<>(allWindows);
		driver.switchTo().window(handles.get(1));
		driver.findElement(By.xpath("//div[text()='Contact ID']/following::a[@class='linktext']")).click();
		driver.switchTo().window(handles.get(0));

		
		driver.findElement(By.xpath("(//img[@alt=\"Lookup\"])[2]")).click();
		Set<String> allWindows1 = driver.getWindowHandles();
		List<String> handles1 = new ArrayList<>(allWindows1);
		driver.switchTo().window(handles1.get(1));
		driver.findElement(By.xpath("//div[text()='Contact ID']/following::a[@class='linktext'][6]")).click();
		driver.switchTo().window(handles1.get(0));
		
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		
		driver.switchTo().alert().accept();
		
		String Result = driver.getTitle();
		
		if(Result.contains("View Contact")) {
			System.out.println("Title is as expected and Merge Cotact is successful :"+Result);
		}
		else {
			System.out.println("Validation failed");
		}
		
		driver.close();
		
	}
	

}
