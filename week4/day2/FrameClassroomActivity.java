package week4.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameClassroomActivity {
	
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//click on try it - inside frame
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
		//handeling Alert
		Alert simpleAlert = driver.switchTo().alert();
		System.out.println("The message in Alert is: "+simpleAlert.getText());
		simpleAlert.accept();
		
		String text = driver.findElement(By.xpath("//p[text()='You pressed OK!']")).getText();
		
		if (text.contains("pressed OK")) {
			System.out.println("Validation passed - verified the texts");
		}
		else
		{
			System.out.println("Validation failed!!!");
		}
	}

}
