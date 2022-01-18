package com.mindtree.pageObject;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.mindtree.exceptions.PageObjectException;
import com.mindtree.exceptions.ReusableComponentException;
import com.mindtree.exceptions.UtilityException;
import com.mindtree.reusableComponent.WebDriverSupport;
import com.mindtree.uiStore.AirportUi;
import com.mindtree.utilities.ExtentLogUtilities;
import com.relevantcodes.extentreports.ExtentTest;

public class Airport extends AirportUi{
	WebDriver driver;
	Logger log;
	ExtentTest test;

	public Airport(WebDriver driver, Logger log, ExtentTest test) throws Exception {
		this.driver = driver;
		this.test = test;
		this.log = log;
	}
	public void AirportSearch(String airportFrom,String dropPlace) throws ReusableComponentException, Exception {
		try {
			WebDriverSupport.click(driver, airp, "Local Page", "Airport Button", log, test);
			WebDriverSupport.click(driver, clear, "Airport Page", "From Bar", log, test);
			WebDriverSupport.click(driver, from, "Airport Page", "From Bar", log, test);
			WebDriverSupport.sendKeys(driver, from, "Airport Page", "From Baar", log, test, airportFrom);
			WebDriverSupport.click(driver,desti, "Airport Page", "From Bar", log, test);
			Select dd=new Select(driver.findElement(trip));
			dd.selectByValue("pick_airport");
			WebDriverSupport.click(driver,drop, "Airport Page", "drop bar", log, test);
			WebDriverSupport.sendKeys(driver,drop, "Airport Page", "drop Baar", log, test, dropPlace);
			Thread.sleep(1000);
			WebDriverSupport.click(driver,click, "Airport Page", "drop bar", log, test);
			WebDriverSupport.click(driver,select, "Airport Page", "Select button", log, test);
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
			//driver.close();
		}catch (Exception e) {
			throw new UtilityException(e.getMessage());
		}
	}
}
