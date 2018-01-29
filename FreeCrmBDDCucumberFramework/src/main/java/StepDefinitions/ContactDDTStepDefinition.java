package StepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ContactDDTStepDefinition {

	WebDriver driver;
	
	@Given("^user is already on login page partTHREE$")
	public void user_is_already_on_login_page_partTHREE() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Gene_Regulatary_Backup\\Java GPRSTest\\Selenium_Driver\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.freecrm.com/index.html");
		
	}

	@When("^check title of the page is free crm partTHREE$")
	public void check_title_of_the_page_is_free_crm_partTHREE() {
		
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("#1 Free CRM for Any Business: Online Customer Relationship Software", title);
		
		
	}

	@Then("^enter \"([^\"]*)\" and \"([^\"]*)\" partTHREE$")
	public void enter_and_partTHREE(String arg1, String arg2){
		
		driver.findElement(By.name("username")).sendKeys(arg1);
		driver.findElement(By.name("password")).sendKeys(arg2);
	}

	@Then("^click on the login button partTHREE$")
	public void click_on_the_login_button_partTHREE() {
		
		WebElement loginBtn = driver.findElement(By.xpath("//input[@type='submit']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", loginBtn);
		
	}

	@Then("^check user is on home page partTHREE$")
	public void check_user_is_on_home_page_partTHREE() {
		
		String title = driver.getTitle();
		 System.out.println("Home Page title ::"+ title);
//		 Assert.assertEquals("CRMPRO", title);
	}

	@Then("^user moves to new contact page partTHREE$")
	public void user_moves_to_new_contact_page_partTHREE() {
		driver.switchTo().frame("mainpanel");
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"))).build().perform();
		driver.findElement(By.xpath("//a[contains(text(),'New Contact')]")).click();
	}

	@Then("^enter new contact details \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" partTHREE$")
	public void enter_new_contact_details_and_and_partTHREE(String arg1, String arg2, String arg3) {
		driver.findElement(By.id("first_name")).sendKeys(arg1);
		driver.findElement(By.id("surname")).sendKeys(arg2);
		driver.findElement(By.id("company_position")).sendKeys(arg3);
		driver.findElement(By.xpath("//input[@type='submit' and @value='Save']")).click();
	}

	@Then("^Close the browser partTHREE$")
	public void close_the_browser_partTHREE() {
		//driver.quit();
	}
	
}
