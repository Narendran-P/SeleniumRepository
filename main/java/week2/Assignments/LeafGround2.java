package week2.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LeafGround2 {
	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/select.xhtml");
		driver.manage().window().maximize();
		
		//Which is your favorite UI Automation tool?
		WebElement element = driver.findElement(By.className("ui-selectonemenu"));
		Select sec = new Select(element);
		sec.selectByIndex(1);
		
		//Choose your preferred country.

		WebElement element1 = driver.findElement(By.id("j_idt87:country"));
		Select sec1 = new Select(element1);
		sec.selectByVisibleText("India");
	}

	private static String Contains(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}
