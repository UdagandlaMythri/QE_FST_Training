package Project;
import org.openqa.selenium.By;
import static org.testng.Assert.assertTrue;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
public class Activity3 {
	    @Test
	    public void loginTest() {	
	        // a. Open the browser and go to OrangeHRM site
	        WebDriver driver = new FirefoxDriver();
	        driver.get("https://alchemy.hguy.co/orangehrm/");
	        
	        // b. Find username and password fields
	        driver.findElement(By.id("txtUsername")).sendKeys("orange"); 
	        
	        // c. Enter password
	        driver.findElement(By.id("txtPassword")).sendKeys("orangepassword123");
	       
	        // d. Click Login button
	        driver.findElement(By.id("btnLogin")).click();
	        
	        // e. Verify homepage by checking if "Dashboard" is in URL or "Welcome" is displayed
	        boolean loggedIn = driver.findElement(By.id("welcome")).isDisplayed();
	        assertTrue(loggedIn, "Login failed or Dashboard not displayed.");
	        
	        // f. Close the browser
	        driver.quit();
	    }
	}

