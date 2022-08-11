package com.Surveymonkey.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPAge {

	
	

	public WebDriver driver;
	
	public DashboardPAge(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);}
	@FindBy(linkText="Dashboard")
	WebElement dashlink;
	
	public boolean checkdashboard() {
		boolean status =dashlink.isDisplayed();
		System.out.println(status);
		return status;
	}
	
}
