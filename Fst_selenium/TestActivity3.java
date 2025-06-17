package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestActivity3 {
	public static void main(String[] args) {
//		initialize driver
		WebDriver driver=new FirefoxDriver();
		
//		open the browser or page
		driver.get("https://training-support.net/webelements/login-form/");
		
//		page interactions
//		print the page title
		System.out.println(driver.getTitle());
		
//		find the username and password fields
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("password");
//		find the submit button and click it
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		
//		find the success message
		String message=driver.findElement(By.xpath("//h1[contains(@class,'text-emerald-500')]")).getText();
		System.out.println(message);
		System.out.println(message.equals("Login Success!"));//returns true or false
		
		
//		close the browser
		driver.quit();
	}
}
