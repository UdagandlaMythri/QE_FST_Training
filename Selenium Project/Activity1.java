package Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

import java.time.Duration;
public class Activity1 {


	public class verifyTitle {
	    WebDriver driver;
	    WebDriverWait wait;
	    @BeforeClass
	    public void setUp() {
	        // Initialize the Firefox driver
	        driver = new FirefoxDriver();
	        
	        // Initialize wait
	        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	        // Open the URL
	        driver.get("https://alchemy.hguy.co/orangehrm/");
	    }

	    @Test
	    public void verifyPageTitle() {
	        // Get the page title
	        String title = driver.getTitle();

	        // Assert that the title is "OrangeHRM"
	        assertEquals(title, "OrangeHRM", "Title does not match");
	    }

	    @AfterClass
	    public void tearDown() {
	        // Close the browser
	        driver.quit();
	    }
	}
}


