package com.Surveymonkey.testCases;

import org.testng.annotations.Test;

import com.Surveymonkey.pageObjects.HomePage;
import com.Surveymonkey.pageObjects.LoginPage;
import com.Surveymonkey.testBase.BaseClass;

public class Enterusername extends BaseClass {

	@Test
	public void Usernamefieldtest() throws InterruptedException {
		HomePage hp=new HomePage(driver);
		hp.clicklogIN();
		LoginPage lp=new LoginPage(driver);
		//lp.EnterUsername("admin");
		
	}
}
