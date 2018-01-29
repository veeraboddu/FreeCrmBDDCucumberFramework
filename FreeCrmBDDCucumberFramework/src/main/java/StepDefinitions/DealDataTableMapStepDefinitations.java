package StepDefinitions;

import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DealDataTableMapStepDefinitations {

WebDriver driver;

@Given("^user is already on login page partFive$")
public void user_is_already_on_login_page_partFive() {
	System.setProperty("webdriver.chrome.driver", "C:\\Gene_Regulatary_Backup\\Java GPRSTest\\Selenium_Driver\\chromedriver_win32\\chromedriver.exe");
	driver= new ChromeDriver();
	driver.get("https://www.freecrm.com/index.html");
	
}

@When("^check title of the page is free crm partFive$")
public void check_title_of_the_page_is_free_crm_partFive() {
	
	String title = driver.getTitle();
	System.out.println(title);
	Assert.assertEquals("#1 Free CRM for Any Business: Online Customer Relationship Software", title);
	
}

@Then("^enter username and password partFive$")
public void enter_username_and_password_partFive(DataTable arg1)  {
	
	for(Map<String,String> data : arg1.asMaps(String.class, String.class)){
	driver.findElement(By.name("username")).sendKeys(data.get("username"));
	driver.findElement(By.name("password")).sendKeys(data.get("password"));
	}
 
}

@Then("^click on the login button partFive$")
public void click_on_the_login_button_partFive() {
	
	WebElement loginBtn = driver.findElement(By.xpath("//input[@type='submit']"));
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].click();", loginBtn);
	
}
}
