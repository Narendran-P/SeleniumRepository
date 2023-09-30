package pages;

import org.openqa.selenium.By;

import base.BaseClass;

public class MyLeadsPage extends BaseClass {
	
	public CreateLeadPage clickCreateLead() {
		// TODO Auto-generated method stub
		driver.findElement(By.linkText("Create Lead")).click();
		return new CreateLeadPage();
	}

}
