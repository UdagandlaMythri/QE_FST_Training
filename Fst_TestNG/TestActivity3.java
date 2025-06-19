package Activities;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestActivity3 {
	//WebDriver declaration
		WebDriver driver;
		//WebDriverwait declaration
		WebDriverWait wait;
		
		@BeforeClass
		public void setUp() {
			//initialize driver
			driver=new FirefoxDriver();
			//initialize wait
			wait=new WebDriverWait(driver, Duration.ofSeconds(10));
			
			//open the page
			driver.get("https://training-support.net/webelements/login-form");
		}
		
		@Test(priority=1)
		public void verifyPageTitle() {
			assertEquals(driver.getTitle(),"Selenium: Login Form");
		}
		
		//test for unsuccessful login
		@Test(priority=2)
		public void loginFailTest() {
//			find username and password
			driver.findElement(By.id("username")).sendKeys("admin1");
			driver.findElement(By.id("password")).sendKeys("wrongPassword");
			
//			click login
			driver.findElement(By.xpath("//button[text()='Submit']")).click();
			
//			find and print the error message
			String message=driver.findElement(By.id("subheading")).getText();
//			assertions
			assertEquals(message,"Invalid credentials");
		}
		
		//test for successful login
		@Test(priority=3)
		public void successLoginTest() {
//			find username and password
			driver.findElement(By.id("username")).clear();;
			driver.findElement(By.id("username")).sendKeys("admin");
			
			driver.findElement(By.id("password")).clear();
			driver.findElement(By.id("password")).sendKeys("password");
//			click login
			driver.findElement(By.xpath("//button[text()='Submit']")).click();
			//assertions
			String message=wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("h1.text-emerald-500"))).getText();
			assertEquals(message,"Login Success!");
		}
		@AfterClass
		public void tearDown() {
			//close the browser
			driver.quit();
		}
}
