package stepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestMethods {
	public WebDriver driver;
	@Given("^user opens browser$")
	public void open_Browser() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(5000);
	}
	@When("^user enters \"(.*)\"$")
	public void user_enters(String url) throws Exception {
		driver.get(url);
		Thread.sleep(5000);
	}
	@Then("^enter email id and enter password$")
	public void enter_credentials() throws Exception {
		driver.findElement(By.id("email")).sendKeys("karanthcoaching@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys("TestMaster");
		Thread.sleep(2000);
	}
	@And("^click on login button$")
	public void login_click() throws Exception {
		driver.findElement(By.id("u_0_b")).click();
		Thread.sleep(5000);
	}
	@Then("^close the browser$")
	public void close_browser() {
		driver.quit();
	}
}
