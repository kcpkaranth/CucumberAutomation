package stepDefinations;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HooksStepDefinations {
	@Before
	public void setup() {
		System.out.println("Lunch chrome and navigate to facebook");
	}
	@After
	public void teardown() {
		System.out.println("close the browser");
	}
	
	@Given("^user enters email and password$")
	public void user_enters_email_and_password() {
		System.out.println("enter emaail and password");
	}

	@Then("^click on login$")
	public void click_on_login() {
		System.out.println("click onlogin button");
	}

	@And("^clciks on logout$")
	public void clciks_on_logout() {
		System.out.println("click on logout");
	}

	@Given("^user enters first name$")
	public void user_enters_first_name() {
		System.out.println("enter first name");
	}

	@And("^enters last name$")
	public void enters_last_name() {
		System.out.println("enter last name");
	}

	@Then("^clicks on signup$")
	public void clicks_on_signup() {
		System.out.println("click on signup");
	}

	@Given("^user clicks on forgetten accoubt link$")
	public void user_clicks_on_forgetten_accoubt_link() {
		System.out.println("click forget account link");
	}

	
}
