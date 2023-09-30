package week6.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	public static void main(String[] args) {
		//load https://erail.in/ 
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://erail.in/");
		
		//Enter From Station and do keys.enter 
		driver.findElement(By.id("txtStationFrom")).clear();
		driver.findElement(By.id("txtStationFrom")).sendKeys("Chennai Egmore");
		driver.findElement(By.id("txtStationFrom")).sendKeys(Keys.ENTER);
		
		//Enter To station and press keys.Enter 
		driver.findElement(By.id("txtStationTo")).clear();
		driver.findElement(By.id("txtStationTo")).sendKeys("Kanniyakumari");
		driver.findElement(By.id("txtStationTo")).sendKeys(Keys.ENTER);
		
		//uncheck sortondate 
		driver.findElement(By.xpath("(//input[@type='checkbox'])[3]")).click();
		
		//get Train Names
		
		WebElement table = driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']"));
		
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		int rowsize = rows.size();
		System.out.println("no. Of Rows :"+rowsize);
		
		List<WebElement> columns = table.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']//td[2]"));
		int columnSize = columns.size();
		System.out.println("No. Of columns :"+columnSize);
		
		//Print train names
		System.out.println("The Train Names are:");
		for (WebElement each : columns) {
			System.out.println(each.getText());
			
		}
	
	}

}
