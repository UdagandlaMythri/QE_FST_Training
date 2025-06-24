package Project;
import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class Activity4 {
	    WebDriver driver;
	    WebDriverWait wait;

	    @BeforeClass
	    public void setup() {
	        // Initialize driver
	        driver = new FirefoxDriver();
	        // Initialize wait
	        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	        // Open OrangeHRM login page
	        driver.get("https://alchemy.hguy.co/orangehrm");
	    }

	    @Test
	    public void addNewEmployee() {
	        // a. Login
	        driver.findElement(By.id("txtUsername")).sendKeys("orange");
	        driver.findElement(By.id("txtPassword")).sendKeys("orangepassword123");
	        driver.findElement(By.id("btnLogin")).click();

	        // Wait for Dashboard
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("menu_dashboard_index")));

	        // b. Click PIM
	        driver.findElement(By.id("menu_pim_viewPimModule")).click();

	        // c. Click Add Employee
	        wait.until(ExpectedConditions.elementToBeClickable(By.id("menu_pim_addEmployee")));
	        driver.findElement(By.id("menu_pim_addEmployee")).click();

	        // d. Fill in employee details
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("firstName")));
	        driver.findElement(By.id("firstName")).sendKeys("John");
	        driver.findElement(By.id("lastName")).sendKeys("Doe");

	        // Save
	        driver.findElement(By.id("btnSave")).click();

	        // e. Go back to Employee List
	        driver.findElement(By.id("menu_pim_viewEmployeeList")).click();

	        // f. Search for employee
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("empsearch_employee_name_empName")));
	        WebElement searchBox = driver.findElement(By.id("empsearch_employee_name_empName"));
	        searchBox.clear();
	        searchBox.sendKeys("John Doe");

	        WebElement searchButton = driver.findElement(By.id("searchBtn"));
	        //driver.findElement(By.id("searchBtn")).click();

	        // g. Verify that the employee is present in the results
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@id='resultTable']//td/a[contains(text(),'John')]")));
	        WebElement employeeName = driver.findElement(By.xpath("//table[@id='resultTable']//td/a[contains(text(),'John')]"));
	        assertTrue(employeeName.isDisplayed());
	    }

	    @AfterClass
	    public void tearDown() {
	        driver.quit();
	    }
	}

