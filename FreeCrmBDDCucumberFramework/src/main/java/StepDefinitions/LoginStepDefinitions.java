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

public class LoginStepDefinitions {

	WebDriver driver;	

@Given("^user is already on Login Page$")
public void user_is_already_on_Login_Page() {
	System.setProperty("webdriver.chrome.driver", "C:\\Gene_Regulatary_Backup\\Java GPRSTest\\Selenium_Driver\\chromedriver_win32\\chromedriver.exe");
	driver= new ChromeDriver();
	driver.get("https://www.freecrm.com/index.html");
}

@When("^title of login page is Free CRM$")
public void title_of_login_page_is_Free_CRM() {
	
	String title = driver.getTitle();
	System.out.println(title);
	Assert.assertEquals("#1 Free CRM for Any Business: Online Customer Relationship Software", title);
	
}

// Regular expression
  //1. \"([^\"]*)\"
  //2. \"(.*)\"

@Then("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
public void user_enters_and(String arg1, String arg2){
	
	//driver.findElement(By.name("username")).sendKeys("naveenk");
	//driver.findElement(By.name("password")).sendKeys("test@123");
	driver.findElement(By.name("username")).sendKeys(arg1);
	driver.findElement(By.name("password")).sendKeys(arg2);
	
}

@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() {

		WebElement loginBtn = driver.findElement(By.xpath("//input[@type='submit']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", loginBtn);
	}

@Then("^user is on home page$")
public void user_is_on_home_page() {
	String title = driver.getTitle();
	 System.out.println("Home Page title ::"+ title);
//	 Assert.assertEquals("CRMPRO", title);
}

@Then("^Close the browser$")
public void close_the_browser() {
	//driver.quit();
}

}
