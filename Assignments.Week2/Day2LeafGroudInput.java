package week2.Assignments;

import java.util.concurrent.TimeUnit;
import java.lang.StringBuilder;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2LeafGroudInput {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
//		    https://www.leafground.com/input.xhtml
		driver.get("https://www.leafground.com/input.xhtml");
		
//			1. Type your name
		driver.findElement(By.name("j_idt88:name")).sendKeys("Narendran P");
		
//			2. Append Country to this City
		String country1 = "INDIA";
		driver.findElement(By.xpath("(//div[@class='col-12']/input)[2]")).sendKeys(country1);
		
//			3. Verify if text box is disabled
		System.out.println("THe field is disabled: "+driver.findElement(By.xpath("(//div[@class='col-12']/input)[3]")).isEnabled());
		
//			4. Clear the typed text
		driver.findElement(By.xpath("(//div[@class='col-12']/input)[4]")).clear();
		
//			5. Retrieve the typed text
		System.out.println("The Type text is: "+driver.findElement(By.xpath("(//div[@class='col-12']/input)[5]")).getAttribute("value"));

//			6. Type email and Tab. Confirm control moved to next element
		driver.findElement(By.xpath("(//div[@class='col-12']/input)[6]")).sendKeys("Naren@testleaf.com"+Keys.TAB);
		
//			7. Type about yourself
		driver.findElement(By.xpath("(//div[@class='col-12']/textarea)")).sendKeys("My Name is Narendran. I have enrolled for Selenium course in Test Leaf");

//			8. Text Editor
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class='ql-editor ql-blank']/p)[1]")).sendKeys("Text Editor");
		
//			9. Just Press Enter and confirm error message*
	//	driver.findElement(By.xpath("//div[@class='col-12 mb-2 lg:col-8']/input")).click();
		driver.findElement(By.xpath("//div[@class='col-12 mb-2 lg:col-8']/input")).sendKeys(Keys.ENTER);
		
		if((driver.findElement(By.xpath("//span[text()='Age is mandatory']")).getText()).contains("Mandatory"));
		{
			System.out.println("On pressing Enter - Error displayed");
		}
		//driver.navigate().back();
		
//			10. Click and Confirm Label Position Changes
		int locX1 = driver.findElement(By.xpath("//span[@class='ui-float-label']/label")).getLocation().getX();
		int locY1 = driver.findElement(By.xpath("//span[@class='ui-float-label']/label")).getLocation().getY();
		System.out.println("The initial location is: "+driver.findElement(By.xpath("//span[@class='ui-float-label']/label")).getLocation());
		Thread.sleep(2000);
		driver.findElement(By.name("j_idt106:float-input")).click();
		Thread.sleep(2000);
		int locX2 = driver.findElement(By.xpath("//span[@class='ui-float-label']/label")).getLocation().getX();
		int locY2 = driver.findElement(By.xpath("//span[@class='ui-float-label']/label")).getLocation().getY();
		System.out.println("The current location is: "+driver.findElement(By.xpath("//span[@class='ui-float-label']/label")).getLocation());
		
		if ((locX1 != locX2) && (locY1 != locY2))
				{
			System.out.println("The lable position changed as expected");
				}
		else {
			System.out.println("The lable position unchanged - Fail");
		}
		
//			11. Type your name and choose the third option
		
		driver.findElement(By.name("j_idt106:auto-complete_input")).sendKeys("Narendran.P");
		driver.findElement(By.xpath("//button[@class='ui-autocomplete-dropdown ui-button ui-widget ui-state-default ui-corner-right ui-button-icon-only']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@class='ui-autocomplete-item ui-autocomplete-list-item ui-corner-all ui-state-highlight']")).click();
		
//			12. Click and Confirm Keyboard appears
		driver.findElement(By.xpath("//input[@class='ui-inputfield ui-keyboard-input ui-widget ui-state-default ui-corner-all is-keypad']")).click();
		Thread.sleep(2000);
		System.out.println("on click, Keyboard displayed - Success: "+driver.findElement(By.xpath("//div[@class='ui-widget ui-widget-content ui-corner-all ui-shadow keypad-popup ui-input-overlay']")).isDisplayed());
	

//			13. Custom Toolbar
		
		driver.findElement(By.xpath("(//div[@class='ql-editor ql-blank']/p)[2]")).sendKeys("Custom Toolbar text");
	}

}
