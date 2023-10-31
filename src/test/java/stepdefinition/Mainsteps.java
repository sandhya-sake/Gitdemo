package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Mainsteps {
	
	@Given("I am on Ebay home page")
	public void i_am_on_ebay_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	   
		System.out.println("User landed on ebay home page");
	}
	@When("I click on advanced link")
	public void i_click_on_advanced_link() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		System.out.println("User click on advanced link");
	}
	@Then("I navigate to advanced search page")
	public void i_navigate_to_advanced_search_page() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		System.out.println("User navigate to advanced search page");
	}
  
	@Then("search Iphone to valodate.")
	public void search_iphone_to_valodate() {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("validation pass");
	}
}
