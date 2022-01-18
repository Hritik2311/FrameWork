package com.mindtree.uiStore;

import org.openqa.selenium.By;

public class AirportUi {
public static By airp = By.xpath("//span[contains(text(),'Airport')]");
public static By clear=By.xpath("//body/app-root[@id='approot']/mat-sidenav-container[1]/mat-sidenav-content[1]/app-home[1]/div[1]/app-home-container[1]/div[1]/div[1]/div[2]/app-local[1]/div[1]/form[1]/div[1]/a[1]/img[1]");
public static By from=By.xpath("//input[@id='fromCityList']");
public static By trip=By.xpath("//body/app-root[@id='approot']/mat-sidenav-container[1]/mat-sidenav-content[1]/app-home[1]/div[1]/app-home-container[1]/div[1]/div[1]/div[2]/app-local[1]/div[1]/form[1]/div[2]/div[1]/select[1]");
public static By result=By.className("ng-star-inserted xpath");
public static By desti =By.xpath("//span[contains(text(),'Chennai, Tamil Nadu')]");
public static By drop=By.xpath("//input[@id='search_places']");
public static By click=By.xpath("//*[@id=\"approot\"]/mat-sidenav-container/mat-sidenav-content/app-home/div/app-home-container/div[1]/div[1]/div[2]/app-local/div/form/div[3]/div/div/ng4geo-autocomplete/div/ul/li[1]");
public static By select=By.xpath("//button[contains(text(),'Select Car')]");
public static By verify =By.xpath("//body/app-root[@id='approot']/mat-sidenav-container[1]/mat-sidenav-content[1]/app-select-car[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/button[1]");
public static By home =By.xpath("//a[contains(text(),'Home')]");
}
