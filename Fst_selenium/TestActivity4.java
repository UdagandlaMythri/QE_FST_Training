package activities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.Color;

public class TestActivity4 {
	public static void main(String[] args) {
//		initialize driver
		WebDriver driver=new FirefoxDriver();
		
//		open the browser or page
		driver.get("https://training-support.net/webelements/target-practice");
		
//		page interactions
//		print the page title
		System.out.println(driver.getTitle());
		
//		find 3rd and 5th header
		String thirdheader=driver.findElement(By.xpath("//h3[text()='Heading #3']")).getText();
		System.out.println(thirdheader);
		
//		String fifthheader=driver.findElement(By.xpath("//h5[text()='Heading #5']")).getCssValue("color");
//		System.out.println(fifthheader);   //it gives color in rgb
		
		Color fifthheader=Color.fromString(driver.findElement(By.xpath("//h5[text()='Heading #5']")).getCssValue("color"));
		System.out.println(fifthheader.asHex());
		System.out.println(fifthheader.asRgb());
		
//		find purple and slate button
		String purplebutton=driver.findElement(By.cssSelector("button.bg-purple-200")).getDomAttribute("class");
		System.out.println(purplebutton);
		
		String slatebutton=driver.findElement(By.cssSelector("button.bg-slate-200")).getText();
		System.out.println(slatebutton);
		
		
//	
		
//		close the browser
		driver.quit();
	}

}
