package com.mindtree.runner;

import java.util.Set;

import org.apache.log4j.Logger;
import org.openqa.selenium.Cookie;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.mindtree.pageObject.*;
import com.mindtree.exceptions.*;
import com.mindtree.reusableComponent.Base;
import com.mindtree.utilities.ExtentLogUtilities;
import com.mindtree.utilities.GetProperties;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class runnerClass extends Base {
	static Logger log;
	static ExtentTest test;
	static ExtentReports report;

	public runnerClass() throws UtilityException, Exception {
		super();
	}

	@BeforeTest()
	public void initializeDriver() throws ApplicationException {
		try {
			report = new ExtentReports(System.getProperty("user.dir") + "\\reports\\" + "ExtentReportResults-"
					+ System.currentTimeMillis() + "-.html");
			log = Logger.getLogger(runnerClass.class.getName());
			driver = initialize();
			test = report.startTest("Home Page");
			driver.get(GetProperties.get.getProperty("url"));
			//driver.manage().window().maximize();
			ExtentLogUtilities.pass(driver, test, "URL Opened", log);
			report.endTest(test);
			report.flush();
		} catch (Exception e) {
			throw new ApplicationException(e.getMessage());
		}
	}

	@Test(priority = 1, dataProvider = "getTitle")
	public void validateTitle(String title) throws ApplicationException {
		test = report.startTest("Validate Title");
		try {
			new ValidPage(driver, log, test).validate(title);
			report.endTest(test);
			report.flush();
		} catch (Exception e) {
			report.endTest(test);
			report.flush();
			throw new ApplicationException(e.getMessage());
		}
	}

	@DataProvider
	public Object[] getTitle() {
		Object data[] = new Object[1];
		data[0] = get.getProperty("title");
		return data;
	}
	@Test(priority = 2, dataProvider = "getData")
	public void LogIn(String uid, String pw) throws ApplicationException {
		test = report.startTest("Log in");
		try {
			new SigninPage(driver, log, test).login(uid, pw);
			report.endTest(test);
			report.flush();
		} catch (Exception e) {
			report.endTest(test);
			report.flush();
			throw new ApplicationException(e.getMessage());
		}
	}

	@DataProvider
	public Object[] getData() {
		Object data[][] = new Object[1][2];
		data[0][0] = excelData.get("id");
		data[0][1] = excelData.get("pw");
		return data;
	}
	
	@Test(priority = 3, dataProvider = "getData1")
	public void Search(String from, String to) throws ApplicationException {
		test = report.startTest("Search Car");
		try {
			new OutStation(driver, log, test).Search(from, to);
			report.endTest(test);
			report.flush();
		} catch (Exception e) {
			report.endTest(test);
			report.flush();
			throw new ApplicationException(e.getMessage());
		}
	}

	@DataProvider
	public Object[] getData1() {
		Object data[][] = new Object[1][2];
		data[0][0] = excelData.get("From Place");
		data[0][1] = excelData.get("To Place");
		return data;
	}
	@Test(priority = 4,dataProvider = "getData4")
	public void Round(String Title) throws ApplicationException {
		test = report.startTest("Search Car");
		try {
			new RoundTrip(driver, log, test).RoundTrip1(Title);
			report.endTest(test);
			report.flush();
		} catch (Exception e) {
			report.endTest(test);
			report.flush();
			throw new ApplicationException(e.getMessage());
		}
	}
	@DataProvider
	public Object[] getData4() {
		Object data[] = new Object[1];
		data[0] = get.getProperty("title");
		return data;
	}
	@Test(priority = 5, dataProvider = "getData2")
	public void LocalSearch(String fromLocal) throws ApplicationException {
		test = report.startTest("search local Car");
		try {
			new Local(driver, log, test).LocalSearch(fromLocal);
			report.endTest(test);
			report.flush();
		} catch (Exception e) {
			report.endTest(test);
			report.flush();
			throw new ApplicationException(e.getMessage());
		}
	}

	@DataProvider
	public Object[] getData2() {
		Object data[][] = new Object[1][1];
		data[0][0] = excelData.get("From Local");
		//data[0][1] = excelData.get("To Place");
		return data;
	}
	@Test(priority = 6, dataProvider = "getData3")
	public void AirSearch(String airportFrom,String dropPlace) throws ApplicationException {
		test = report.startTest("search Airport Car");
		try {
			new Airport(driver, log, test).AirportSearch(airportFrom,dropPlace);
			report.endTest(test);
			report.flush();
		} catch (Exception e) {
			report.endTest(test);
			report.flush();
			throw new ApplicationException(e.getMessage());
		}
	}

	@DataProvider
	public Object[] getData3() {
		Object data[][] = new Object[1][2];
		data[0][0] = excelData.get("From Airport");
		data[0][1] = excelData.get("Drop Place");
		return data;
	}
	@Test(priority = 7, dataProvider = "getCopData")
	public void corpDetailSubmit(String name,String company, String gmail, String phn) throws ApplicationException {
		test = report.startTest("Corporate Gifts");
		try {
			new CorporateCarRental(driver, log, test).fillDetails(name, company, gmail, phn);
			report.endTest(test);
			report.flush();
		} catch (Exception e) {
			report.endTest(test);
			report.flush();
			throw new ApplicationException(e.getMessage());
		}
	}

	@DataProvider
	public Object[][] getCopData() {
		Object[][] val = new Object[1][4];
		val[0][0] = excelData.get("corporate Name");
		val[0][1] =excelData.get("corporate Company");
		val[0][2] = excelData.get("corporate Email");
		val[0][3] = excelData.get("corporate phone");
		return val;
	}
	@Test(priority = 8, dataProvider = "getData6")
	public void Facebook(String Facebooktitle) throws ApplicationException {
		test = report.startTest("Validate Title");
		try {
			new Facebook(driver, log, test).validate(Facebooktitle);
			report.endTest(test);
			report.flush();
		} catch (Exception e) {
			report.endTest(test);
			report.flush();
			throw new ApplicationException(e.getMessage());
		}
	}

	@DataProvider
	public Object[] getData6() {
		Object data[][] = new Object[1][1];
		data[0][0] = excelData.get("Facebook title");
		 
		return data;
	}
	@Test(priority = 9, dataProvider = "getData7")
	public void PlaystoreVerify(String Playstoretitle) throws ApplicationException {
		test = report.startTest("Validate Title");
		try {
			new Playstore(driver, log, test).validate(Playstoretitle);
			report.endTest(test);
			report.flush();
		} catch (Exception e) {
			report.endTest(test);
			report.flush();
			throw new ApplicationException(e.getMessage());
		}
	}

	@DataProvider
	public Object[] getData7() {
		Object data[][] = new Object[1][1];
		data[0][0] = excelData.get("Playstore title");
		 
		return data;
	}
	@Test(priority = 10)
	public void Signout() throws ApplicationException {
		test = report.startTest("Signout verify");
		try {
			new Signout(driver, log, test).validate();
			report.endTest(test);
			report.flush();
		} catch (Exception e) {
			report.endTest(test);
			report.flush();
			throw new ApplicationException(e.getMessage());
		}
	}
}
