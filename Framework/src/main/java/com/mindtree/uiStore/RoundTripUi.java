package com.mindtree.uiStore;

import org.openqa.selenium.By;

public class RoundTripUi {
	public static By round = By.xpath("//label[contains(text(),'Round Trip')]");
	public static By select = By.xpath("//button[contains(text(),'Select Car')]");
	public static By verify=By.xpath("//body/app-root[@id='approot']/mat-sidenav-container[1]/mat-sidenav-content[1]/app-select-car[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/button[1]");
	public static By home =By.xpath("//a[contains(text(),'Home')]");
}
