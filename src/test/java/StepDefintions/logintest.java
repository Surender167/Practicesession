package StepDefintions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class logintest {
	@Given("the user is on the login page")
	public void the_user_is_on_the_login_page() {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("User is on login page");
	}

	/*
	 * @When("user enters username and password") public void
	 * user_enters_username_and_password() { // Write code here that turns the
	 * phrase above into concrete actions
	 * System.out.println("user entered username and password");
	 * 
	 * //System.out.println("i got feature file"+ username +password);
	 */	 
//	@When("user enters {string} and {string}")
	
	@When("^User enters \"(.*)\" and \"(.*)\"$")
	  public void user_enters_and(String username, String password) {
	      System.out.println("i got feature file" + username +password);
	  }

	

	@And("the user clicks on login button")
	public void the_user_clicks_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	 System.out.println("user clicked on loginbutton");
	}

	@Then("user navigates to dashboardpage")
	public void user_navigates_to_dashboardpage() {
	    // Write code here that turns the phrase above into concrete actions
	System.out.println("user navigated to dashboard page");
	}
	

	@When("user logout from appplication")
	public void user_logout_from_appplication() {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("logout from the app");
	}
	@Then("message  displayed as succesfully logout")
	public void message_displayed_as_succesfully_logout() {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("successsfully logout messsage");
	}




}
