package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandelingClassRoom {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//click on Flights
		driver.findElement(By.xpath("//span[@class='allcircle circleone']")).click();
		
		//get the window handle
		String pWindow = driver.getWindowHandle();
		System.out.println("The Parent Window Title is: "+pWindow);
		
		//to get all window handles
		Set<String> windowsAll = driver.getWindowHandles();
		
		//to switch to a particular index
		List<String> handles1 = new ArrayList<>(windowsAll);
		
		driver.switchTo().window(handles1.get(1));
		String cTitle = driver.getTitle();	
		System.out.println("The title of child window is: "+cTitle);
		
		if (cTitle.contains("Air Ticket Booking")) {
			System.out.println("The title of child window is correct");
		}
		else {
			System.out.println("Validation failed");
		}
		
		driver.close();
		driver.switchTo().window(handles1.get(0));
		System.out.println("The current Title is: "+driver.getTitle());
		Thread.sleep(3000);
		driver.quit();
	}

}
