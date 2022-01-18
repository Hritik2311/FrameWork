package com.mindtree.pageObject;

import java.util.Iterator;
import java.util.Set;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.mindtree.exceptions.PageObjectException;
import com.mindtree.exceptions.ReusableComponentException;
import com.mindtree.reusableComponent.WebDriverSupport;
import com.mindtree.uiStore.CorprateCarRentalsUi;
import com.mindtree.utilities.ExtentLogUtilities;
import com.relevantcodes.extentreports.ExtentTest;

public class CorporateCarRental extends CorprateCarRentalsUi {

	WebDriver driver;
	Logger log;
	ExtentTest test;

	public CorporateCarRental(WebDriver driver, Logger log, ExtentTest test) throws Exception {
		this.driver = driver;
		this.test = test;
		this.log = log;
	}

	public void fillDetails(String name,String company, String Gmail, String phno) throws ReusableComponentException, Exception {
		try {
			WebDriverSupport.click(driver,corporateCar , "Home Page", "Corporate Button", log, test);
			Thread.sleep(2000);
			Set<String>ids=driver.getWindowHandles();
			Iterator<String> it=ids.iterator();
			String parentid=it.next();
			String childid=it.next();
			Thread.sleep(1000);
			driver.switchTo().window(childid);
			Thread.sleep(1000);
			WebDriverSupport.sendKeys(driver, nameC, name, Gmail, log, test, name);
			WebDriverSupport.sendKeys(driver, companyC, name, Gmail, log, test, company);
			WebDriverSupport.sendKeys(driver, emailC, name, Gmail, log, test, Gmail);
			WebDriverSupport.sendKeys(driver, contact_noC, name, Gmail, log, test, phno);
			
			//WebDriverSupport.click(driver, bussiness_volume, "Corporate Page", "Corporate volume Button", log, test);
			Select dd=new Select(driver.findElement(bussiness_volume));
			dd.selectByValue("Lessthan50000");
			Thread.sleep(2000);
			WebDriverSupport.click(driver, submit, "Corporate page", "Submit Button", log, test);
			Thread.sleep(5000);
			if(driver.findElement(verify).isDisplayed()) {
				ExtentLogUtilities.pass(driver, test, "Successfully verified", log);
				driver.close();
			}
			else {
				ExtentLogUtilities.fail(driver, test, "Failed To verify", log);
				throw new PageObjectException("Verify Failed");
			}
			Thread.sleep(1000);
			driver.switchTo().window(parentid);
		} 
		catch (Exception e) {
			throw new PageObjectException(e.getMessage());
		}
	}

}
