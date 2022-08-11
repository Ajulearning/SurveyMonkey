package com.Surveymonkey.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class HomePage {

	
	//1.declare driver globally
	public WebDriver driver;
	//2.create a constructor
	public HomePage(WebDriver driver)
	{
		this.driver=driver;//storing local driver passed from testcase to gobal driver using this keyword
		
		PageFactory.initElements(driver, this);//initialising all the elements in page 
	}
	
	//3.Creating locators
	@FindBy(linkText="Log in")
	WebElement lnklogin;
	@FindBy(linkText="Sign up free")
	WebElement lnkbutton;
	
	//4.write a method to click on LOg In
	public void clicklogIN() {
		lnklogin.click();
		System.out.println("Clicked on LogIn link");
	}
	
	public boolean VerifySignUpbutton() {
		boolean status=lnkbutton.isDisplayed();
		System.out.println(status);
		return status;
		
	}
	
}
