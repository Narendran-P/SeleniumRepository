package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import javax.swing.ListCellRenderer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassActivityList {
	
	public static void main(String[] args) {
	
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//Searching Mobiles
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobiles");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		
		//getting the mobile price
		List<WebElement> priceList = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		
		//size
		System.out.println(priceList.size());
		//print all the prices
		for (int i = 0; i < priceList.size(); i++) {
			String price = priceList.get(i).getText();
			System.out.println(price);
		}
		
		//print as list
		List<Integer> list = new ArrayList<>();
		for (WebElement each : priceList) {
			String text = each.getText();
			String replacedtext = text.replaceAll(",", "");
			int mobilePrice = Integer.parseInt(replacedtext);
			list.add(mobilePrice);
		}
		//sort
		Collections.sort(list);
		
		//print lowest price
		System.out.println("The loweset mobile price is"+list.get(0));
		
		
		//now removing the duplicates
		Set<Integer> unique = new TreeSet<>(list);
		if (list.size() != unique.size()) {
			System.out.println("No Duplicates");
		}
		else
		{
			System.out.println("Duplicates Present");
		}
			
		

	}
	
	

}
