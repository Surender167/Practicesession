package StepDefintions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login1test {

	@Given("the user is on homepage")
	public void the_user_is_on_homepage() {

	}

	@When("user navigate to login page")
	public void user_navigate_to_login_page() {

	}

	@And("user enters credentials")
	
	public void user_enters_credentials(io.cucumber.datatable.DataTable dataTable) {
//		List<List<String>> table = dataTable.asLists();
//		System.out.println(table.get(0).get(0));
//		System.out.println(table.get(0).get(1));
		
//		for(logincredentials credential: credentials){
//
//			System.out.println("username:" + credential.getUsername());
//	
//			sop("username:" +credential.getUsername());
//			sop("password:" +credential.getPassword());
//		
//	List<Map<String,String>> table =  dataTable.asMaps();
//	for(Map<String,String> data: dataTable.asMaps())
//	{
//		System.out.println("username:" + data.get("username") + " " + "password:" + data.get("password"));
//		System.out.println("password:" + data.get("password"));
//	}
	
		
//		System.out.println(table.get(0).get("username"));
//	System.out.println(table.get(0).get("password"));
//
//	System.out.println(table.get(1).get("username"));
//	System.out.println(table.get(1).get("password"));


    
	}

	@Then("message displayed login successfully")
	public void message_displayed_login_successfully() {

	}
	}

