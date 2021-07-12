package stepdefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;

public class StepDefs {

	public Scenario scenario;
	
	@Before
	public void setUp(Scenario s) {
		
		scenario = s;
	}
	@Given("I open the Browser and Navigate to the URL {string}")
	public void i_open_the_browser_and_navigate_to_the_url(String url) {
	    
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.close();
				
	}

}
