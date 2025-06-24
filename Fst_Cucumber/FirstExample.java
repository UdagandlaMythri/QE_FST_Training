package stepDefinitions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FirstExample extends BaseClass {
	@Given("the user is on the TS homepage")
	public void openHomepage() {
		// open the TS homepage
		driver.get("https://training-support.net");
	}

	@When("they click on the About us button")
	public void clickAboutLink() {
		// find and click the about us button
		driver.findElement(By.linkText("About Us")).click();
	}

	@Then("they are redirected to the About Us page")
	public void verifyRedirect() {
		// verify about us page title
		assertEquals("About Training Support", driver.getTitle());
	}
}
