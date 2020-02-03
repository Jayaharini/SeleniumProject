package com.task.cucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class StepAdactin {
	

	@Given("^user initializing browser$")
	public void user_initializing_browser() throws Throwable {
		System.out.println("user initializing browser");
	}

	@When("^user launches website$")
	public void user_launches_website() throws Throwable {
		System.out.println("user launches website");
	}

	@When("^user enters the user id and password$")
	public void user_enters_the_user_id_and_password() throws Throwable {
		System.out.println("user enters the user id and password");
	}

	@When("^user clicks the login button$")
	public void user_clicks_the_login_button() throws Throwable {
		System.out.println("user clicks the login button");
	}

	@When("^user chooses the location$")
	public void user_chooses_the_location() throws Throwable {
		System.out.println("user chooses the location");
	}

	@When("^user opts for hotel$")
	public void user_opts_for_hotel() throws Throwable {
		System.out.println("user opts for hotel");
	}

	@When("^user selects room type$")
	public void user_selects_room_type() throws Throwable {
		System.out.println("user selects room type");
	}

	@When("^user chooses the check-in and check-out dates$")
	public void user_chooses_the_check_in_and_check_out_dates() throws Throwable {
		System.out.println("user chooses the check-in and check-out dates");
	}

	@When("^user selects the seaech button$")
	public void user_selects_the_seaech_button() throws Throwable {
		System.out.println("user selects the seaech button");
	}

	@When("^user selects the hotel and clicks on continue$")
	public void user_selects_the_hotel_and_clicks_on_continue() throws Throwable {
		System.out.println("user selects the hotel and clicks on continue");
	}

	@When("^user gives the bank details$")
	public void user_gives_the_bank_details() throws Throwable {
		System.out.println("user gives the bank details");
	}

	@When("^user clicks the Book Now Button$")
	public void user_clicks_the_Book_Now_Button() throws Throwable {
		System.out.println("user clicks the Book Now Button");
	}



}
