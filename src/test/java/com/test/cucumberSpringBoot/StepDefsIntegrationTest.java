package com.test.cucumberSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.web.client.TestRestTemplate;

import cucumber.api.java.en.Given;

public class StepDefsIntegrationTest extends SpringIntegrationTest {

	@Autowired
	Helper help;
	
	@Given("^I want to write a step with precondition$")
	public void i_want_to_write_a_step_with_precondition() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("FIRST");
		help.firstMethod();
		//restTemplate.getForObject("http://www.google.com", String.class);
	}

	@Given("^some other precondition$")
	public void some_other_precondition() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

		System.out.println("Second");
		help.firstMethod();
	}

}
