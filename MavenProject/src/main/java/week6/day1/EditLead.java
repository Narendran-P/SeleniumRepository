package week6.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EditLead extends Baseclass {

	@Test(dataProvider="EditInputData")
	public void main(String pNo, String cName) throws InterruptedException {
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(pNo);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.linkText("Edit")).click();
		WebElement companyName = driver.findElement(By.id("updateLeadForm_companyName"));
		companyName.clear();
		companyName.sendKeys(cName);
		driver.findElement(By.name("submitButton")).click();
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if (text.contains(cName)) {
			System.out.println(cName+"Lead is updated with Company name successfully");
		}
		else {
			System.out.println(cName+"Lead is not updated");
		}


	}
	
	@DataProvider(name="EditInputData")
	public String[][] sendData() {
		//      rowCount columnCount
		String[][] data = new String[3][2];
		//1st set of data
		data[0][0] = "99";
		data[0][1] = "TCS";
		//2nd set of data
		data[1][0] = "22";
		data[1][1] = "CTS";
		//3rd set of data
		data[2][0] = "12";
		data[2][1] = "Accenture";

		return data;
	}

}
