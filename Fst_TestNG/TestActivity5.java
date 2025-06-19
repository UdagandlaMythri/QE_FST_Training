package Activities;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestActivity5 {
	//WebDriver declaration
		WebDriver driver;
		//WebDriverwait declaration
		WebDriverWait wait;
		
		@BeforeClass(alwaysRun =true)
		public void setUp() {
			//initialize driver
			driver=new FirefoxDriver();
			//initialize wait
			wait=new WebDriverWait(driver, Duration.ofSeconds(10));
			
			//open the page
			driver.get("https://training-support.net/webelements/target-practice");
		}
		@Test(groups= {"HeaderTests","ButtonTests"})
		public void PageTitleTest() {
			String title=driver.getTitle();
			System.out.println("title is:"+title);
			assertEquals(driver.getTitle(),"Selenium: Target Practice");
		}
		
		@Test(groups= {"HeaderTests"})
		public void HeaderTest1() {
//			Find the third header and assert the text in the h3 tag.
		WebElement header3=driver.findElement(By.xpath("//h3[contains(@class,'orange')]"));
		Assert.assertEquals(header3.getText(),"Heading #3");
		}
		
		
		@Test(groups= {"HeaderTests"})
		public void HeaderTest2() {
//		Find and assert the colour of the fifth header tag element.
		Color header5Color=Color.fromString(driver.findElement(By.cssSelector("h5.text-purple-600")).getCssValue("color"));
		Assert.assertEquals(header5Color.asHex(),"#9333ea");
		}
		
		
		@Test(groups= {"ButtonTests"})
		public void buttonTest1() {
//			Find the button with the class emerald and assert it text.
			WebElement button1=driver.findElement(By.xpath("//button[contains(@class,'emerald')]"));
			
			Assert.assertEquals(button1.getText(), "Emerald");
			
//			Find and assert the colour of the first button in the third row.
		}
		
		
		@Test(groups= {"ButtonTests"})
		public void buttonTest2() {
//			Find the button with the class emerald and assert it text.
			Color button2Color=Color.fromString(driver.findElement(By.cssSelector("button.text-purple-900")).getCssValue("color"));
			
			Assert.assertEquals(button2Color.asHex(), "#581c87");
			
//			Find and assert the colour of the first button in the third row.
		}
		@AfterClass(alwaysRun = true)
		public void tearDown() {
			//close the browser
			driver.quit();
		}
}
