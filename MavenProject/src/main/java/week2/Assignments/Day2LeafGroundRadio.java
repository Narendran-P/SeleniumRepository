package week2.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2LeafGroundRadio {
	
	public static void main(String[] args) throws InterruptedException {
		
	  ChromeDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.leafground.com/radio.xhtml");
	  
	  //Your most favorite browser
	  driver.findElement(By.xpath("(//label[text()='Chrome']/preceding::div)[163]")).click();
	  
	  //UnSelectable
	  WebElement element1 = driver.findElement(By.xpath("//label[text()='Chennai']/preceding::span[1]"));
	  element1.click();
	  if ((element1.getAttribute("Class")).contains("icon-bullet"))
	  {
		  System.out.println("The radiobutton Chennai is selected.");
	  }
	  WebElement element2 = driver.findElement(By.xpath("//label[text()='Bengaluru']/preceding::span[1]"));
	  if ((element2.getAttribute("Class")).contains("icon-bullet"))
	  {
		  System.out.println("The radiobutton Bangaluru is selected.");
	  }
	  else {
		  System.out.println("The radiobutton Bangaluru is not selected.");
	  }
	  
	  //Find the default select radio button
	  WebElement element4 = driver.findElement(By.xpath("(//label[text()='Safari'])[2]/preceding::div[1]"));
	  if ((element4.getAttribute("Class")).contains("state-active"))	  {
		  System.out.println("The radiobutton Safari is selected.");
	  }
	  else {
		  System.out.println("The radiobutton Safari is not selected.");
	  }
	  
	  //Select the age group (only if not selected)
	  WebElement element5 = driver.findElement(By.xpath("(//label[text()='1-20 Years']/preceding::div)[207]"));
	  if ((element5.getAttribute("Class")).contains("state-default"))	  
	  {
		  System.out.println("The radiobutton on Age 1-20 is not selected.");
	  }	  
		  element5.click();
		  Thread.sleep(2000);
		  WebElement element6 = driver.findElement(By.xpath("(//label[text()='1-20 Years']/preceding::div)[207]"));
		  if ((element6.getAttribute("Class")).contains("state-active"))	
		  {
		  System.out.println("The radiobutton on Age 1-20 is now selected.");
	  }
	  else
	  {
		  System.out.println("The radio button is not yet selected");
	  }

	}

}
