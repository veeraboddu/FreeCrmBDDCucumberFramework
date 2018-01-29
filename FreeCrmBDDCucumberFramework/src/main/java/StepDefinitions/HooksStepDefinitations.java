package StepDefinitions;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HooksStepDefinitations {
	
	@Before
	public void initialSetUp(){
		
		
	}
	@Before(order=0)
	public void initialSetUp1(){
		
		
	}
	
	@After
	public void after(){
		
		
	}
	@After(order=0)
	public void after1(){
		
		
	}
	@Given("^check user on Login Page$")
	public void check_user_on_Login_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^check title of login page is Free CRM or not$")
	public void check_title_of_login_page_is_Free_CRM_or_not() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^check username and password field$")
	public void check_username_and_password_field() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
}
