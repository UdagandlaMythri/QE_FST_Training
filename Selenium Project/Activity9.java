package Project;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class Activity9 {
	    WebDriver driver;
	    WebDriverWait wait;
	    @BeforeClass
	    public void setup() {
	        driver = new FirefoxDriver();
	        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	        //open the page
	        driver.get("https://alchemy.hguy.co/orangehrm/");
	        
	        // Login
	        driver.findElement(By.id("txtUsername")).sendKeys("orange");
	        driver.findElement(By.id("txtPassword")).sendKeys("orangepassword123");
	        driver.findElement(By.id("btnLogin")).click();
	    }
	    @Test
	    public void getEmergencyContacts() {
	        // Click on My Info
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("menu_pim_viewMyDetails"))).click();
	        
	        // Click on Emergency Contacts
	        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(@href, 'viewEmergencyContacts')]"))).click();
	        
	        // Wait for table to be visible
	        WebElement table = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("emgcontact_list")));
	        
	        // Get all rows in the table
	        List<WebElement> rows = table.findElements(By.xpath("//tbody/tr"));
	        
	        // Print all rows
	        System.out.println("Emergency Contacts:");
	        for (WebElement row : rows) {
	            System.out.println(row.getText());
	        }
	    }
	    @AfterClass
	    public void tearDown() {
	        driver.quit();
	    }
	}


