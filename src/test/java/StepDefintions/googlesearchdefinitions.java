package StepDefintions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class googlesearchdefinitions {
	 WebDriver driver;
	@Given("user is on google search page")
	public void user_is_on_google_search_page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
			}



@When("^the user enters the \"(.*)\"$")
public void the_user_enters_the(String bookname) throws Throwable {
	driver.findElement(By.name("q")).sendKeys(bookname);
	Thread.sleep(4000);
}

@And("the user press enter on search button")
public void the_user_click_on_search_button() throws Throwable {
	driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	Thread.sleep(4000);
}

@Then("user navigated to the search result page")
public void user_navigated_to_the_search_result_page() {
    if(driver.getPageSource().contains("Harry Potter - Wikipedia")) {
    	System.out.println("my test passed");
    }
}

@After
public void closeBrowser() {
	driver.close();
}
}

