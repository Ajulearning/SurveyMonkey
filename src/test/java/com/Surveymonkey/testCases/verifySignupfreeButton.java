package com.Surveymonkey.testCases;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Surveymonkey.pageObjects.HomePage;
import com.Surveymonkey.testBase.BaseClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class verifySignupfreeButton extends BaseClass{
	
	
	@Test
	public void signupfreebuttonTest() throws IOException {
		HomePage hp=new HomePage(driver);
		boolean stat=hp.VerifySignUpbutton();
		capturescreen(driver, "signupfreebuttonTest");
		assertEquals(stat, true,"SignUP FREE BUtton IS not Displayed");
		//System.out.println("SignUp free Button is Displayed");
		logger.info("SignUp free Button is Displayed");
	}
	
	
}
