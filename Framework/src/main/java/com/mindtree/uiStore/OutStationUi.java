package com.mindtree.uiStore;

import org.openqa.selenium.By;

public class OutStationUi {
	public static By From = By.xpath("//input[@id='fromCityList']");
	public static By To = By.xpath("//body/app-root[@id='approot']/mat-sidenav-container[1]/mat-sidenav-content[1]/app-home[1]/div[1]/app-home-container[1]/div[1]/div[1]/div[2]/app-outstation[1]/div[1]/form[1]/div[2]/div[1]/input[1]");
	public static By Select = By.xpath("//button[contains(text(),'Select Car')]");
	public static By desti = By.xpath("//span[contains(text(),'Chennai Central, Chennai')]");
	public static By verify = By.xpath("//body/app-root[@id='approot']/mat-sidenav-container[1]/mat-sidenav-content[1]/app-select-car[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/button[1]");
	public static By home = By.xpath("//a[contains(text(),'Home')]");
	public static By calendar = By.xpath("//input[@placeholder='dd-mm-yyyy']");
	public static By date = By.xpath("//span[contains(text(),'23')]");
	public static By time = By.xpath("//select[@id='pickUpTime']");
}
