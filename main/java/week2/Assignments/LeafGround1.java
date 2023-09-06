package week2.Assignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LeafGround1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		//instantiate ChromeDriver and open URL
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/button.xhtml");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		//Click and Confirm title.
		driver.findElement(By.name("j_idt88:j_idt90")).click();
		System.out.println("The Title is : "+driver.getTitle());
		//navigate back to home page
		driver.navigate().back();
		
		//Confirm if the button is disabled.
		System.out.println("Is button enabled :"+driver.findElement(By.name("j_idt88:j_idt92")).isEnabled());

		//Find the position of the Submit button
		System.out.println("The Location of Submit Button is :"+driver.findElement(By.name("j_idt88:j_idt94")).getLocation());
		
		//Find the Save button color
		System.out.println("The Save button color is :"+driver.findElement(By.name("j_idt88:j_idt96")).getCssValue("background"));
		
		//Find the height and width of this button

		WebElement button1 = driver.findElement(By.name("j_idt88:j_idt98"));
		System.out.println("The height and width of Submit button is :"+button1.getSize());
		
		//Mouse over and confirm the color changed
		WebElement button2 = driver.findElement(By.name("j_idt88:j_idt100"));
		String color1 = button2.getCssValue("background-color");
		
		System.out.println("By default color of Success button is :"+color1);

		Actions actions = new Actions(driver);
		actions.moveToElement(button2).build().perform();

		if (button2.getCssValue("background-color")!=color1)
		{
			System.out.println("On mouse hover, the color changed on Success button :"+button2.getCssValue("background-color"));
		}
		else {
			System.out.println("color not changed on mouse hover");
		}
		
		//How many rounded buttons are there?
		List <WebElement> buttons4 = driver.findElements(By.tagName("button"));
		int j = buttons4.size();
		System.out.println("The total number of buttons in web page is: "+j);
		int q=0;
		int w = 0;
		
		for(int i=0;i<buttons4.size();i++){
		 //   System.out.println(buttons4.get(i).getCssValue("border-radius"));
		    if ( buttons4.get(i).getCssValue("border-radius").contains("28"))
		    {
		    	q = w + 1;
				w = q;
		    }
		} 
	    System.out.println("The count of rounded buttons in web page is :"+q);
	   
		//Click Image Button and Click on any hidden button

	    driver.findElement(By.name("j_idt88:j_idt102:imageBtn")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.name("j_idt88:j_idt102:imageBtn")).click();
    	System.out.println(driver.findElement(By.name("j_idt88:j_idt108")).isDisplayed());
    	driver.findElement(By.name("j_idt88:j_idt108")).click();
	    Thread.sleep(5000);

	    //closing the driver
	    driver.close();
		
	}

}