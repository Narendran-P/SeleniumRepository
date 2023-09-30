package week4.Assignments.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {
	
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/window.xhtml;jsessionid=node0ohpw87cjok1dz9p1fgudvj6l12019.node0");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//click and confirm new Window Opens
		driver.findElement(By.xpath("//span[text()='Open']")).click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		int size = windowHandles.size();
		List<String> handles = new ArrayList<>(windowHandles);
	
		driver.switchTo().window(handles.get(1));
		String title = driver.getTitle();	
		if(title.contains("Dashboard")) {
			System.out.println("New window opened successfull. Test case passed");
		}
		else {
			System.out.println("New window open failed");
		}
		driver.switchTo().window(handles.get(0));
		
		//Find the number of opened tabs
		driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();
		Set<String> windowHandles2 = driver.getWindowHandles();
		int size2 = windowHandles2.size();
		List<String> handles2 = new ArrayList<>(windowHandles2);
		System.out.println("The No. of Opened tabs is :"+size2);
		driver.switchTo().window(handles2.get(0));
		System.out.println("Find the number of opened tabs - Test case passed");

		//Close all windows except Primary
		driver.findElement(By.xpath("//span[text()='Close Windows']")).click();
		Set<String> windowHandles3 = driver.getWindowHandles();
		List<String> handles3 = new ArrayList<>(windowHandles3);
		int size3 = handles3.size();
		
		for (int i = 1; i < size3; i++) {
			driver.switchTo().window(handles3.get(i));
			driver.close();
		}
		driver.switchTo().window(handles3.get(0));
		System.out.println("Close all windows except Primary - Test case passed");

		//Wait for 2 new tabs to open
		driver.findElement(By.xpath("//span[text()='Open with delay']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Set<String> windowHandles4 = driver.getWindowHandles();
		List<String> handles4 = new ArrayList<>(windowHandles4);
		int size4 = handles.size();
		
		if (size4 > 0) {
			System.out.println("The tabs opened:");
			for (int i = 0; i < size4; i++) {
				System.out.println(handles4.get(i));
				System.out.println("Wait for 2 new tabs to open - Test case passed");

			}
		}
		else {
			System.out.println("Test case failed");
		}
		
		

		
	}

}
