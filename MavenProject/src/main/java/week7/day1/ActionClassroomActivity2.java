package week7.day1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassroomActivity2 {
	
	public static void main(String[] args) throws IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.amazon.in/");
		WebElement element = driver.findElement(By.xpath("//span[contains(text(),'1996')]"));
		
		Actions build = new Actions(driver);
		build.scrollToElement(element).perform();
		
		//Screenshot.
		File screenshotAs = driver.getScreenshotAs(OutputType.FILE);
		File DestFile = new File("./Snap/Screenshot.png");
		FileUtils.copyFile(screenshotAs, DestFile);
		
		driver.quit();
		
		
	}

}
