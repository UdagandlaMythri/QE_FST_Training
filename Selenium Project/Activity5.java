package Project;
import static org.testng.Assert.assertEquals;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class Activity5 {
		WebDriver driver;
//		webDriverWait declaration
		WebDriverWait wait;
		
		@BeforeClass
		public void setup() {
//			Intialize driver
			 driver = new FirefoxDriver();
//			Intialize wait
			 wait = new WebDriverWait(driver,Duration.ofSeconds(30));
			 
//			 open the page
			driver.get("https://alchemy.hguy.co/orangehrm/symfony/web/index.php/pim/viewMyDetails");
		}
		
		 @Test
		    public void editUserInfo() {
		        // Login
		        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("txtUsername"))).sendKeys("orange");
		        driver.findElement(By.id("txtPassword")).sendKeys("orangepassword123");
		        driver.findElement(By.id("btnLogin")).click();

		        // Verify login success by checking page title or some element
		        wait.until(ExpectedConditions.titleContains("OrangeHRM"));
		        assertEquals(driver.getTitle(), "OrangeHRM");

		        // Navigate to "My Info" menu item and click it
		        wait.until(ExpectedConditions.elementToBeClickable(By.id("menu_pim_viewMyDetails"))).click();

		        // Click Edit button
		        WebElement editBtn = wait.until(ExpectedConditions.elementToBeClickable(By.id("btnSave")));
		        editBtn.click();

		        // Fill in Name fields (First, Middle, Last)
		        WebElement firstName = driver.findElement(By.id("personal_txtEmpFirstName"));
		        WebElement middleName = driver.findElement(By.id("personal_txtEmpMiddleName"));
		        WebElement lastName = driver.findElement(By.id("personal_txtEmpLastName"));
		        
		        firstName.clear();
		        firstName.sendKeys("John");
		        middleName.clear();
		        middleName.sendKeys("M");
		        lastName.clear();
		        lastName.sendKeys("Doe");

		        // Select Gender (Male/Female)
		        WebElement genderMale = driver.findElement(By.id("personal_optGender_1"));
		        genderMale.click();

		        // Select Nationality from dropdown
		        Select nationalityDropdown = new Select(driver.findElement(By.id("personal_cmbNation")));
		        nationalityDropdown.selectByVisibleText("American");

		        // Enter Date of Birth (DOB)
		        WebElement dob = driver.findElement(By.id("personal_DOB"));
		        dob.clear();
		        dob.sendKeys("1990-05-20");  // Format YYYY-MM-DD or as per the field requirement

		        // Click Save button
		        driver.findElement(By.id("btnSave")).click();

		     // Click Save button
		        driver.findElement(By.id("btnSave")).click();

		        // Verify the button changed back to "Edit"
		        wait.until(ExpectedConditions.attributeToBe(By.id("btnSave"), "value", "Save"));
		        assertEquals(driver.findElement(By.id("btnSave")).getAttribute("value"), "Save");


		        // Verify first name saved
		        assertEquals(driver.findElement(By.id("personal_txtEmpFirstName")).getAttribute("value"), "John");

		    }

		    @AfterClass
		    public void tearDown() {
		        // Close the browser
		        driver.quit();
		    }
		}

