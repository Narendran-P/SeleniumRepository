package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerificationScriptBrowserAndElements {
	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		
	    //getTitle
		System.out.println("The title is "+driver.getTitle() );
		//verification
		if (driver.getTitle().contains("TestLeaf")) {
			System.out.println("The tile has testleaf");
		}
		else
			System.out.println("The title does not has testleaf");
		//getCurrentURL
		System.out.println("The current URL is "+driver.getCurrentUrl());
		//getSourcecode
		System.out.println("The Page Source is "+driver.getPageSource());
		
		//Elements verification
		//get Attribute
		System.out.println("The Attribute is "+driver.findElement(By.id("username")).getAttribute("size"));
	
		//css
		System.out.println("The color is "+driver.findElement(By.className("decorativeSubmit")).getCssValue("background-color"));

		//getText
		System.out.println("The text is "+driver.findElement(By.className("decorativeSubmit")).getText());

       //getLocation
		System.out.println("The location is "+driver.findElement(By.className("decorativeSubmit")).getLocation());
		System.out.println("The location is "+driver.findElement(By.className("decorativeSubmit")).getLocation().getX());
		System.out.println("The location is "+driver.findElement(By.className("decorativeSubmit")).getLocation().getY());

		//getSize
		System.out.println("The Size is "+driver.findElement(By.className("decorativeSubmit")).getSize());
		System.out.println("The Size is "+driver.findElement(By.className("decorativeSubmit")).getSize().getWidth());
		System.out.println("The Size is "+driver.findElement(By.className("decorativeSubmit")).getSize().getHeight());

		//getTagName
		System.out.println("The TagName is "+driver.findElement(By.className("decorativeSubmit")).getTagName());

		//isdisplayed
		System.out.println("The element displayed: "+driver.findElement(By.className("decorativeSubmit")).isDisplayed());
		//System.out.println("The element displayed: "+driver.findElement(By.className("decorativeSubmit1")).isDisplayed());

		//isenabled
		System.out.println("The Attribute is enabled: "+driver.findElement(By.id("username")).isEnabled());

		//ischecked
		//System.out.println("The Attribute is checked: "+driver.findElement(By.id("username")).isSelected());
	driver.close();
	}
	

}
