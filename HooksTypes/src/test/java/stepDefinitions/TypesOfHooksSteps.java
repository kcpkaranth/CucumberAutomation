package stepDefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class TypesOfHooksSteps {
	@Before //global hook before
	public void global_before() {
		System.out.println("Inside global before");
	}
	@After //global hook after
	public void global_after() {
		System.out.println("Inside global after");
	}
	@Before("@TestTwo") //tagged hook before
	public void tagged_before() {
		System.out.println("Inside before for test two");
	}
	@After("@TestTwo") //tagged hook after
	public void tagged_after() {
		System.out.println("Inside after for test two");
	}
	@Before(order=1) //hook with order before
	public void order_one_before() {
		System.out.println("Before with order 1");
	}
	@Before(order=2) //hook with order before
	public void order_two_before() {
		System.out.println("Before with order 2");
	}
	@After(order=1) //hook with order before
	public void order_one_after() {
		System.out.println("After with order 1");
	}
	@After(order=2) //hook with order before
	public void order_two_after() {
		System.out.println("After with order 2");
	}
	@Given("^Statement one$")
	public void statement_one() {
		System.out.println("Inside Statement 1 of scenario 1");
	}

	@Then("^Statement two$")
	public void statement_two() {
		System.out.println("Inside Statement 2 of scenario 1");
	}

	@Then("^Statement three$")
	public void statement_three() {
		System.out.println("Inside Statement 3 of scenario 1");
	}

	@Given("^statement four$")
	public void statement_four() {
		System.out.println("Inside Statement 4 of scenario 2");
	}

	@Given("^Statement five$")
	public void statement_five() {
		System.out.println("Inside Statement 5 of scenario 2");
	}

	@Then("^Statement six$")
	public void statement_six() {
		System.out.println("Inside Statement 6 of scenario 2");
	}

	@Given("^Statement seven$")
	public void statement_seven() {
		System.out.println("Inside Statement 7 of scenario 3");
	}
}
