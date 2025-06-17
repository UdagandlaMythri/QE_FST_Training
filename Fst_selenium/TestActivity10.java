package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class TestActivity10 {
	public static void main(String[] args) {
//		initialize driver
		WebDriver driver=new FirefoxDriver();
		Actions builder=new Actions(driver);
		
//		open the browser or page
		driver.get("https://training-support.net/webelements/drag-drop");
		
//		page interactions
//		print the page title
		System.out.println(driver.getTitle());
		
//		Find the ball and 
		WebElement ball=driver.findElement(By.id("ball"));
		WebElement dropZone1=driver.findElement(By.id("dropzone1"));
		WebElement dropZone2=driver.findElement(By.id("dropzone2"));
		
//		simulate a click and drag to move it into "Dropzone 1".
		builder.dragAndDrop(ball, dropZone1).build().perform();
		
//		Verify that the ball has entered Dropzone 1.
		System.out.println(dropZone1.findElement(By.className("dropzone-text")).getText());
//		Once verified, move the ball into "Dropzone 2".
		builder.clickAndHold(ball).moveToElement(dropZone2).release().build().perform();
//		Verify that the ball has entered Dropzone 2.
		System.out.println(dropZone2.getText());
		
		
//		close the browser
		driver.quit();
	}
}
