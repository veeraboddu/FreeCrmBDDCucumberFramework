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
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TaggingStepDefinitations2 {

WebDriver driver;

@Given("^user is already on login page tagging$")
public void user_is_already_on_login_page_tagging()  {
	System.out.println("user is already on login page tagging ");
}

@Given("^user is already on login page incorrect tagging$")
public void user_is_already_on_login_page_incorrect_tagging()  {
	System.out.println("user is already on login page incorrect tagging ");
}

@Given("^user on new contact page$")
public void user_on_new_contact_page() {
	System.out.println("user on new contact pag ");
}

@Given("^user is on deals page$")
public void user_is_on_deals_page() {
	System.out.println(" user is on deals page");
}

@Given("^user is on task page$")
public void user_is_on_task_page() {
	System.out.println(" user is on task page");
}

@Given("^user is on call page$")
public void user_is_on_call_page() {
	System.out.println(" user_is_on_call_page()");
}

@Given("^user is on email page$")
public void user_is_on_email_page() {
	System.out.println("user is on email page ");
}



}
