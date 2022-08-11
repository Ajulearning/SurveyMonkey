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
import junit.framework.Assert;

public class verifyLogInpageISdisplayed extends BaseClass {

	
	
	@Test
	public void logInpageTest() throws IOException {
		HomePage hp=new HomePage(driver);
		hp.clicklogIN();
		//capture title
		String title=driver.getTitle();
		//assert.assertEquals(title, ");
		System.out.println(title);
		capturescreen(driver, "logInpageTest");
		//Assert.assertEquals("SurveyMonkey - Log in",title,"Wrong application is opened");
		assertEquals(title,"SurveyMonkey - Log in","Wrong application is opened");
		//System.out.println("Survey Monkey login page is  Opened");
		logger.info("Survey Monkey login page is  Opened");
		
	}
}
	

