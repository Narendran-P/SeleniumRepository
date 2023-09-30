package pages;

import org.openqa.selenium.By;

import base.BaseClass;

public class CreateLeadPage extends BaseClass {
	
	public CreateLeadPage companyName() {
		// TODO Auto-generated method stub
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		return this;
	}
	
	public CreateLeadPage firstName() {
		// TODO Auto-generated method stub
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Subraja");
		return this;
	}
	
	public CreateLeadPage lastName() {
		// TODO Auto-generated method stub
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Subi");
		return this;
	}
	
	public ViewLeadPage clickonSubmit() {
		// TODO Auto-generated method stub
		driver.findElement(By.name("submitButton")).click();
		return new ViewLeadPage();
	}
	
	
	

}
