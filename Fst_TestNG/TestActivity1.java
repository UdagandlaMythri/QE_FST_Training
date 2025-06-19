package Activities;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestActivity1 {
	// WebDriver declaration
	WebDriver driver;
	// WebDriverwait declaration
	WebDriverWait wait;

	@BeforeClass
	public void setUp() {
		// initialize driver
		driver = new FirefoxDriver();
		// initialize wait
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		// open the page
		driver.get("https://training-support.net");
	}

	@Test(priority=1)
	public void verifyHomePageTitle() {
		assertEquals(driver.getTitle(), "Training Support");
	}
	
	@Test(priority=2)
	public void VerifyAboutPage() {
		//find and click the link
		driver.findElement(By.linkText("About Us")).click();
		//wait till page loads
		wait.until(ExpectedConditions.titleContains("About"));
		//Assertions
		assertEquals(driver.getTitle(),"About Training Support");
	}
	

	@AfterClass
	public void tearDown() {
		// close the browser
		driver.quit();
	}
}
