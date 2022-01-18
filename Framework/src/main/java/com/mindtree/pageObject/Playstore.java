package com.mindtree.pageObject;

import java.util.Iterator;
import java.util.Set;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.mindtree.exceptions.PageObjectException;
import com.mindtree.reusableComponent.WebDriverSupport;
import com.mindtree.uiStore.PlaystoreUi;
import com.mindtree.utilities.ExtentLogUtilities;
import com.relevantcodes.extentreports.ExtentTest;

public class Playstore extends PlaystoreUi {
	WebDriver driver;
	Logger log;
	ExtentTest test;

	public Playstore(WebDriver driver, Logger log, ExtentTest test) throws Exception {
		this.driver = driver;
		this.test = test;
		this.log = log;
	}

	public void validate(String Playstoretitle) throws PageObjectException, Exception {
		try {
			WebDriverSupport.click(driver, playstore, "Home Page", "play store downlad app", log, test);

			Thread.sleep(2000);
			Set<String> ids = driver.getWindowHandles();
			Iterator<String> it = ids.iterator();
			String parentid = it.next();
			String childid = it.next();
			Thread.sleep(1000);
			driver.switchTo().window(childid);
			// driver.switchTo().window(childid);
			Thread.sleep(3000);
			//System.out.println(driver.getTitle());

			if (Playstoretitle.equalsIgnoreCase(driver.getTitle())) {
				Thread.sleep(2000);
				ExtentLogUtilities.pass(driver, test, "Page opend with title " + Playstoretitle, log);
				Thread.sleep(2000);
				driver.close();
			} else {

				ExtentLogUtilities.fail(driver, test, "Page not opened with title " + Playstoretitle, log);
				throw new PageObjectException("Page not opened with title " + Playstoretitle);
				
			}
			Thread.sleep(3000);
			driver.switchTo().window(parentid);
		} catch (Exception e) {
			throw new PageObjectException(e.getMessage());
		}
	}
}
