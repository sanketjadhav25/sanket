package facebook;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pommodule.facebook;

public class fb {
	private WebDriver driver;
	private facebook facebook;
	@Parameters("browser")
	 @BeforeSuite
	 public void beforesuite() {
		 System.out.println("hi");
	 }
	 
	 @BeforeTest
	 public void beforetest() {
			 System.setProperty("webdriver.chrome.driver", "c:\\chromedriver_win32\\chromedriver.exe");
		     driver=new ChromeDriver();
		// if(browser.equals("firefox")) {
		//	System.setProperty("webdriver.gecko.driver","C:\\geckodriver-v0.32.0-win32\\geckodriver.exe");
		//	driver=new FirefoxDriver ();
				
		// }
		
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.manage().window().maximize();
	 }
	 @BeforeClass
	 public void beforeclass() {
		 facebook facebook=new facebook(driver);
	 }
	 
	 
	 @BeforeMethod
	 public void beforemethod() {
		 driver.get("https://www.facebook.com/");
	 }
	 
	 @Test
	 
	 public void test() {
		 facebook.sendKeysemail("jadhavsanket2525@gmail.com");
		 facebook.sendKeyspass("sank25");
		 facebook.clicklogin();
		 
			String actualURL=driver.getCurrentUrl();
			String expectedURL="https://www.facebook.com/";
			
			Assert.assertEquals(actualURL, expectedURL);
			if(actualURL.equals(expectedURL)) {
				System.out.println("pass");
			}
			else {
				System.out.println("fail");

	        }
	 }
			@AfterMethod
			public void aftermethod() {

            }
			@AfterClass
			public void afterclass() {
				
			}
			@AfterTest
			public void aftertest() {
				driver.close();
				driver=null;
				System.gc();
			}

}

