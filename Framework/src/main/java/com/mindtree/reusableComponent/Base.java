package com.mindtree.reusableComponent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import com.mindtree.exceptions.UtilityException;
import com.mindtree.utilities.ExcelSheetRead;

public class Base extends ExcelSheetRead {

	public Base() throws UtilityException, Exception {
		super();
	}

	static public WebDriver driver;

	public static WebDriver initialize() throws Exception {
		if (driver == null) {
			if (driver == null) {
				if (get.getProperty("browser").equals("chrome")) {
					System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + get.getProperty("path"));
					ChromeOptions opt = new ChromeOptions();
					opt.addArguments("--disable-notifications");
					driver = new ChromeDriver(opt);
				} else if (get.getProperty("browser").equals("firefox")) {
					
					System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir") + get.getProperty("path2gecko"));
					FirefoxOptions opt = new FirefoxOptions();
					driver = new FirefoxDriver(opt);
				} else if (get.getProperty("browser").equals("msedge")) {
					
					System.setProperty("webdriver.edge.driver",System.getProperty("user.dir") + get.getProperty("path2msedge"));
					EdgeOptions opt = new EdgeOptions();
					driver = new EdgeDriver(opt);
				}
			}
			
		}
		return driver;
	}
}
