package com.karanth.magentoobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MagentoWelcome {
	WebDriver driver;
	By myAcct = By.xpath("//a[text()='My Account']");
	
	//constructor
	public MagentoWelcome(WebDriver driver) {
		this.driver=driver;
	}
	
	public void clickOnMyAcct() {
		driver.findElement(myAcct).click();
	}
}
