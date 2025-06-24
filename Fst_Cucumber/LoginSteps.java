package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import static org.junit.jupiter.api.Assertions.assertEquals;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps extends BaseClass {
	@Given("User is on the login page")
	public void openLoginPage() {
		// open the login page
		driver.get("https://training-support.net/webelements/login-form");
	}

	@When("they enter the username and password")
	public void enterCreds() {
		// find and enter the username in the username field
		driver.findElement(By.id("username")).sendKeys("admin");
		// find and enter the password in the password field
		driver.findElement(By.id("password")).sendKeys("password");
	}

	@When("they enter the {string} and {string}")
	public void enterCredsParam(String username,String password) {
		// find and enter the username in the username field
		driver.findElement(By.id("username")).sendKeys(username);
		// find and enter the password in the password field
		driver.findElement(By.id("password")).sendKeys(password);
	}

	@And("clicks the submit button")
	public void clickButton() {
		// find and click the submit button
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
	}

	@Then("they should be able to see the success message")
	public void verifyLogin() {
		// wait for the message to load
		String message = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("h1.text-emerald-500"))).getText();
		// Assert the confirmation message
		assertEquals("Login Success!", message);
	}
	
	@Then("they should be able to see the success message {string}")
	public void verifyLoginMessage(String expectedMessage) {
		// wait for the message to load
		String actualMessage = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("h1.text-emerald-500"))).getText();
		// Assert the confirmation message
		assertEquals("Login Success!", actualMessage);
	}
}
