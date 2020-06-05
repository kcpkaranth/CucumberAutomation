package stepDefinations;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MapsStepDefinitionsForMagento {
	public WebDriver driver;
	
	@Given("^Chrome Browser is open$")
	public void chrome_Browser_is_open(){
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@When("^user enters \"(.*)\"$")
	public void user_enters_url(String url){
	    driver.get(url);
	}

	@Then("^Click on Myaccount link$")
	public void click_on_Myaccount_link(){
	    driver.findElement(By.linkText("My Account")).click();
	}

	@And("^enter email and password click on login and logout$")
	public void enter_email_and_password(DataTable credentials) throws Exception{
		for(Map<String, String> creddata : credentials.asMaps(String.class, String.class)) {
	    driver.findElement(By.id("email")).sendKeys(creddata.get("email"));
	    driver.findElement(By.id("pass")).sendKeys(creddata.get("password"));
	    driver.findElement(By.id("send2")).click();
	    driver.findElement(By.linkText("Log Out")).click();
	    Thread.sleep(4000);
		}
		
	}
	@Then("^click on register button$")
	public void click_on_register_button(){
	    driver.findElement(By.id("register")).click();
	}

	@And("^enter firstname lastname and emailID$")
	public void enter_required_details(DataTable newData) throws Exception{
		
		for(Map<String, String> register : newData.asMaps(String.class, String.class)) {
	    driver.findElement(By.id("firstname")).sendKeys(register.get("firstname"));
	    driver.findElement(By.id("lastname")).sendKeys(register.get("lastname"));
	    driver.findElement(By.id("email_address")).sendKeys(register.get("emailID"));
	    Thread.sleep(2000);
	    driver.navigate().refresh();
		}
	}

	@Then("^close the browser$")
	public void close_the_browser() throws Exception{
	    Thread.sleep(3000);
	    driver.quit();
	}

}
