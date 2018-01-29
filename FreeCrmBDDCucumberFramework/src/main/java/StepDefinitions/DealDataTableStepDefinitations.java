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

public class DealDataTableStepDefinitations {

WebDriver driver;

@Given("^user is already on login page partFour$")
public void user_is_already_on_login_page_partFour() {
	System.setProperty("webdriver.chrome.driver", "C:\\Gene_Regulatary_Backup\\Java GPRSTest\\Selenium_Driver\\chromedriver_win32\\chromedriver.exe");
	driver= new ChromeDriver();
	driver.get("https://www.freecrm.com/index.html");
	
}

@When("^check title of the page is free crm partFour$")
public void check_title_of_the_page_is_free_crm_partFour() {
	
	String title = driver.getTitle();
	System.out.println(title);
	Assert.assertEquals("#1 Free CRM for Any Business: Online Customer Relationship Software", title);
	
}

@Then("^enter username and password partFour$")
public void enter_username_and_password_partFour(DataTable arg1)  {
	
	List<List<String>> data = arg1.raw();
	driver.findElement(By.name("username")).sendKeys(data.get(0).get(0));
	driver.findElement(By.name("password")).sendKeys(data.get(0).get(1));

 
}

@Then("^click on the login button partFour$")
public void click_on_the_login_button_partFour() {
	
	WebElement loginBtn = driver.findElement(By.xpath("//input[@type='submit']"));
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].click();", loginBtn);
	
}
}
