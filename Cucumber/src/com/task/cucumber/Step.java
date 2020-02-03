package com.task.cucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step {
	

	@Given("^user initializes the browser$")
	public void user_initializes_the_browser() throws Throwable {
		System.out.println("user initializes the browser");
	}

	@When("^user launches the application$")
	public void user_launches_the_application() throws Throwable {
		System.out.println("user launches the application");
	}

	@When("^user enters the \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_the_and(String arg1, String arg2) throws Throwable {
		System.out.println("UserName: "+arg1);
		System.out.println("Password: "+arg2);
	}


	@When("^user clicks on the login button$")
	public void user_clicks_on_the_login_button() throws Throwable {
	    System.out.println("user clicks on the login button");
	}


	
	@When("^user enters the email address$")
	public void user_enters_the_email_address() throws Throwable {
	    System.out.println("user enters the email address");
	}

	@When("^user enters the wrong password$")
	public void user_enters_the_wrong_password() throws Throwable {
	    System.out.println("user enters the wrong password");
	}

	@When("^user clicks enter button$")
	public void user_clicks_enter_button() throws Throwable {
	    System.out.println("user clicks enter button");
	}

	@Then("^error message is thrown by the browser$")
	public void error_message_is_thrown_by_the_browser() throws Throwable {
	    System.out.println("error message is thrown by the browser");

}
}


