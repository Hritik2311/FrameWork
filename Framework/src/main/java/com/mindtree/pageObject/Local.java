package com.mindtree.pageObject;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.mindtree.exceptions.PageObjectException;
import com.mindtree.reusableComponent.WebDriverSupport;
import com.mindtree.uiStore.LocalUi;
import com.mindtree.utilities.ExtentLogUtilities;
import com.relevantcodes.extentreports.ExtentTest;

public class Local extends LocalUi {
	WebDriver driver;
	Logger log;
	ExtentTest test;

	public Local(WebDriver driver, Logger log, ExtentTest test) throws Exception {
		this.driver = driver;
		this.test = test;
		this.log = log;
	}

	public void LocalSearch(String fromLocal) throws PageObjectException, Exception {
		try {
			
			WebDriverSupport.click(driver, loc, "Home Page", "Local Button", log, test);
			WebDriverSupport.click(driver, clear, "Local Page", "clear Button", log, test);
			WebDriverSupport.click(driver, from, "Local Page", "From Button", log, test);
			WebDriverSupport.sendKeys(driver, from, "Account Log in", "password field", log, test, fromLocal);
			WebDriverSupport.click(driver, select, "Local Page", "Search Button", log, test);
			Thread.sleep(1000);
			if(driver.findElement(verify).isDisplayed()) {
				ExtentLogUtilities.pass(driver, test, "Successfully verified", log);
			}
			else {
				ExtentLogUtilities.fail(driver, test, "Failed To verify", log);
				throw new PageObjectException("Verify Failed");
			}
		
		Thread.sleep(2000);
		WebDriverSupport.click(driver,home, "Search Page", "Home button", log, test);
		}
		catch (Exception e){
			ExtentLogUtilities.fail(driver, test, "logged in failed", log);
			throw new PageObjectException("Logged in failed");
		}
		

	}
}
