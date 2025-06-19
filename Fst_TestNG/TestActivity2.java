package Activities;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestActivity2 {
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
			driver.get("https://training-support.net/webelements/target-practice");
		}

		@Test(priority=1)
		public void verifyPageTitle() {
			assertEquals(driver.getTitle(), "Selenium: Target Practice");
		}
		
		@Test(priority=2)
		public void verifyBuutonText() {
//			find the button with black text
			String buttonText=driver.findElement(By.cssSelector("button.bg-slate-200")).getText();//Actual:slate
			assertEquals(buttonText, "Black");
		}
		
		@Test(priority=3,enabled=false)
		public void verifyHeadingText() {
//			find the heading with text Heading #1
			String headingText=driver.findElement(By.tagName("h1")).getText();
			assertEquals(headingText, "Black");
		}
		
		@Test(priority=4)
		public void verifyFooterText() {
			throw new SkipException("this test will be skipped");
////			find the footer text 
//			String footerText=driver.findElement(By.cssSelector("span.text-grey-500")).getText();
//			assertTrue(footerText.contains("CKLABS"));
		}
		

		@AfterClass
		public void tearDown() {
			// close the browser
			driver.quit();
		}
}
