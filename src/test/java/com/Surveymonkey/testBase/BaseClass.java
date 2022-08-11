package com.Surveymonkey.testBase;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FilenameUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.apache.logging.log4j.core.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
public WebDriver driver;
public Properties prop;
//write code for incorporate changes of log4jcore
public org.apache.logging.log4j.Logger logger=LogManager.getLogger(this.getClass());
	
	@BeforeClass
	@Parameters("browsername")
	public void setup(String br) throws IOException {
		prop=new Properties();
        FileInputStream fis=new FileInputStream("E:\\Training\\Selenium\\SurveyMonkey\\resources\\config.Properties");
        prop.load(fis);
        if (br.equalsIgnoreCase("chrome")) {
        	WebDriverManager.chromedriver().setup();
    		driver=new ChromeDriver();
        	
		} else if(br.equalsIgnoreCase("firefox"))
		{   WebDriverManager.firefoxdriver().setup();
		    driver=new FirefoxDriver();
    }     else if(br.equalsIgnoreCase("edge")) {
    	    WebDriverManager.edgedriver().setup();
		    driver=new EdgeDriver();
    }else {
    	logger.info("Please pass valid browser name");
    }
		/*WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();*/
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		//driver.get("https://www.surveymonkey.com/");
		//System.out.println("Survey monkey application is opened");
	    logger.info("Survey monkey application is opened");	
	    
	    }
	
	public void capturescreen(WebDriver driver, String testname) throws IOException {
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File target=new File(System.getProperty("user.dir")+"\\screenshots\\"+testname+".png");
		org.apache.commons.io.FileUtils.copyFile(source, target);
		logger.info("Screenshot captured successfully");
	}
		@AfterClass
		public void teardown() {
			driver.close();
		//	System.out.println("Survey monkey Application is closed");
			logger.info("Survey monkey Application is closed");
		}
	
	

}
