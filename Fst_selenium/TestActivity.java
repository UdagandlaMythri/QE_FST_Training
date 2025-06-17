package activities;

	
	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.firefox.FirefoxDriver;

	public class TestActivity {
		public static void main(String[] args) {
//			initialize driver
			WebDriver driver=new FirefoxDriver();
			
//			open the browser or page
			driver.get("https://training-support.net/webelements/tables");
			
//			page interactions
//			print the page title
			System.out.println(driver.getTitle());
			
//			Find the number of rows and columns in the table and print them.
			List<WebElement> rows=driver.findElements(By.xpath("//table/tbody/tr"));
			System.out.println(rows.size());
			
			List<WebElement> cols=driver.findElements(By.xpath("//table/thead/tr/th"));
			System.out.println(cols.size());
			
//			find and click the add row button
			driver.findElement(By.xpath("//button[contains(text(),'Add Row')]")).click();
//	      find and edit the newly added row
			String[] dataToAdd= {"10","hover car racer","mathew reilly","0330440160","$7.99"};
			for(int i=0;i<dataToAdd.length;i++) {
				By lastRowCells=By.xpath("//table/tbody/tr[last()]/td["+(i+1)+"]");
				driver.findElement(lastRowCells).clear();
				driver.findElement(lastRowCells).sendKeys(dataToAdd[i]);
				}
//			print the data from the new row
			System.out.println(driver.findElement(By.xpath("//table/tbody/tr[last()]")).getText());
//			close the browser
			driver.quit();
		}
	}

