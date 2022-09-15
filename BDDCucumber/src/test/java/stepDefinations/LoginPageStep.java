package stepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageStep {
	
	

	
	    @Given("User should open browser")
	    public void user_should_open_browser() throws Throwable {
	      System.out.println("a");
	    }
	    @And("hit the url")
	    public void hit_the_url() throws Throwable {
	    	System.out.println("d");
	    }

	    @And("user is on home page")
	    public void user_is_on_home_page() throws Throwable {
	    	System.out.println("e");
	    }


	    @When("user clicks on login")
	    public void user_clicks_on_login() throws Throwable {
	    	System.out.println("b"); 
	    }
	    @And("entered valid username and password")
	    public void entered_valid_username_and_password() throws Throwable {
	    	System.out.println("f");
	    }

	    @And("clicked on login button")
	    public void clicked_on_login_button() throws Throwable {
	    	System.out.println("f");
	    }

	    @Then("user is logged in")
	    public void user_is_logged_in() throws Throwable {
	    	System.out.println("c");
	    }

	   
	   

	}
	


