package com.mindtree.pageObject;

import java.util.Iterator;
import java.util.Set;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.mindtree.exceptions.PageObjectException;
import com.mindtree.reusableComponent.WebDriverSupport;
import com.mindtree.uiStore.SignoutUi;
import com.mindtree.utilities.ExtentLogUtilities;
import com.relevantcodes.extentreports.ExtentTest;

public class Signout extends SignoutUi {
	WebDriver driver;
	Logger log;
	ExtentTest test;

	public Signout(WebDriver driver, Logger log, ExtentTest test) throws Exception {
		this.driver = driver;
		this.test = test;
		this.log = log;
	}

	public void validate() throws PageObjectException, Exception {
		try {
			WebDriverSupport.click(driver, profile, "Home Page", "Profile Icon", log, test);
			WebDriverSupport.click(driver,signout, "Home Page", "signout Button", log, test);
			Thread.sleep(2000);
			/*Set<String> ids = driver.getWindowHandles();
			Iterator<String> it = ids.iterator();
			String parentid = it.next();
			String childid = it.next();
			Thread.sleep(1000);
			driver.switchTo().window(childid);
			// driver.switchTo().window(childid);
			Thread.sleep(3000);
			System.out.println(driver.getTitle());
*/
			if (driver.findElement(verify).isDisplayed()) {
				ExtentLogUtilities.pass(driver, test, "Successfully verified", log);
				driver.close();
			} else {

				ExtentLogUtilities.fail(driver, test, "Failed To verify", log);
				throw new PageObjectException("Page not opened  " );
			}
		} catch (Exception e) {
			throw new PageObjectException(e.getMessage());
		}
	}
}
