package com.mindtree.pageObject;

import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.mindtree.exceptions.PageObjectException;
import com.mindtree.exceptions.ReusableComponentException;
import com.mindtree.exceptions.UtilityException;
import com.mindtree.reusableComponent.WebDriverSupport;
import com.mindtree.uiStore.RoundTripUi;
import com.mindtree.utilities.ExtentLogUtilities;
import com.relevantcodes.extentreports.ExtentTest;

public class RoundTrip extends RoundTripUi{
	WebDriver driver;
	Logger log;
	ExtentTest test;

	public RoundTrip(WebDriver driver, Logger log, ExtentTest test) throws Exception {
		this.driver = driver;
		this.test = test;
		this.log = log;
	}

	public void RoundTrip1(String Title) throws ReusableComponentException, Exception {
		try {
			WebDriverSupport.click(driver,round, "Home Page", "Round Trip Button", log, test);

			WebDriverSupport.click(driver,select, "Home Page", "From Bar", log, test);
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
		}catch (Exception e) {
				throw new UtilityException(e.getMessage());
			}
		}
}
