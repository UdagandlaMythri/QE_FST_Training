package Project;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class Activity6 {
		WebDriver driver;
		WebDriverWait wait;
		@BeforeClass
		public void startBrowser() {
			driver = new FirefoxDriver();
			wait = new WebDriverWait(driver, Duration.ofSeconds(15));
			// Open the webSite
			driver.get("https://alchemy.hguy.co/orangehrm/symfony/web/index.php/directory/viewDirectory/reset/1");
			// Login
			driver.findElement(By.id("txtUsername")).sendKeys("orange");
			driver.findElement(By.id("txtPassword")).sendKeys("orangepassword123");
			driver.findElement(By.id("btnLogin")).click();
		}
		@Test
		
		public void checkDirectoryPage() {
		    // Wait until Directory menu is clickable
		    WebElement directoryMenu = wait.until(
		        ExpectedConditions.elementToBeClickable(By.id("menu_directory_viewDirectory"))
		    );
		    // Click the Directory menu
		    directoryMenu.click();
		    // Wait for the correct heading to appear
		    Boolean pageHeading = wait.until(
		        ExpectedConditions.textToBePresentInElementLocated(
		            By.xpath("//div[@class='head']/h1"), "Search Directory")
		    );
		    // Assertion
		    Assert.assertTrue(pageHeading," 'Search Directory' heading not found ");
		}
		@AfterClass
		public void closeBrowser() {
			// Close the browser
			driver.quit();
		}
	}








