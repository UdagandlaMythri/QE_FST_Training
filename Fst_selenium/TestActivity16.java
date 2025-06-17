package activities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TestActivity16 {
	public static void main(String[] args) {
//		initialize driver
		WebDriver driver=new FirefoxDriver();
		
//		open the browser or page
		driver.get("https://training-support.net/webelements/selects");
		
//		page interactions
//		print the page title
		System.out.println(driver.getTitle());

		Select dropdown=new Select(driver.findElement(By.cssSelector("select.h-10")));
		
//		Select the second option using the visible text.
		dropdown.selectByVisibleText("One");
		System.out.println(dropdown.getFirstSelectedOption().getText());
//		Select the third option using the index.
		 dropdown.selectByIndex(2);
		 System.out.println(dropdown.getFirstSelectedOption().getText());
//		Select the fourth option using the value.
		 dropdown.selectByValue("three");
		 System.out.println(dropdown.getFirstSelectedOption().getText());
//		Get all the options and print them to the console.
	     System.out.println("All available options:");
	     for (WebElement option : dropdown.getOptions()) {
	    	 System.out.println(option.getText());
	     }
		
//		close the browser
		driver.quit();
	}
}
