package com.Surveymonkey.testCases;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Surveymonkey.pageObjects.DashboardPAge;
import com.Surveymonkey.pageObjects.HomePage;
import com.Surveymonkey.pageObjects.LoginPage;
import com.Surveymonkey.testBase.BaseClass;

public class verifyuserLoginTest extends BaseClass {

	
	@Test
	public void verifyuserLogin() throws InterruptedException, IOException {
		HomePage hp=new HomePage(driver);
		hp.clicklogIN();
		LoginPage lp=new LoginPage(driver);
		lp.EnterUsername("unajai93@gmail.com");
		lp.clickNextButton("next");
		lp.Enterpassword("Ajay1993@2022");
		lp.clickNextButton("login");

		DashboardPAge dp=new DashboardPAge(driver);
		boolean value= dp.checkdashboard();
		capturescreen(driver, "verifyuserLogin");
		Assert.assertEquals(value, true,"dashboard link is not displayed--user did not loggedIn");
		//System.out.println("dashboard link displayed");
		logger.info("dashboard link displayed");
	}
}
