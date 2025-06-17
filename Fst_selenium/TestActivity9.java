package activities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class TestActivity9 {
	public static void main(String[] args) {
//		initialize driver
		WebDriver driver=new FirefoxDriver();
		Actions builder=new Actions(driver);
//		open the browser or page
		driver.get("https://training-support.net/webelements/keyboard-events");
		
//		page interactions
//		print the page title
		System.out.println(driver.getTitle());
		
//		On the page, type out a string from the Selenium script to show on the page
		builder.sendKeys("this is some text with 123890").build().perform();
//		Print the message to the console.
		System.out.println(driver.findElement(By.cssSelector("h1.mt-3")).getText());
//		close the browser
		driver.quit();
	}
}
