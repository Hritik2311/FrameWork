package com.mindtree.uiStore;

import org.openqa.selenium.By;

public class CorprateCarRentalsUi {
	public static By corporateCar = By.xpath("//a[contains(text(),'Corporate Car Rental')]");
	public static By nameC = By.xpath("//body/app-root[@id='approot']/mat-sidenav-container[1]/mat-sidenav-content[1]/app-corporate-car-rental-agency-india[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[1]/input[1]");
	public static By companyC = By.xpath("//body/app-root[@id='approot']/mat-sidenav-container[1]/mat-sidenav-content[1]/app-corporate-car-rental-agency-india[1]/div[1]/div[2]/form[1]/div[2]/div[2]/div[1]/input[1]");
	public static By emailC = By.xpath("//body/app-root[@id='approot']/mat-sidenav-container[1]/mat-sidenav-content[1]/app-corporate-car-rental-agency-india[1]/div[1]/div[2]/form[1]/div[3]/div[2]/div[1]/input[1]");
	public static By contact_noC = By.xpath("//body/app-root[@id='approot']/mat-sidenav-container[1]/mat-sidenav-content[1]/app-corporate-car-rental-agency-india[1]/div[1]/div[2]/form[1]/div[4]/div[2]/div[1]/input[1]");
	public static By bussiness_volume = By.xpath("//body/app-root[@id='approot']/mat-sidenav-container[1]/mat-sidenav-content[1]/app-corporate-car-rental-agency-india[1]/div[1]/div[2]/form[1]/div[5]/div[2]/select[1]");
	public static By submit = By.xpath("//span[contains(text(),'Submit')]");
	public static By verify = By.xpath("//div[contains(text(),'Thank You for Enquiring with us! Our Representativ')]");
	//public static By airp = By.xpath("//a[contains(text(),'Local Car Rentals')]");
}
