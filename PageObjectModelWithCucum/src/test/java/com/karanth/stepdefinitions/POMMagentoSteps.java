package com.karanth.stepdefinitions;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.karanth.magentoobjects.MagentoHome;
import com.karanth.magentoobjects.MagentoLogin;
import com.karanth.magentoobjects.MagentoWelcome;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class POMMagentoSteps {
	WebDriver driver;

	@Given("^User opens browser$")
	public void user_opens_browser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@When("^user enters url of magento$")
	public void user_enters_url_of_magento() {
		driver.get("https://www.magento.com");
	}

	@And("^clicks on my account link$")
	public void clicks_on_my_account_link() {
		MagentoWelcome w = new MagentoWelcome(driver);
		w.clickOnMyAcct();
	}

	@Then("^enters email and password and clicks on login button$")
	public void enters_Credentials() {
		MagentoLogin l = new MagentoLogin(driver);
		l.enterEmail("kcpkaranth@gmail.com");
		l.enterpassword("welcome#123");
		l.clickOnLogin();
	}

	@And("^clicks on logout$")
	public void clicks_on_logout() {
		MagentoHome h = new MagentoHome(driver);
		h.clickOnLogout();
	}

	@And("^close browser$")
	public void close_browser() throws Exception {
		Thread.sleep(3000);
		driver.quit();
	}

}
