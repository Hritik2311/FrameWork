package com.mindtree.pageObject;

import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.mindtree.exceptions.PageObjectException;
import com.mindtree.exceptions.ReusableComponentException;
import com.mindtree.exceptions.UtilityException;
import com.mindtree.reusableComponent.WebDriverSupport;
import com.mindtree.uiStore.OutStationUi;
import com.mindtree.utilities.ExtentLogUtilities;
import com.relevantcodes.extentreports.ExtentTest;

public class OutStation extends OutStationUi{
	WebDriver driver;
	Logger log;
	ExtentTest test;

	public OutStation(WebDriver driver, Logger log, ExtentTest test) throws Exception {
		this.driver = driver;
		this.test = test;
		this.log = log;
	}

	public void Search(String from, String to) throws ReusableComponentException, Exception {
		try {
			WebDriverSupport.click(driver, From, "Home Page", "From Bar", log, test);
			WebDriverSupport.sendKeys(driver, From, "Home Page", "From Bar", log, test,from);
			WebDriverSupport.click(driver,To, "Home Page", "From Bar", log, test);
			WebDriverSupport.sendKeys(driver, To, "Home Page", "From Bar", log, test,to);
			//WebDriverSupport.click(driver,calendar , "Home Page", "Calendar", log, test);
			//WebDriverSupport.click(driver, date, "Home Page", "Date Choose", log, test);
			Thread.sleep(5000);
			//WebDriverSupport.click(driver,time, "Home Page", "Time Bar", log, test);
			//Select dd=new Select(driver.findElement(time));
			//dd.selectByValue("2022-01-16T07:45:00-08:00");
			WebDriverSupport.click(driver,desti, "Home Page", "From Bar", log, test);
			WebDriverSupport.click(driver,Select, "Home Page", "From Bar", log, test);
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
