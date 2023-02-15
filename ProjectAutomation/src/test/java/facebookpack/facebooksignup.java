package facebookpack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pomModules2.facebooks1;

public class facebooksignup {
private WebDriver driver;
private facebooks1  facebooks1;

		
	
	@Parameters ("browser")
	
	@BeforeSuite
	public void beforesuite() {
		System.out.println("hi");
	}
	
	@BeforeTest
	public void beforetest() {
		 System.setProperty("webdriver.chrome.driver", "c:\\chromedriver_win32\\chromedriver.exe");
		 driver=new ChromeDriver();
		 
		System.setProperty("webdriver.gecko.driver","C:\\geckodriver-v0.32.0-win32\\geckodriver.exe");
		driver=new FirefoxDriver ();
		
		 driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		
	}
	
	@BeforeClass
	public void beforeclass() {
		 facebooks1=new facebooks1(driver);
		
	}
	
	@BeforeMethod
	public void beforemethod() {
		 driver.get("https://www.facebook.com/");
	}
		@Test
		public void test1(){
		
		 
		
         facebooks1.clickcreatenewacc();
		 facebooks1.sendKeysfirstname("sanket");
		 facebooks1.sendKeyslastname("jadhav");
		 facebooks1.sendKeysemail("jadhavsank25@gmail.com");
		 
		 facebooks1.sendKeysreentermail("jadhavsank25@gmail.com");
		 facebooks1.passwordsendKeys("sank@25");
		 facebooks1.sendKeyss("25");
		 facebooks1.sendKeyss1("Mar");;
		 facebooks1.sendKeyss2("1995");
		 facebooks1.clickgender();
		 facebooks1.clicksignup();
		 
		 String actualURL=driver.getCurrentUrl();
		System.out.println(actualURL);
		
		String actualtitle=driver.getTitle();
        System.out.println(actualtitle);
		

	 }
		
		@AfterMethod
		public void aftermethod() {
			
		}

	    @AfterClass
	    public void afterclass() {
	    	facebooks1=null;
		
	    }

	    @AfterTest
	    public void aftertest() {
		driver.close();
		driver=null;
		System.gc();
	   }


	 }

