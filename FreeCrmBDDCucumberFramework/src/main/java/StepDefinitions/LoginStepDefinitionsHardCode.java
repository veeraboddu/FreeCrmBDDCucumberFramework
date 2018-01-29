package StepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class LoginStepDefinitionsHardCode {
	
	WebDriver driver;
	
	@Given("^user is already in login page$")
	public void user_is_already_in_login_page() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Gene_Regulatary_Backup\\Java GPRSTest\\Selenium_Driver\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.freecrm.com/index.html");
	}

	@When("^Title of the login page is free CRM$")
	public void title_of_the_login_page_is_free_CRM() {
		
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("#1 Free CRM for Any Business: Online Customer Relationship Software", title);
		
	}

	@Then("^User enter username and password$")
	public void user_enter_username_and_password() {
		
		driver.findElement(By.name("username")).sendKeys("naveenk");
		driver.findElement(By.name("password")).sendKeys("test@123");
		
	}

	@Then("^User click the login button$")
	public void user_click_the_login_button() {
		
		WebElement loginBtn = driver.findElement(By.xpath("//input[@type='submit']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", loginBtn);
	}

	@Then("^User enter the home page$")
	public void user_enter_the_home_page() {
		String title = driver.getTitle();
		 System.out.println("Home Page title ::"+ title);
//		 Assert.assertEquals("CRMPRO", title);
	}
	
	@Then("^Close the browser Example2$")
	public void close_the_browser() {
		driver.quit();
	}
}
