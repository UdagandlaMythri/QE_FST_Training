package activities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class TestActivity6 {
	public static void main(String[] args) {
//		initialize driver
		WebDriver driver=new FirefoxDriver();
		
//		open the browser or page
		driver.get("https://training-support.net/webelements/dynamic-controls");
		
//		page interactions
//		print the page title
		System.out.println(driver.getTitle());
		
//		Find the checkbox input element.
		WebElement checkBox=driver.findElement(By.id("checkbox"));
		

		
		
//		Check if the checkbox is selected and print the result.
		System.out.println(checkBox.isSelected());
		

		
//		Click the checkbox to select it.
		checkBox.click();
		

//		Check if the checkbox is selected and print the result.
		System.out.println(checkBox.isSelected());
		
		
		
		
		
//		close the browser
		driver.quit();
}
}
