package Steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HolaMundoSteps {
	
	@Given("I want to write a step with precondition")
	public void i_want_to_write_a_step_with_precondition() {
	    System.out.println("I want to write a step with precondition step 1");
	}

	@Given("some other precondition")
	public void some_other_precondition() {
	    System.out.println("I want to write a step with precondition step 2");
	}

	@When("I complete action")
	public void i_complete_action() {
	    System.out.println("I want to write a step with precondition step 3");
	}

	@When("some other action")
	public void some_other_action() {
	    System.out.println("I want to write a step with precondition step 4");
	}

	@When("yet another action")
	public void yet_another_action() {
	    System.out.println("I want to write a step with precondition step 5");
	}

	@Then("I validate the outcomes")
	public void i_validate_the_outcomes() {
	    System.out.println("I want to write a step with precondition step 6");
	}

	@Then("check more outcomes")
	public void check_more_outcomes() {
	    System.out.println("I want to write a step with precondition step 7");
	}

	@Given("I want to write a step with name{int}")
	public void i_want_to_write_a_step_with_name(Integer int1) {
	    System.out.println("I want to write a step with precondition step 8");
	}

	@When("I check for the {int} in step")
	public void i_check_for_the_in_step(Integer int1) {
	    System.out.println("I want to write a step with precondition step 9");
	}

	@Then("I verify the success in step")
	public void i_verify_the_success_in_step() {
	    System.out.println("I want to write a step with precondition step 10");
	}

	@Then("I verify the Fail in step")
	public void i_verify_the_Fail_in_step() {
	    System.out.println("I want to write a step with precondition step 11");
	}

}
