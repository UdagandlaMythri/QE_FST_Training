package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TestActivity17 {
	public static void main(String[] args) {
//		initialize driver
		WebDriver driver=new FirefoxDriver();
		
//		open the browser or page
		driver.get("https://training-support.net/webelements/selects");
		
//		page interactions
//		print the page title
		System.out.println(driver.getTitle());
		
		Select multilist=new Select(driver.findElement(By.cssSelector("select.h-80")));
//		Select the "HTML" option using the visible text.
		multilist.selectByVisibleText("HTML");
//		Select the 4th, 5th and 6th options using the index.
		for(int i=3;i<=5;i++) {
			multilist.selectByIndex(i);
		}
//		Select the "Node" option using the value.
		multilist.selectByValue("nodejs");
//		Deselect the 5th option using index.
		multilist.deselectByIndex(4);
//		print the selected options
		for(WebElement option:multilist.getAllSelectedOptions()) {
			System.out.println(option.getText());
		}
//		close the browser
		driver.quit();
	}
}
