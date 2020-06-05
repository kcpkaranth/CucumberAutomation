package seleniumGluecode;

import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test {
	
	@Given("^Iam a manual tester$")
	public void Iam_a_manual_tester() {
		System.out.println("given Iam a manual tester");
	}
	@When("^i apply for new job$")
	public void i_apply_for_new_job() {
		System.out.println("When i apply for new job");
	}
	@Then("^i get less pay$")
	public void i_get_less_pay() {
		System.out.println("then i get less pay");
	}
	@And("^iam not satified with my salary$")
	public void iam_not_satified_with_my_salary() {
		System.out.println("and iam not satified with my salary");
	}
	@But("^my parents are satisfied$")
	public void my_parents_are_satisfied() {
		System.out.println("but my parents are satisfied");
	}
}
