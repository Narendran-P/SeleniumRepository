package week7.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class ActionsLearning {
	
	public static void main(String[] args) throws InterruptedException {
	     ChromeOptions options = new ChromeOptions();
	        options.addArguments("--disable-notifications");
	        ChromeDriver driver = new ChromeDriver(options);
	        driver.get("https://www.ajio.com/");
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	        WebElement menElement = driver.findElement(By.xpath("//a[text()='MEN']"));
	        Actions builder = new Actions(driver);
	        builder.moveToElement(menElement).perform();
	        Thread.sleep(5000);
	        driver.quit();
	}

}
