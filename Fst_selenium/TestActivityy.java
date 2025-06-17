package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class TestActivityy {
	public static void main(String[] args) {
//		initialize driver
		WebDriver driver=new FirefoxDriver();
		Actions builder=new Actions(driver);
//		open the browser or page
		driver.get("https://training-support.net/webelements/sliders");
		
//		page interactions
//		print the page title
		System.out.println(driver.getTitle());
		
//	find and print the initial value
		WebElement volumeValue=driver.findElement(By.cssSelector("h1.text-5xl.font-extrabold"));
		System.out.println(volumeValue.getText());
//		find the slider
		WebElement slider=driver.findElement(By.id("volume"));
//		move it to 25%
		builder.moveToElement(slider).clickAndHold(slider).moveByOffset(-120, 0).release().build().perform();
//		print the new value
		System.out.println(volumeValue.getText());
//		move it to 75%
		builder.moveToElement(slider).clickAndHold(slider).moveByOffset(120, 0).release().build().perform();
//		print the new value
		System.out.println(volumeValue.getText());
//		close the browser
		driver.quit();
	}
}
