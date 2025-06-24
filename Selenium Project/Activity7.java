package Project;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity7 {
	public class AddQualificationsTest {
		// WebDriver declaration
		WebDriver driver;
		// WebDriverWait declaration
		WebDriverWait wait;

		@BeforeClass
		public void setUp() {
			// Initialize driver
			driver = new FirefoxDriver();
			// Initialize wait
			wait = new WebDriverWait(driver, Duration.ofSeconds(20));

			// Open the HRM login page
			driver.get("https://alchemy.hguy.co/orangehrm/");

			// Login steps
			driver.findElement(By.id("txtUsername")).sendKeys("orange");
			driver.findElement(By.id("txtPassword")).sendKeys("orangepassword123");
			driver.findElement(By.id("btnLogin")).click();
		}

		@Test
		public void addQualification() {
			// Navigate to My Info -> Qualifications
			wait.until(ExpectedConditions.elementToBeClickable(By.id("menu_pim_viewMyDetails"))).click();
			wait.until(ExpectedConditions.elementToBeClickable(By.id("menu_pim_viewMyDetails"))).click();
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(@href,'viewQualifications')]")))
					.click();

			// Click Add under Work Experience
			wait.until(ExpectedConditions.elementToBeClickable(By.id("addWorkExperience"))).click();

			// Fill out the Work Experience form
			driver.findElement(By.id("experience_employer")).sendKeys("Tech Corp");
			driver.findElement(By.id("experience_jobtitle")).sendKeys("QA Analyst");
			driver.findElement(By.id("experience_from_date")).clear();
			driver.findElement(By.id("experience_from_date")).sendKeys("2022-01-01");
			driver.findElement(By.id("experience_to_date")).clear();
			driver.findElement(By.id("experience_to_date")).sendKeys("2024-01-01");

			// Click Save
			driver.findElement(By.id("btnWorkExpSave")).click();

			// Assertion: verify the entry is displayed in the work experience table
			List<WebElement> rows = driver.findElements(By.xpath("//table/tbody/tr"));

			// Loop through rows and check if "Tech Corp" exists
			for (WebElement row : rows) {
				if (row.getText().contains("Tech Corp")) {
					System.out.println("'Tech Corp' found: " + row.getText());
					assertTrue(row.getText().equals("Tech Corp"));
					return; // exit
				}
			}

		}

		@AfterClass
		public void tearDown() {
			// Close the browser
			driver.quit();
		}
	}

}
