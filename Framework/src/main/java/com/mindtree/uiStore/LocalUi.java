package com.mindtree.uiStore;

import org.openqa.selenium.By;

public class LocalUi {
public static By loc = By.xpath("//span[contains(text(),'Local')]");
public static By from=By.xpath("//input[@id='fromCityList']");
public static By select=By.xpath("//button[contains(text(),'Select Car')]");
public static By clear = By.xpath("//body/app-root[@id='approot']/mat-sidenav-container[1]/mat-sidenav-content[1]/app-home[1]/div[1]/app-home-container[1]/div[1]/div[1]/div[2]/app-local[1]/div[1]/form[1]/div[1]/a[1]/img[1]");
public static By verify=By.xpath("//body/app-root[@id='approot']/mat-sidenav-container[1]/mat-sidenav-content[1]/app-select-car[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/button[1]");
public static By home =By.xpath("//a[contains(text(),'Home')]");
}
