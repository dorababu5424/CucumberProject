package	org.stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class StepDefinition {
	
	

	
	@Given("user should open Filpkark Page")
	public void user_should_open_Filpkark_Page() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("User should Open Filpkart page");
	}

	@When("User should click on change password")
	public void user_should_click_on_change_password() {
	    // Write code here that turns the phrase above into concrete actions
		  System.out.println("User should click change password");
	}

	@Then("user should should enter old password and new password")
	public void user_should_should_enter_old_password_and_new_password() {
	    // Write code here that turns the phrase above into concrete actions
		  System.out.println("user should should enter old password and new password");

	}

	@Then("user should click change password")
	public void user_should_click_change_password() {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("user shoul click change password");
	}

	@Given("User should open Facebook on browser")	
	public void user_should_open_Facebook_on_browser1() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user should open facebbok browser");
	}

	@When("User should enter vaild username and password")
	public void user_should_enter_vaild_username_and_password() {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(false);
		System.out.println("user should enter vaild username  and password");
	}

	@When("user should click on Login button")
	public void user_should_click_on_Login_button() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user should click on login button");
	}

	@Given("user should open Facebook on browser")
	public void user_should_open_Facebook_on_browser() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user should open faceboook brwoser");
	}

	@When("user should enter invaild user and password")
	public void user_should_enter_invaild_user_and_password() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user should enter invaid user and password");
	}

	@When("user should click on login button")
	public void user_should_click_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user should click on login button");
	}

	@Given("user should click on netbanking")
	public void user_should_click_on_netbanking() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user should click on netbanking");
	}

	@When("user should enter details")
	public void user_should_enter_details() {
	    // Write code here that turns the phrase above into concrete actions
	    	System.out.println("user should enter details");
	}

	@Given("user should click debit card button")
	public void user_should_click_debit_card_button() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("user should click on debit card button");
	}

	@Given("user should click on credit card")
	public void user_should_click_on_credit_card() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user should click on credit card");
	}	
	
	

}
