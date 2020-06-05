package com.karanth.magentoobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MagentoHome {
	WebDriver driver;
	By logout = By.xpath("//a[text()='Log Out']");
	
	//constructor
	public MagentoHome(WebDriver driver) {
		this.driver=driver;
	}
	
	public void clickOnLogout() {
		driver.findElement(logout).click();
	}
}
