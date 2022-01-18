package com.mindtree.uiStore;

import org.openqa.selenium.By;

public class SigninPageUi {
	public static By SigninButton = By.xpath("//header/div[1]/div[3]/div[1]/a[3]/div[1]");
	public static By email = By.xpath("//body/app-root[@id='approot']/app-navbar[1]/div[2]/div[1]/div[2]/form[1]/input[1]");
	public static By pass = By.xpath("//body/app-root[@id='approot']/app-navbar[1]/div[2]/div[1]/div[2]/form[1]/input[2]");
	public static By signin = By.xpath("//span[contains(text(),'Login')]");
	public static By myAcc = By.xpath
			("//span[contains(text(),'Hi, Rajesh S')]");
	//public static By getHome = By.cssSelector("img.small--hide");
}
