package pages;

import org.openqa.selenium.By;

import base.BaseClass;

public class ViewLeadPage extends BaseClass {
	
	public ViewLeadPage verifylead() {
		// TODO Auto-generated method stub

		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if (text.contains("Testleaf")) {
			System.out.println("Lead created successfully");
		}
		else {
			System.out.println("Lead is not created");
		}
		driver.close();
		
		return this;
	}
	

}
