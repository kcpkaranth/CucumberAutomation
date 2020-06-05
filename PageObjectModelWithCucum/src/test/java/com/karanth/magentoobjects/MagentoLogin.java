package com.karanth.magentoobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MagentoLogin {
	WebDriver driver;
	By mail = By.xpath("//input[@id='email']");
	By pass = By.xpath("//input[@id='pass']");
	By login = By.xpath("//button[@id='send2']");
	
	//constructor
	public MagentoLogin(WebDriver driver) {
		this.driver=driver;
	}
	
	public void enterEmail(String email) {
		driver.findElement(mail).sendKeys(email);
	}
	public void enterpassword(String pwd) {
		driver.findElement(pass).sendKeys(pwd);
	}
	public void clickOnLogin() {
		driver.findElement(login).click();
	}

}
