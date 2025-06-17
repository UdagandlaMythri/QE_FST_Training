package activities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestActivity13 {
	public static void main(String[] args) {
//		initialize driver
		WebDriver driver=new FirefoxDriver();
		
//		open the browser or page
		driver.get("https://training-support.net/webelements/tables");
		
//		page interactions
//		print the page title
		System.out.println(driver.getTitle());
		
//		Find the number of rows and columns in the table and print them.
		List<WebElement> rows=driver.findElements(By.xpath("//table/tbody/tr"));
		System.out.println(rows.size());
		
		List<WebElement> cols=driver.findElements(By.xpath("//table/thead/tr/th"));
		System.out.println(cols.size());
		
//		Find and print all the cell values in the third row of the table.
		List<WebElement> thirdRow = driver.findElements(By.xpath("//table/tbody/tr[3]/td"));
        for (WebElement cell : thirdRow) {
        	System.out.println(cell.getText());
        }
        System.out.println(driver.findElement(By.xpath("//table/tbody/tr[3]")).getText());
        
//		Find and print the cell value at the second row second column.
        System.out.println(driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]")).getText());
//		close the browser
		driver.quit();
	}
}
