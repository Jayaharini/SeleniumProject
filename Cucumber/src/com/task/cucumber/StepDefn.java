package com.task.cucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefn {
	
	@Given("^userinitializes the browser$")
	public void userinitializes_the_browser() throws Throwable {
		System.out.println("userinitializes the browser");
	}

	@When("^userlaunches the application$")
	public void userlaunches_the_application() throws Throwable {
		System.out.println("userlaunches the application");
	}

	@When("^user enters the firstname and surname$")
	public void user_enters_the_firstname_and_surname() throws Throwable {
		System.out.println("user enters the firstname and surname");
	}

	@When("^user enters mobile number or email address$")
	public void user_enters_mobile_number_or_email_address() throws Throwable {
		System.out.println("user enters mobile number or email address");
	}

	@When("^user enters the new password$")
	public void user_enters_the_new_password() throws Throwable {
		System.out.println("user enters the new password");
	}

	@When("^user enters the birthday date$")
	public void user_enters_the_birthday_date() throws Throwable {
		System.out.println("user enters the birthday date");
	}

	@When("^user enters the gender details$")
	public void user_enters_the_gender_details() throws Throwable {
		System.out.println("user enters the gender details");
	}

	@Then("^user clicks the signup button$")
	public void user_clicks_the_signup_button() throws Throwable {
		System.out.println("user clicks the signup button");
	}



}
