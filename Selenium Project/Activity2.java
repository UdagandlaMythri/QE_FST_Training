package Project;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.time.Duration;
public class Activity2 {
		WebDriver driver;
		WebDriverWait wait;
		@BeforeClass
		public void setup() {
			driver = new FirefoxDriver();
			wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			// Open a browser.
			driver.get("https://alchemy.hguy.co/orangehrm/");
		}
		@Test
		public void printHeaderImageUrl() {
			// Locate the header image by tag or class
			WebElement headerImage = driver.findElement(By.xpath("//div[@id='divLogo']/img"));
			// Get the Url of the header image.
			String imageUrl = headerImage.getAttribute("src");
			// Print the image URL to the report
			Reporter.log(imageUrl);
			// Assertion
			Assert.assertNotNull(imageUrl, "Image URL is null!");
		}
		@AfterClass
		public void tearDown() {
			// Close the browser
			driver.quit();
		}
	}


