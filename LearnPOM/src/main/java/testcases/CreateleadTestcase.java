package testcases;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class CreateleadTestcase extends BaseClass {
	
	@Test
	public void CreateLead () {
		
		LoginPage lp = new LoginPage();
		lp.enterUserName()
		.enterpassword()
		.clickLoginButton()
		.clickCRMSFA()
		.clickLead()
		.clickCreateLead()
		.companyName()
		.firstName()
		.lastName()
		.clickonSubmit()
		.verifylead();
		
	}

}
