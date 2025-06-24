package Project;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
public class Activity8 {
	    @Test
	    public void applyLeave() {
	    	
	        // Step a: Open browser and go to login page
	        WebDriver driver = new FirefoxDriver();
	        
	        
	        driver.get("https://alchemy.hguy.co/orangehrm/");
	        
	        // Login using credentials
	        driver.findElement(By.id("txtUsername")).sendKeys("orange");
	        driver.findElement(By.id("txtPassword")).sendKeys("orangepassword123");
	        driver.findElement(By.id("btnLogin")).click();
	        
	        // Step b: Go to Apply Leave page
            driver.findElement(By.id("menu_leave_viewLeaveModule")).click();
	        driver.findElement(By.id("menu_leave_applyLeave")).click();
	        
	        // Step c: Select leave type and duration
	        driver.findElement(By.id("applyleave_txtLeaveType")).sendKeys("Annual Leave");
	        driver.findElement(By.id("applyleave_txtFromDate")).clear();
	        driver.findElement(By.id("applyleave_txtFromDate")).sendKeys("2024-06-25");
	        driver.findElement(By.id("applyleave_txtToDate")).clear();
	        driver.findElement(By.id("applyleave_txtToDate")).sendKeys("2024-06-26");
	        
	        // Step d: Click Apply
	        driver.findElement(By.id("applyBtn")).click();
	        
	        // Step e: Go to My Leave page
	        driver.findElement(By.id("menu_leave_viewMyLeaveList")).click();
	        
	        
	        // Step f: Close browser
	        driver.quit();
	    }
	}

