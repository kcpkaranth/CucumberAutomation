package stepDefinations;

import static org.junit.Assert.assertEquals;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MagentoSteps {
	public WebDriver driver;
	
	//Scenario 1 : login to magento
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

	@And("^enter \"(.*)\" and \"(.*)\"$")
	public void enter_email_and_password(String mail, String pwd){
	    driver.findElement(By.id("email")).sendKeys(mail);
	    driver.findElement(By.id("pass")).sendKeys(pwd);
	}

	@Then("^click on login button$")
	public void click_on_login_button(){
		driver.findElement(By.id("send2")).click();
	}

	@But("^wait for four seconds$")
	public void wait_for_four_seconds() throws Exception{
	    Thread.sleep(4000);
	}

	@And("^click on logout$")
	public void click_on_logout() throws Exception{
		driver.findElement(By.linkText("Log Out")).click();
		Thread.sleep(4000);
		driver.quit();
	}
	
	//Scenario 2 : register to magento
	/*@When("^user is in login page$")
	public void user_is_in_login_page(){
		driver = new ChromeDriver();
		driver.get("https://account.magento.com/customer/account/login/");
	    System.out.println(driver.getTitle());
	    
	}

	@Then("^click on register button$")
	public void click_on_register_button(){
	    driver.findElement(By.id("register")).click();
	}

	@And("^enter all required details$")
	public void enter_all_required_details(){
	    driver.findElement(By.id("firstname")).sendKeys("phaniraj");
	    driver.findElement(By.id("lastname")).sendKeys("karanth");
	}

	@Then("^close the browser$")
	public void close_the_browser() throws Exception{
	    Thread.sleep(3000);
	    driver.quit();
	}*/	
}
