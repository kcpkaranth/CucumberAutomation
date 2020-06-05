package stepDefinations;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class TagSteps {
	
	@Given("^valid login$")
	public void valid_login(){
	    System.out.println("valid login done");
	}

	@Given("^invalid login$")
	public void invalid_login(){
		System.out.println("ERRRRRRRRRRR.... its invalid login");
	}

	@Given("^forget password click$")
	public void forget_password_click() {
		System.out.println("forget password link working..!!!!");
	}

	@Given("^learnmore click$")
	public void learnmore_click() {
		System.out.println("forget learnmore link working..!!!!");
	}

	@Given("^create account click$")
	public void create_account_click() {
		System.out.println("forget createaccount link working..!!!!");
	}

	@Then("^check inbox$")
	public void check_inbox() {
		System.out.println("inbox page is displaying...!!!");
	}

	@Then("^check starred$")
	public void check_starred() {
		System.out.println("stared page is displaying...!!!");
	}

	@Then("^check important$")
	public void check_important(){
		System.out.println("important page is displaying...!!!");
	}

	@Then("^check spam$")
	public void check_spam(){
		System.out.println("spam page is displaying...!!!");
	}

	@Then("^check trash$")
	public void check_trash(){
		System.out.println("trash page is displaying...!!!");
	}

	@Then("^check compose$")
	public void check_compose(){
		System.out.println("compose page is displaying...!!!");
	}

	@Then("^check sentitems$")
	public void check_sentitems(){
		System.out.println("sent items page is displaying...!!!");
	}

	@Then("^check outbox$")
	public void check_outbox(){
		System.out.println("outbox page is displaying...!!!");
	}

	@Then("^check logout$")
	public void check_logout(){
		System.out.println("Successfully logged out ...!!!!!!!!");
	}

}
