package com.Surveymonkey.pageObjects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	
	public WebDriver driver;
	
	public LoginPage(WebDriver driver) throws InterruptedException
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		/*driver.manage().deleteAllCookies();
		driver.findElement(By.id("onetrust-accept-btn-handler")).click();
		Thread.sleep(1000);
		WebElement ele=driver.findElement(By.id("username"));
		System.out.println(ele);
		ele.sendKeys("admin");*/
}
	@FindBy(id="username")
	WebElement uname;
	public void EnterUsername(String username) throws InterruptedException {
		 
		
		boolean status=uname.isEnabled();
		System.out.println(status);
		driver.findElement(By.id("onetrust-accept-btn-handler")).click();
	//	driver.findElement(By.id("username")).sendKeys("admin");
		uname.clear();
		uname.sendKeys(username);
		String uservalue=paswd.getAttribute("value");
		System.out.println("username eneterd as"+uservalue);}
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	WebElement buttonnext;
	
	public void clickNextButton(String Buttonname) throws InterruptedException {
		if (Buttonname.equalsIgnoreCase("next")) {
			buttonnext.click();
			System.out.println("clicked on Next button");
		} else if(Buttonname.equalsIgnoreCase("LogIN")) {
			 buttonnext.click();
             System.out.println("clicked on login button");}
             else {
            	 System.out.println("Wrong button name passed");
             }
		}
		
	

		@FindBy(id="password")
		WebElement paswd;
		public void Enterpassword(String password) throws InterruptedException {
			
			boolean status=paswd.isEnabled();
			System.out.println(status);
			paswd.clear();
		    paswd.sendKeys(password);
		    String pasvalue=paswd.getAttribute("value");
			System.out.println("password eneterd as"+pasvalue);
	}	
}
