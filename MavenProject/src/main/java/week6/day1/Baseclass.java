package week6.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Baseclass {
	
	public RemoteWebDriver driver;
	
@Parameters	({"url","username","password","browser"})
@BeforeMethod
public void PreCondition( String url, String uName, String pWord, String browser) {
	// TODO Auto-generated method stub
	
	if(browser.equalsIgnoreCase("chrome")) {
		driver  = new ChromeDriver();
	}
	else if (browser.equalsIgnoreCase("EDGE")) {
		driver  = new EdgeDriver();
	}
	
	driver.manage().window().maximize();
	driver.get(url);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.findElement(By.id("username")).sendKeys(uName);
	driver.findElement(By.id("password")).sendKeys(pWord);
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.linkText("CRM/SFA")).click();
}
@AfterMethod
public void PostCondition() {
	// TODO Auto-generated method stub
	driver.close();
}

}
